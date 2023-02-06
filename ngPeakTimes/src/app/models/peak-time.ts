export class PeakTime {

id : number;
title : string;
date : string;
rant: string;
imgurl : string;
disable : boolean;

constructor(id: number =1, title : string = "", date: string="", rant: string="", imgurl : string ="", disable : boolean = false)
{

  this.id=id;
  this.title=title;
  this.date=date;
  this.rant=rant;
  this.imgurl=imgurl;
  this.disable = disable;


}




}
