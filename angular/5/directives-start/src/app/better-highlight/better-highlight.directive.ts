import { Directive, Renderer2, OnInit, ElementRef, HostListener , HostBinding, Input} from '@angular/core';

@Directive({
  selector: '[appBetterHighlight]'
})
export class BetterHighlightDirective  implements OnInit{

  constructor(private elRef: ElementRef,  private renderer: Renderer2) { }
@Input() defaultColor :string = 'transparent';
@Input() highLighttColor :string = 'blue';
  @HostBinding('style.backgroundColor') backgroundColor : string ;

  ngOnInit() {
    this.backgroundColor = this.defaultColor;
    //this.renderer.setStyle(this.elRef.nativeElement, 'background-color','blue')
  }

  @HostListener('mouseenter') mouseOver(eventData: Event){
    //this.renderer.setStyle(this.elRef.nativeElement, 'background-color','blue',false,false);
    this.backgroundColor = 'blue';
  }

  @HostListener('mouseleave') mouseLeave(eventData: Event){
   // this.renderer.setStyle(this.elRef.nativeElement, 'background-color','transparent',false,false);
    this.backgroundColor = this.defaultColor;

  }

}
