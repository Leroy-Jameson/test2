import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cube

// code here
CSG Base = new Cube(60,50,60).toCSG()
	.toXMin() .toYMin() .toZMin()
CSG Side = new Cube(60,10,10).toCSG() 
	.movex(30) .movey(55) .toZMin()
CSG Up = new Cube(10,10,60).toCSG()
	.toZMin() .toXMin() .movey(55)
CSG Electrical = new Cube(40,5,5).toCSG()
	.movex(35) .movey(55) .movez(12)
CSG SecondElectrical = new Cube(30,3,3).toCSG()
	.movex(32) .movey(55) .movez(15)
CSG OutDoorRoof = new Cube(15,50,2,).toCSG()
	.movex(60) .movey(25) .movez(55)
CSG SecondOutDoorRoof = new Cube(15,50,2).toCSG()
	.movex(60) .movey(25) .movez(45)
CSG ThirdOutDoorRoof = new Cube(15,50,2).toCSG()
	.movex(60) .movey(25) .movez(35)
CSG Building = CSG.unionAll([Base, Side, Up, Electrical, SecondElectrical, OutDoorRoof, SecondOutDoorRoof, ThirdOutDoorRoof])
return CSG.unionAll([Building])
