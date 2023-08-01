/**
 * 
 */



 function checkEmptyField(fieldId) {
 
 	alert('checkEmptyField '+fieldId);
 	
 }
 
 function validate() {
				var x=document.getElementById('uname').value;
				var y=document.getElementById('upass').value;
				
				console.log('value of x '+x);
				//console.log('value of y '+y);

				if(x =="") {
					//alert('Username cannot be blank');	
					document.getElementById("nameErr").innerHTML="Username cannot be blank";
					return false;
				}		
				
				if(y =="") {
					//alert('Password cannot be blank');	return false
					document.getElementById("passErr").innerHTML="Password cannot be blank";
					return false;
				}			
				return true;
			}	
 
 function clearTheForm() {
				document.getElementById('uname').value="";
				document.getElementById('upass').value="";
				
}

function clearNameErrMsg() {
				document.getElementById('nameErr').innerHTML="";

}
			
function clearPassErrMsg() {
				document.getElementById('passErr').innerHTML="";

}


function validateEmail() {
  const res = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/;
  if(res.test(document.getElementById('uemail').value.toLowerCase())==false){
	  
	alert('Invalid Email Address');
  }
  return res.test(document.getElementById('uemail').value.toLowerCase());
 }
 
 function validateName() {
      const password = document.getElementById('uname').value;

      const lower = /[a-z]/;
      const upper = /[A-Z ]/;
      const number = /[0-9]/;
      const special= /[!@#$%^&*()_+[\]{};':"\\|,.<>?]/;

      const containsLower = lower.test(password);
      const containsUpper = upper.test(password);
      const containsNumber = number.test(password);
      const containsSpecial = special.test(password);

      if ((containsLower || containsUpper )&& !(containsNumber) && !(containsSpecial)) {
        return true;
      } else {
        alert("Enter valid name");
        return false;
      }
    }
 
    function validatePassword() {
      const password = document.getElementById('upass').value;

      const lower = /[a-z]/;
      const upper = /[A-Z]/;
      const number = /[0-9]/;
      const special = /[!@#$%^&*()_+[\]{};':"\\|,.<>?]/;

      const containsLower = lower.test(password);
      const containsUpper = upper.test(password);
      const containsNumber = number.test(password);
      const containsSpecial = special.test(password);

      if (containsLower && containsUpper && containsNumber && containsSpecial) {
        return true;
      } else {
        alert("Password must contain at least one lowercase letter, one uppercase letter, one number, and one special character.");
        return false;
      }
    }
    
     
        function validateAge() {
            var dobInput = document.getElementById('udob').value;
            var dob = new Date(dobInput);
            var today = new Date();

            var age = today.getFullYear() - dob.getFullYear();

            if (today.getMonth() < dob.getMonth() || (today.getMonth() === dob.getMonth() && today.getDate() < dob.getDate())) {
                age--;
            }

            document.getElementById('udob').textContent = "Age: " + age;

            if (age > 18) {
                return true;
            } else {
                alert('You must be 18+');
                return false;
            }
        }
 
