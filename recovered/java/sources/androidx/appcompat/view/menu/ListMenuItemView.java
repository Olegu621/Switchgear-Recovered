            package androidx.appcompat.view.menu;

            import android.R;
            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.widget.AbsListView;
            import android.widget.CheckBox;
            import android.widget.CompoundButton;
            import android.widget.ImageView;
            import android.widget.LinearLayout;
            import android.widget.RadioButton;
            import android.widget.TextView;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$id;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.R$string;
            import androidx.appcompat.R$styleable;
            import okhttp3.HttpUrl;
            import p000.ac1;
            import p000.gh1;
            import p000.jg1;
            import p000.sg1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 83 */    public class ListMenuItemView extends LinearLayout implements gh1, AbsListView.SelectionBoundsAdjuster {

                /* JADX INFO: renamed from: U */
                public final Drawable f379U;

                /* JADX INFO: renamed from: V */
                public final int f380V;

                /* JADX INFO: renamed from: W */
                public final Context f381W;

                /* JADX INFO: renamed from: a */
                public sg1 f382a;

                /* JADX INFO: renamed from: a0 */
                public boolean f383a0;

                /* JADX INFO: renamed from: b */
                public ImageView f384b;

                /* JADX INFO: renamed from: b0 */
                public final Drawable f385b0;

                /* JADX INFO: renamed from: c */
                public RadioButton f386c;

                /* JADX INFO: renamed from: c0 */
                public final boolean f387c0;

                /* JADX INFO: renamed from: d */
                public TextView f388d;

                /* JADX INFO: renamed from: d0 */
                public LayoutInflater f389d0;

                /* JADX INFO: renamed from: e */
                public CheckBox f390e;

                /* JADX INFO: renamed from: e0 */
                public boolean f391e0;

                /* JADX INFO: renamed from: f */
                public TextView f392f;

                /* JADX INFO: renamed from: i */
                public ImageView f393i;

                /* JADX INFO: renamed from: v */
                public ImageView f394v;

                /* JADX INFO: renamed from: w */
                public LinearLayout f395w;

                public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet);
