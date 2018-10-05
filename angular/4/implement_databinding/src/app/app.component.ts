import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  loadFeature = "receipe";

  onNavigate(feature: string)
  {
      this.loadFeature  = feature;
  }
}
