            package p000;

            import android.content.res.Resources;
            import android.graphics.Rect;
            import android.view.SurfaceHolder;
            import android.view.View;
            import android.widget.ImageView;
            import androidx.appcompat.R$dimen;
            import androidx.appcompat.widget.SearchView;
            import com.supercell.titan.GL2JNISurfaceView;
            import com.supercell.titan.GameApp;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mp0 implements View.OnLayoutChangeListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13896a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f13897b;

                public /* synthetic */ mp0(Object obj, int i) {
/* 1 */             this.f13896a = i;
/* 3 */             this.f13897b = obj;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SurfaceHolder surfaceHolder;
                    C1927mh c1927mh;
/* 1 */             int i9 = this.f13896a;
/* 3 */             boolean z = true;
/* 5 */             Object obj = this.f13897b;
                    switch (i9) {
                        case 0:
/* 152 */                   GL2JNISurfaceView gL2JNISurfaceView = (GL2JNISurfaceView) obj;
/* 172 */                   boolean z2 = (!GameApp.isNativeLibraryLoaded() || (surfaceHolder = gL2JNISurfaceView.f5732a) == null || surfaceHolder.getSurface() == null) ? false : true;
/* 184 */                   boolean z3 = gL2JNISurfaceView.f5735d || gL2JNISurfaceView.f5736e;
/* 196 */                   boolean z4 = gL2JNISurfaceView.f5737f || gL2JNISurfaceView.f5738i;
/* 197 */                   if ((i == i5 || i5 == 0) && ((i3 == i7 || i7 == 0) && ((i4 == i8 || i8 == 0) && (i2 == i6 || i6 == 0)))) {
/* 214 */                       z = false;
                            }
/* 215 */                   if (z2) {
/* 217 */                       if (z3 || z4 || z) {
/* 241 */                           GameApp.nOnSurfaceChanged(gL2JNISurfaceView.f5732a.getSurface(), (int) ((i3 - i) * gL2JNISurfaceView.f5733b), (int) ((i4 - i2) * gL2JNISurfaceView.f5734c));
/* 244 */                           gL2JNISurfaceView.f5736e = false;
/* 246 */                           gL2JNISurfaceView.f5738i = false;
                                }
                            }
                            break;
                        case 1:
/* 122 */                   rl1 rl1Var = (rl1) obj;
/* 124 */                   ImageView imageView = rl1Var.f16148V;
/* 130 */                   if (imageView.getVisibility() == 0 && (c1927mh = rl1Var.f16172p0) != null) {
/* 138 */                       Rect rect = new Rect();
/* 141 */                       imageView.getDrawingRect(rect);
/* 144 */                       c1927mh.setBounds(rect);
/* 148 */                       c1927mh.m6653f(imageView, null);
                                break;
                            }
                            break;
                        case 2:
/* 28 */                    SearchView searchView = (SearchView) obj;
/* 30 */                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f612d0;
/* 32 */                    View view2 = searchView.f620l0;
/* 38 */                    if (view2.getWidth() > 1) {
/* 44 */                        Resources resources = searchView.getContext().getResources();
/* 50 */                        int paddingLeft = searchView.f614f0.getPaddingLeft();
/* 56 */                        Rect rect2 = new Rect();
/* 59 */                        boolean z5 = m53.f13568a;
/* 65 */                        z = searchView.getLayoutDirection() == 1;
/* 85 */                        int dimensionPixelSize = searchView.f595A0 ? resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_icon_width) : 0;
/* 91 */                        searchAutoComplete.getDropDownBackground().getPadding(rect2);
/* 94 */                        int i10 = rect2.left;
/* 103 */                       searchAutoComplete.setDropDownHorizontalOffset(z ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
/* 118 */                       searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect2.left) + rect2.right) + dimensionPixelSize) - paddingLeft);
                            }
                            break;
                        default:
/* 10 */                    dq2 dq2Var = (dq2) obj;
/* 13 */                    int[] iArr = new int[2];
/* 15 */                    view.getLocationOnScreen(iArr);
/* 20 */                    dq2Var.f7378t0 = iArr[0];
/* 24 */                    view.getWindowVisibleDisplayFrame(dq2Var.f7372n0);
                            break;
                    }
                }
            }
