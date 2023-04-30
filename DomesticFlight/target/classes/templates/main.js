function changeFirst() {
    var image = document.getElementById('1_img');
    if (image.src.match("1.jpg")) {
        image.src = "images/1a.jpg";
        document.getElementById('author1').innerHTML = "Stephen King";
    } else {
        image.src = "images/1.jpg";
        document.getElementById('author1').innerHTML = "Gerald's Game";
    }
}

function changeSecond() {
    var image = document.getElementById('2_img');
    if (image.src.match("2.jpg")) {
        image.src = "images/2a.jpg";
         document.getElementById('author2').innerHTML = "V. C. Andrews";
    } else {
        image.src = "images/2.jpg";
         document.getElementById('author2').innerHTML = "Flower in the Attic";
    }
}

function changeThird() {
    var image = document.getElementById('3_img');
    if (image.src.match("3.jpg")) {
        image.src = "images/3a.jpg";
         document.getElementById('author3').innerHTML = "Jane Austen";
    } else {
        image.src = "images/3.jpg";
         document.getElementById('author3').innerHTML = "Pride and Prejudice";
    }
}

function mOver(obj) {
  obj.innerHTML = "Book"
}

function mOut(obj) {
  obj.innerHTML = "Author"
}