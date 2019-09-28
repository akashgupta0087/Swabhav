export class Ball{
    color:String
    constructor(private id:number){
    }

    get Id(){
        return this.id
    }

    set Color(color:String){
        this.color = color
    }

    get Color(){
        return this.color
    }
}