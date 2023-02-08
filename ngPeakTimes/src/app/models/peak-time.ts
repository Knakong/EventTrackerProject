export class PeakTime {

id : number;
title : string;
createdAt : string | null;
rant: string;
imgurl : string;
disable : boolean;

constructor(id: number = 0, title : string = "untitled", createdAt= "" , rant: string="", imgurl : string ="", disable : boolean = false)
{

  this.id=id;
  this.title=title;
  this.createdAt=createdAt;
  this.rant=rant;
  this.imgurl=imgurl;
  this.disable = disable;


}




}
