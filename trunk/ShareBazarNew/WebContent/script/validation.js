function validate()
	{
	
	
	var screenCssPixelRatio = (window.outerWidth - 8) / window.innerWidth;
	if (screenCssPixelRatio >= .46 && screenCssPixelRatio <= .54) {
	  zoomLevel = "-4";
	} else if (screenCssPixelRatio <= .64) {
	  zoomLevel = "-3";
	} else if (screenCssPixelRatio <= .76) {
	  zoomLevel = "-2";
	} else if (screenCssPixelRatio <= .92) {
	  zoomLevel = "-1";
	} else if (screenCssPixelRatio <= 1.10) {
	  zoomLevel = "0";
	} else if (screenCssPixelRatio <= 1.32) {
	  zoomLevel = "1";
	} else if (screenCssPixelRatio <= 1.58) {
	  zoomLevel = "2";
	} else if (screenCssPixelRatio <= 1.90) {
	  zoomLevel = "3";
	} else if (screenCssPixelRatio <= 2.28) {
	  zoomLevel = "4";
	} else if (screenCssPixelRatio <= 2.70) {
	  zoomLevel = "5";
	} else {
	  zoomLevel = "unknown";
	}
	
	}