/* 10 */            ac1 ac1VarM156H = ac1.m156H(getContext(), attributeSet, R$styleable.MenuView, i);
/* 20 */            this.f379U = ac1VarM156H.m184n(R$styleable.MenuView_android_itemBackground);
/* 22 */            int i2 = R$styleable.MenuView_android_itemTextAppearance;
/* 26 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 33 */            this.f380V = typedArray.getResourceId(i2, -1);
/* 42 */            this.f383a0 = typedArray.getBoolean(R$styleable.MenuView_preserveIconSpacing, false);
/* 44 */            this.f381W = context;
/* 52 */            this.f385b0 = ac1VarM156H.m184n(R$styleable.MenuView_subMenuArrow);
/* 68 */            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, R$attr.dropDownListViewStyle, 0);
/* 76 */            this.f387c0 = typedArrayObtainStyledAttributes.hasValue(0);
/* 78 */            ac1VarM156H.m168J();
/* 81 */            typedArrayObtainStyledAttributes.recycle();
                }

                private LayoutInflater getInflater() {
/* 3 */             if (this.f389d0 == null) {
/* 13 */                this.f389d0 = LayoutInflater.from(getContext());
                    }
/* 15 */            return this.f389d0;
                }

                private void setSubMenuArrowVisible(boolean z) {
/* 1 */             ImageView imageView = this.f393i;
/* 3 */             if (imageView != null) {
/* 11 */                imageView.setVisibility(z ? 0 : 8);
                    }
                }

                @Override // android.widget.AbsListView.SelectionBoundsAdjuster
                public final void adjustListItemSelectionBounds(Rect rect) {
/* 1 */             ImageView imageView = this.f394v;
/* 3 */             if (imageView == null || imageView.getVisibility() != 0) {
/* 36 */                return;
                    }
/* 17 */            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f394v.getLayoutParams();
/* 34 */            rect.top = this.f394v.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
                }

                /* JADX WARN: Code duplicated, block: B:14:0x0035  */
                /* JADX WARN: Code duplicated, block: B:25:0x0053  */
                @Override // p000.gh1
                /* JADX INFO: renamed from: c */
                public final void mo327c(sg1 sg1Var) {
                    boolean z;
                    int i;
                    String string;
/* 1 */             this.f382a = sg1Var;
/* 3 */             boolean zIsVisible = sg1Var.isVisible();
/* 7 */             jg1 jg1Var = sg1Var.f16596n;
/* 17 */            setVisibility(zIsVisible ? 0 : 8);
/* 22 */            setTitle(sg1Var.f16587e);
/* 29 */            setCheckable(sg1Var.isCheckable());
/* 37 */            if (jg1Var.mo4237o()) {
/* 50 */                if ((jg1Var.mo4236n() ? sg1Var.f16592j : sg1Var.f16590h) != 0) {
/* 52 */                    z = true;
                        } else {
/* 54 */                    z = false;
                        }
                    } else {
/* 54 */                z = false;
                    }
/* 55 */            jg1Var.mo4236n();
/* 58 */            if (z) {
/* 60 */                sg1 sg1Var2 = this.f382a;
/* 62 */                jg1 jg1Var2 = sg1Var2.f16596n;
/* 68 */                if (jg1Var2.mo4237o()) {
/* 81 */                    i = (jg1Var2.mo4236n() ? sg1Var2.f16592j : sg1Var2.f16590h) == 0 ? 8 : 0;
                        }
                    }
/* 85 */            if (i == 0) {
/* 87 */                TextView textView = this.f392f;
/* 89 */                sg1 sg1Var3 = this.f382a;
/* 91 */                jg1 jg1Var3 = sg1Var3.f16596n;
/* 93 */                Context context = jg1Var3.f12256a;
/* 104 */               char c = jg1Var3.mo4236n() ? sg1Var3.f16592j : sg1Var3.f16590h;
/* 106 */               if (c == 0) {
/* 108 */                   string = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
/* 112 */                   Resources resources = context.getResources();
/* 118 */                   StringBuilder sb = new StringBuilder();
/* 129 */                   if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
/* 137 */                       sb.append(resources.getString(R$string.abc_prepend_shortcut_label));
                            }
/* 149 */                   int i2 = jg1Var3.mo4236n() ? sg1Var3.f16593k : sg1Var3.f16591i;
/* 159 */                   sg1.m8500c(i2, 65536, resources.getString(R$string.abc_menu_meta_shortcut_label), sb);
/* 170 */                   sg1.m8500c(i2, 4096, resources.getString(R$string.abc_menu_ctrl_shortcut_label), sb);
/* 180 */                   sg1.m8500c(i2, 2, resources.getString(R$string.abc_menu_alt_shortcut_label), sb);
/* 189 */                   sg1.m8500c(i2, 1, resources.getString(R$string.abc_menu_shift_shortcut_label), sb);
/* 199 */                   sg1.m8500c(i2, 4, resources.getString(R$string.abc_menu_sym_shortcut_label), sb);
/* 208 */                   sg1.m8500c(i2, 8, resources.getString(R$string.abc_menu_function_shortcut_label), sb);
/* 211 */                   if (c == '\b') {
/* 251 */                       sb.append(resources.getString(R$string.abc_menu_delete_shortcut_label));
                            } else if (c == '\n') {
/* 241 */                       sb.append(resources.getString(R$string.abc_menu_enter_shortcut_label));
                            } else if (c != ' ') {
/* 221 */                       sb.append(c);
                            } else {
/* 231 */                       sb.append(resources.getString(R$string.abc_menu_space_shortcut_label));
                            }
/* 254 */                   string = sb.toString();
                        }
/* 258 */               textView.setText(string);
                    }
/* 267 */           if (this.f392f.getVisibility() != i) {
/* 271 */               this.f392f.setVisibility(i);
                    }
