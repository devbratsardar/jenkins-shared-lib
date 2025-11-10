def call(String ImgName){
  sh "docker build -t ${ImgName} ."
  echo "Build Image Successfully"
}
