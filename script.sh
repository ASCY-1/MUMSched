function gp(){
   git pull
}
function gb(){
   git branch
}

function gac(){
   git add .
   git commit -m"$1"
   git push
}

function gacp() {
    git add .
    git commit -m"$1"
    git push
}

function gs(){
   git status;
}

function cod(){
   git checkout develop
}

function com(){
   git checkout master
}
