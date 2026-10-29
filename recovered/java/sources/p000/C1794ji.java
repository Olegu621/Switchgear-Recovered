            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.Color;
            import android.graphics.Matrix;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.util.Property;
            import android.widget.ImageView;
            import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
            
            /* JADX INFO: renamed from: ji */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class C1794ji extends Property {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12312a = 2;

                /* JADX INFO: renamed from: b */
                public Object f12313b;

                public C1794ji() {
/* 8 */             super(Matrix.class, "imageMatrixProperty");
/* 16 */            this.f12313b = new Matrix();
                }

                @Override // android.util.Property
                public final Object get(Object obj) {
                    switch (this.f12312a) {
                        case 0:
/* 41 */                    ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
/* 90 */                    return Float.valueOf(AbstractC2246u8.m8970a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f4738t0.getColorForState(extendedFloatingActionButton.getDrawableState(), ((AbstractC1832ki) this.f12313b).f12779b.f4738t0.getDefaultColor()))));
                        case 1:
/* 24 */                    Rect rect = (Rect) this.f12313b;
/* 26 */                    ((Drawable) obj).copyBounds(rect);
/* 37 */                    return new PointF(rect.left, rect.top);
                        default:
/* 10 */                    Matrix matrix = (Matrix) this.f12313b;
/* 16 */                    matrix.set(((ImageView) obj).getImageMatrix());
/* 19 */                    return matrix;
                    }
                }

                @Override // android.util.Property
                public final void set(Object obj, Object obj2) {
                    switch (this.f12312a) {
                        case 0:
/* 44 */                    ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
/* 46 */                    Float f = (Float) obj2;
/* 66 */                    int colorForState = extendedFloatingActionButton.f4738t0.getColorForState(extendedFloatingActionButton.getDrawableState(), ((AbstractC1832ki) this.f12313b).f12779b.f4738t0.getDefaultColor());
/* 105 */                   ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (AbstractC2246u8.m8970a(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
/* 117 */                   if (f.floatValue() != 1.0f) {
/* 125 */                       extendedFloatingActionButton.m2325f(colorStateListValueOf);
                            } else {
/* 121 */                       extendedFloatingActionButton.m2325f(extendedFloatingActionButton.f4738t0);
                            }
                            break;
                        case 1:
/* 14 */                    Drawable drawable = (Drawable) obj;
/* 16 */                    PointF pointF = (PointF) obj2;
/* 20 */                    Rect rect = (Rect) this.f12313b;
/* 22 */                    drawable.copyBounds(rect);
/* 37 */                    rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
/* 40 */                    drawable.setBounds(rect);
                            break;
                        default:
/* 10 */                    ((ImageView) obj).setImageMatrix((Matrix) obj2);
                            break;
                    }
                }

/* 18 */        public /* synthetic */ C1794ji(Class cls, String str) {
                    super(cls, str);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public C1794ji(AbstractC1832ki abstractC1832ki) {
                    super(Float.class, "LABEL_OPACITY_PROPERTY");
/* 20 */            this.f12313b = abstractC1832ki;
                }
            }
