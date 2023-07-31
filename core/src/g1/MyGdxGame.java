package g1;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.sun.java.swing.ui.WizardDlg;

import java.util.Random;

import jdk.tools.jmod.Main;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture fon, mage, monk, peasant, sniper, spearMan
	
	@Override
	public void create () {

		batch = new SpriteBatch();
		fon = new Texture("fon/"+Fons.values()[new Random().nextInt(Fons.values().length)]+".png");
		wizard = new Texture(internalPath:"pers/Mage.png");
		outlow = new Texture(internalPath:"pers/Monk.png");
		ranger = new Texture(internalPath:"pers/Peasant.png");
		shooter = new Texture(internalPath:"pers/Sniper.png");
		warrior = new Texture(internalPath:"pers/SpearMan.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);

		int x = Gdx.input.getX();
		int y = Gdx.graphics.getHeidth() - Gdx.input.getY();

		batch.begin();
		batch.draw(fon, 0, 0, x - img.getWidth()/2, y - img.getHeidth()/2);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		fon.dispose();
		mage.dispose();
		monk.dispose();
		peasant.dispose();
		sniper.dispose();
		spearMan.dispose();
	}
}