/* 278 */           setIcon(sg1Var.getIcon());
/* 285 */           setEnabled(sg1Var.isEnabled());
/* 292 */           setSubMenuArrowVisible(sg1Var.hasSubMenu());
/* 297 */           setContentDescription(sg1Var.f16599q);
                }

                @Override // p000.gh1
                public sg1 getItemData() {
/* 1 */             return this.f382a;
                }

                @Override // android.view.View
                public final void onFinishInflate() {
/* 1 */             super.onFinishInflate();
/* 6 */             setBackground(this.f379U);
/* 15 */            TextView textView = (TextView) findViewById(R$id.title);
/* 17 */            this.f388d = textView;
/* 20 */            int i = this.f380V;
/* 22 */            if (i != -1) {
/* 26 */                textView.setTextAppearance(this.f381W, i);
                    }
/* 37 */            this.f392f = (TextView) findViewById(R$id.shortcut);
/* 45 */            ImageView imageView = (ImageView) findViewById(R$id.submenuarrow);
/* 47 */            this.f393i = imageView;
/* 49 */            if (imageView != null) {
/* 53 */                imageView.setImageDrawable(this.f385b0);
                    }
/* 64 */            this.f394v = (ImageView) findViewById(R$id.group_divider);
/* 74 */            this.f395w = (LinearLayout) findViewById(R$id.content);
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 3 */             if (this.f384b != null && this.f383a0) {
/* 9 */                 ViewGroup.LayoutParams layoutParams = getLayoutParams();
/* 19 */                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f384b.getLayoutParams();
/* 21 */                int i3 = layoutParams.height;
/* 23 */                if (i3 > 0 && layoutParams2.width <= 0) {
/* 29 */                    layoutParams2.width = i3;
                        }
                    }
/* 31 */            super.onMeasure(i, i2);
                }

                public void setCheckable(boolean z) {
                    CompoundButton compoundButton;
                    View view;
/* 1 */             if (!z && this.f386c == null && this.f390e == null) {
/* 138 */               return;
                    }
/* 21 */            if ((this.f382a.f16606x & 4) != 0) {
/* 25 */                if (this.f386c == null) {
/* 37 */                    RadioButton radioButton = (RadioButton) getInflater().inflate(R$layout.abc_list_menu_item_radio, (ViewGroup) this, false);
/* 39 */                    this.f386c = radioButton;
/* 41 */                    LinearLayout linearLayout = this.f395w;
/* 43 */                    if (linearLayout != null) {
/* 45 */                        linearLayout.addView(radioButton, -1);
                            } else {
/* 49 */                        addView(radioButton, -1);
                            }
                        }
/* 52 */                compoundButton = this.f386c;
/* 54 */                view = this.f390e;
                    } else {
/* 59 */                if (this.f390e == null) {
/* 71 */                    CheckBox checkBox = (CheckBox) getInflater().inflate(R$layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
/* 73 */                    this.f390e = checkBox;
/* 75 */                    LinearLayout linearLayout2 = this.f395w;
/* 77 */                    if (linearLayout2 != null) {
/* 79 */                        linearLayout2.addView(checkBox, -1);
                            } else {
/* 83 */                        addView(checkBox, -1);
                            }
                        }
/* 86 */                compoundButton = this.f390e;
/* 88 */                view = this.f386c;
                    }
/* 92 */            if (z) {
/* 100 */               compoundButton.setChecked(this.f382a.isChecked());
/* 107 */               if (compoundButton.getVisibility() != 0) {
/* 109 */                   compoundButton.setVisibility(0);
                        }
/* 112 */               if (view == null || view.getVisibility() == 8) {
/* 138 */                   return;
                        }
/* 120 */               view.setVisibility(8);
/* 123 */               return;
                    }
/* 124 */           CheckBox checkBox2 = this.f390e;
/* 126 */           if (checkBox2 != null) {
/* 128 */               checkBox2.setVisibility(8);
                    }
/* 131 */           RadioButton radioButton2 = this.f386c;
/* 133 */           if (radioButton2 != null) {
/* 135 */               radioButton2.setVisibility(8);
                    }
                }

                public void setChecked(boolean z) {
                    CompoundButton compoundButton;
/* 9 */             if ((this.f382a.f16606x & 4) != 0) {
/* 13 */                if (this.f386c == null) {
/* 25 */                    RadioButton radioButton = (RadioButton) getInflater().inflate(R$layout.abc_list_menu_item_radio, (ViewGroup) this, false);
/* 27 */                    this.f386c = radioButton;
/* 29 */                    LinearLayout linearLayout = this.f395w;
/* 31 */                    if (linearLayout != null) {
/* 33 */                        linearLayout.addView(radioButton, -1);
                            } else {
/* 37 */                        addView(radioButton, -1);
                            }
                        }
/* 40 */                compoundButton = this.f386c;
                    } else {
/* 45 */                if (this.f390e == null) {
/* 57 */                    CheckBox checkBox = (CheckBox) getInflater().inflate(R$layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
/* 59 */                    this.f390e = checkBox;
/* 61 */                    LinearLayout linearLayout2 = this.f395w;
/* 63 */                    if (linearLayout2 != null) {
/* 65 */                        linearLayout2.addView(checkBox, -1);
                            } else {
/* 69 */                        addView(checkBox, -1);
                            }
                        }
/* 72 */                compoundButton = this.f390e;
                    }
/* 74 */            compoundButton.setChecked(z);
                }

                public void setForceShowIcon(boolean z) {
/* 1 */             this.f391e0 = z;
/* 3 */             this.f383a0 = z;
                }

                public void setGroupDividerEnabled(boolean z) {
/* 1 */             ImageView imageView = this.f394v;
/* 3 */             if (imageView != null) {
/* 15 */                imageView.setVisibility((this.f387c0 || !z) ? 8 : 0);
                    }
                }

                public void setIcon(Drawable drawable) {
/* 17 */            boolean z = this.f382a.f16596n.f12274s || this.f391e0;
/* 18 */            if (z || this.f383a0) {
/* 25 */                ImageView imageView = this.f384b;
/* 27 */                if (imageView == null && drawable == null && !this.f383a0) {
/* 100 */                   return;
                        }
/* 36 */                if (imageView == null) {
/* 48 */                    ImageView imageView2 = (ImageView) getInflater().inflate(R$layout.abc_list_menu_item_icon, (ViewGroup) this, false);
/* 50 */                    this.f384b = imageView2;
/* 52 */                    LinearLayout linearLayout = this.f395w;
/* 54 */                    if (linearLayout != null) {
/* 56 */                        linearLayout.addView(imageView2, 0);
                            } else {
/* 60 */                        addView(imageView2, 0);
                            }
                        }
/* 63 */                if (drawable == null && !this.f383a0) {
/* 74 */                    this.f384b.setVisibility(8);
/* 77 */                    return;
                        }
/* 78 */                ImageView imageView3 = this.f384b;
/* 80 */                if (!z) {
/* 83 */                    drawable = null;
                        }
/* 84 */                imageView3.setImageDrawable(drawable);
/* 93 */                if (this.f384b.getVisibility() != 0) {
/* 97 */                    this.f384b.setVisibility(0);
                        }
                    }
                }

                public void setTitle(CharSequence charSequence) {
/* 1 */             TextView textView = this.f388d;
/* 3 */             if (charSequence == null) {
/* 29 */                if (textView.getVisibility() != 8) {
/* 33 */                    this.f388d.setVisibility(8);
                        }
                    } else {
/* 5 */                 textView.setText(charSequence);
/* 14 */                if (this.f388d.getVisibility() != 0) {
/* 19 */                    this.f388d.setVisibility(0);
                        }
                    }
                }

/* 84 */        public ListMenuItemView(Context context, AttributeSet attributeSet) {
/* 85 */            this(context, attributeSet, R$attr.listMenuViewStyle);
                }
            }
