            package p000;

            import android.widget.EditText;
            import androidx.appcompat.widget.SwitchCompat;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class hd0 extends qc0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9016a = 0;

                /* JADX INFO: renamed from: b */
                public final WeakReference f9017b;

                public hd0(EditText editText) {
/* 12 */            this.f9017b = new WeakReference(editText);
                }

                @Override // p000.qc0
                /* JADX INFO: renamed from: a */
                public void mo4175a() {
                    switch (this.f9016a) {
                        case 1:
/* 13 */                    SwitchCompat switchCompat = (SwitchCompat) this.f9017b.get();
/* 15 */                    if (switchCompat != null) {
/* 17 */                        switchCompat.m393c();
                            }
                            break;
                    }
                }

                @Override // p000.qc0
                /* JADX INFO: renamed from: b */
                public final void mo203b() {
/* 1 */             int i = this.f9016a;
/* 3 */             WeakReference weakReference = this.f9017b;
                    switch (i) {
                        case 0:
/* 27 */                    id0.m4518a((EditText) weakReference.get(), 1);
                            break;
                        default:
/* 12 */                    SwitchCompat switchCompat = (SwitchCompat) weakReference.get();
/* 14 */                    if (switchCompat != null) {
/* 16 */                        switchCompat.m393c();
                            }
                            break;
                    }
                }

/* 14 */        public hd0(SwitchCompat switchCompat) {
/* 16 */            this.f9017b = new WeakReference(switchCompat);
                }
            }
