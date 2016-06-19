package com.example.markus.votingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lukas on 24.04.2016.
 */
public class ListView_AdapterGruppe extends BaseExpandableListAdapter {
    private Context ctx;
    private ArrayList<GruppeM> gruppen = new ArrayList<GruppeM>();
    private int childcount = 1;                                                 // da sollt ma die anzahl ändern oder auf je nachdem wieviel mitglieder oder?

    ListView_AdapterGruppe(Context ctx,ArrayList<GruppeM> gruppen){
        this.ctx=ctx;
        this.gruppen = gruppen;
    }

    @Override
    public int getGroupCount() {
        return gruppen.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return gruppen.get(groupPosition).getAnzMitglieder();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return gruppen.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return gruppen.get(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        GruppeM gr = (GruppeM)this.getGroup(groupPosition);
        String grname = gr.getName();
        int granz=gr.getAnzMitglieder();

        if(convertView==null){
            LayoutInflater layoutInflater= (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.groups_head_layout,null);
        }

        ((ImageView) convertView.findViewById(R.id.group_indicator))
                .setImageResource(isExpanded ? R.drawable.ic_keyboard_arrow_up_black_24dp : R.drawable.ic_keyboard_arrow_down_black_24dp);


        TextView gruppenname= (TextView) convertView.findViewById(R.id.tv_gruppenname);
        TextView gruppenanz= (TextView) convertView.findViewById((R.id.tv_anz));
        gruppenname.setText(grname);
        gruppenanz.setText(Integer.toString(granz));

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        GruppeM gr = (GruppeM)this.getChild(groupPosition, childPosition);
        if(convertView==null){
            LayoutInflater layoutInflater= (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =layoutInflater.inflate(R.layout.groups_layout,null);
        }


        TextView vorname = (TextView) convertView.findViewById(R.id.tv_vorname);
        TextView nachname = (TextView) convertView.findViewById(R.id.tv_nachname);


        vorname.setText( gr.getMitglieder().get(childPosition).getVorname());
        nachname.setText(gr.getMitglieder().get(childPosition).getNachname());

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
