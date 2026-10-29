            package p000;

            import android.graphics.drawable.Drawable;
            import com.google.android.material.textfield.TextInputLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v20 extends de0 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f17843e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ v20(TextInputLayout textInputLayout, int i, int i2) {
/* 3 */             super(textInputLayout, i);
/* 1 */             this.f17843e = i2;
                }

                @Override // p000.de0
                /* JADX INFO: renamed from: a */
                public final void mo3010a() {
/* 1 */             int i = this.f17843e;
/* 4 */             TextInputLayout textInputLayout = this.f7137a;
                    switch (i) {
                        case 0:
/* 21 */                    textInputLayout.setEndIconDrawable(this.f7140d);
/* 24 */                    textInputLayout.setEndIconOnClickListener(null);
/* 27 */                    textInputLayout.setEndIconOnLongClickListener(null);
                            break;
                        default:
/* 9 */                     textInputLayout.setEndIconOnClickListener(null);
/* 12 */                    textInputLayout.setEndIconDrawable((Drawable) null);
/* 15 */                    textInputLayout.setEndIconContentDescription((CharSequence) null);
                            break;
                    }
                }
            }
