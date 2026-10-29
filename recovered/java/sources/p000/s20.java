            package p000;

            import android.database.Cursor;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.BaseAdapter;
            import android.widget.Filter;
            import android.widget.Filterable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class s20 extends BaseAdapter implements Filterable {

                /* JADX INFO: renamed from: a */
                public boolean f16387a;

                /* JADX INFO: renamed from: b */
                public boolean f16388b;

                /* JADX INFO: renamed from: c */
                public Cursor f16389c;

                /* JADX INFO: renamed from: d */
                public int f16390d;

                /* JADX INFO: renamed from: e */
                public q20 f16391e;

                /* JADX INFO: renamed from: f */
                public r20 f16392f;

                /* JADX INFO: renamed from: i */
                public t20 f16393i;

                /* JADX INFO: renamed from: a */
                public abstract void mo6986a(View view, Cursor cursor);

                /* JADX INFO: renamed from: b */
                public void mo6987b(Cursor cursor) {
/* 1 */             Cursor cursor2 = this.f16389c;
/* 3 */             if (cursor == cursor2) {
/* 5 */                 cursor2 = null;
                    } else {
/* 7 */                 if (cursor2 != null) {
/* 9 */                     q20 q20Var = this.f16391e;
/* 11 */                    if (q20Var != null) {
/* 13 */                        cursor2.unregisterContentObserver(q20Var);
                            }
/* 16 */                    r20 r20Var = this.f16392f;
/* 18 */                    if (r20Var != null) {
/* 20 */                        cursor2.unregisterDataSetObserver(r20Var);
                            }
                        }
/* 23 */                this.f16389c = cursor;
/* 25 */                if (cursor != null) {
/* 27 */                    q20 q20Var2 = this.f16391e;
/* 29 */                    if (q20Var2 != null) {
/* 31 */                        cursor.registerContentObserver(q20Var2);
                            }
/* 34 */                    r20 r20Var2 = this.f16392f;
/* 36 */                    if (r20Var2 != null) {
/* 38 */                        cursor.registerDataSetObserver(r20Var2);
                            }
/* 47 */                    this.f16390d = cursor.getColumnIndexOrThrow("_id");
/* 50 */                    this.f16387a = true;
/* 52 */                    notifyDataSetChanged();
                        } else {
/* 57 */                    this.f16390d = -1;
/* 60 */                    this.f16387a = false;
/* 62 */                    notifyDataSetInvalidated();
                        }
                    }
/* 65 */            if (cursor2 != null) {
/* 67 */                cursor2.close();
                    }
                }

                /* JADX INFO: renamed from: c */
                public abstract String mo6988c(Cursor cursor);

                /* JADX INFO: renamed from: d */
                public abstract View mo6989d(ViewGroup viewGroup);

                @Override // android.widget.Adapter
                public final int getCount() {
                    Cursor cursor;
/* 3 */             if (!this.f16387a || (cursor = this.f16389c) == null) {
/* 14 */                return 0;
                    }
/* 9 */             return cursor.getCount();
                }

                @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
                public View getDropDownView(int i, View view, ViewGroup viewGroup) {
/* 3 */             if (!this.f16387a) {
/* 30 */                return null;
                    }
/* 7 */             this.f16389c.moveToPosition(i);
/* 10 */            if (view == null) {
/* 13 */                ni2 ni2Var = (ni2) this;
/* 20 */                view = ni2Var.f14277U.inflate(ni2Var.f14292w, viewGroup, false);
                    }
/* 26 */            mo6986a(view, this.f16389c);
/* 29 */            return view;
                }

                @Override // android.widget.Filterable
                public final Filter getFilter() {
/* 3 */             if (this.f16393i == null) {
/* 7 */                 t20 t20Var = new t20();
/* 10 */                t20Var.f16898a = this;
/* 12 */                this.f16393i = t20Var;
                    }
/* 14 */            return this.f16393i;
                }

                @Override // android.widget.Adapter
                public final Object getItem(int i) {
                    Cursor cursor;
/* 3 */             if (!this.f16387a || (cursor = this.f16389c) == null) {
/* 15 */                return null;
                    }
/* 9 */             cursor.moveToPosition(i);
/* 12 */            return this.f16389c;
                }

                @Override // android.widget.Adapter
                public final long getItemId(int i) {
                    Cursor cursor;
/* 5 */             if (this.f16387a && (cursor = this.f16389c) != null && cursor.moveToPosition(i)) {
/* 21 */                return this.f16389c.getLong(this.f16390d);
                    }
/* 3 */             return 0L;
                }

                @Override // android.widget.Adapter
                public View getView(int i, View view, ViewGroup viewGroup) {
/* 4 */             if (!this.f16387a) {
/* 38 */                f42.m3656l("this should only be called when the cursor is valid");
/* 3 */                 return null;
                    }
/* 12 */            if (!this.f16389c.moveToPosition(i)) {
/* 32 */                f42.m3656l(fm0.m3781g(i, "couldn't move cursor to position "));
/* 3 */                 return null;
                    }
/* 14 */            if (view == null) {
/* 16 */                view = mo6989d(viewGroup);
                    }
/* 22 */            mo6986a(view, this.f16389c);
/* 25 */            return view;
                }
            }
