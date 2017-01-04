package com.webteq.musical;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ScreenSlidePageFragmentOne extends Fragment implements View.OnClickListener {

    private ImageButton bagPipe,banjo,bassDrum,clarinet,drumSet;
    private ImageView imageView;
    private TextView textView;
    private SoundMediaPlayer soundPlayer;
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_one, container, false);

        bagPipe = (ImageButton) rootView.findViewById(R.id.bagPipes);
        banjo = (ImageButton) rootView.findViewById(R.id.banjo);
        bassDrum = (ImageButton) rootView.findViewById(R.id.bassDrum);
        clarinet = (ImageButton) rootView.findViewById(R.id.clarinet);
        drumSet = (ImageButton) rootView.findViewById(R.id.drumSet);

        bagPipe.setOnClickListener(this);
        banjo.setOnClickListener(this);
        bassDrum.setOnClickListener(this);
        clarinet.setOnClickListener(this);
        drumSet.setOnClickListener(this);

        return rootView;
    }


    @Override
    public void onClick(View v) {
        Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.fragment_play_sound);
        final ImageView imageView = (ImageView) dialog.findViewById(R.id.imageClip);
        final TextView textCaption = (TextView) dialog.findViewById(R.id.caption);

        switch (v.getId()){
            case R.id.bagPipes:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.bagpipe_clipart));
                soundPlayer = new SoundMediaPlayer(getContext(),R.raw.bagpipes_sound);
                break;
            case R.id.banjo:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.banjo_clipart));
                soundPlayer = new SoundMediaPlayer(getContext(),R.raw.banjo_sound);
                break;
        }

        final ImageButton play = (ImageButton) dialog.findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayer.play();
                play.setEnabled(false);
            }
        });

        final ImageButton stop = (ImageButton) dialog.findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayer.stop();
                play.setEnabled(true);
            }
        });

        final ImageButton pause = (ImageButton) dialog.findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayer.pause();
                play.setEnabled(true);
            }
        });

        dialog.setCanceledOnTouchOutside(true);
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                soundPlayer.stop();
            }
        });

        dialog.show();
    }
}
