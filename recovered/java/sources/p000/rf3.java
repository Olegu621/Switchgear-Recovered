            package p000;

            import android.content.Intent;
            import android.os.Bundle;
            import androidx.fragment.app.Fragment;
            import java.io.FileDescriptor;
            import java.io.PrintWriter;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rf3 extends Fragment implements e71 {

                /* JADX INFO: renamed from: b */
                public static final WeakHashMap f16039b = new WeakHashMap();

                /* JADX INFO: renamed from: a */
                public final bx0 f16040a = new bx0();

                @Override // p000.e71
                /* JADX INFO: renamed from: b */
                public final void mo3336b(String str, x61 x61Var) {
/* 3 */             this.f16040a.m1461g(str, x61Var);
                }

                @Override // p000.e71
                /* JADX INFO: renamed from: c */
                public final x61 mo3337c(Class cls, String str) {
/* 15 */            return (x61) cls.cast(((Map) this.f16040a.f2630b).get(str));
                }

                @Override // androidx.fragment.app.Fragment
                public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
/* 1 */             super.dump(str, fileDescriptor, printWriter, strArr);
/* 14 */            Iterator it = ((Map) this.f16040a.f2630b).values().iterator();
/* 22 */            while (it.hasNext()) {
/* 30 */                ((x61) it.next()).dump(str, fileDescriptor, printWriter, strArr);
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final void onActivityResult(int i, int i2, Intent intent) {
/* 1 */             super.onActivityResult(i, i2, intent);
/* 14 */            Iterator it = ((Map) this.f16040a.f2630b).values().iterator();
/* 22 */            while (it.hasNext()) {
/* 30 */                ((x61) it.next()).onActivityResult(i, i2, intent);
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 6 */             this.f16040a.m1462h(bundle);
                }

                @Override // androidx.fragment.app.Fragment
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 5 */             bx0 bx0Var = this.f16040a;
/* 7 */             bx0Var.f2631c = 5;
/* 17 */            Iterator it = ((Map) bx0Var.f2630b).values().iterator();
/* 25 */            while (it.hasNext()) {
/* 33 */                ((x61) it.next()).onDestroy();
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final void onResume() {
/* 1 */             super.onResume();
/* 5 */             bx0 bx0Var = this.f16040a;
/* 7 */             bx0Var.f2631c = 3;
/* 17 */            Iterator it = ((Map) bx0Var.f2630b).values().iterator();
/* 25 */            while (it.hasNext()) {
/* 33 */                ((x61) it.next()).onResume();
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 6 */             this.f16040a.m1463i(bundle);
                }

                @Override // androidx.fragment.app.Fragment
                public final void onStart() {
/* 1 */             super.onStart();
/* 5 */             bx0 bx0Var = this.f16040a;
/* 7 */             bx0Var.f2631c = 2;
/* 17 */            Iterator it = ((Map) bx0Var.f2630b).values().iterator();
/* 25 */            while (it.hasNext()) {
/* 33 */                ((x61) it.next()).onStart();
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final void onStop() {
/* 1 */             super.onStop();
/* 5 */             bx0 bx0Var = this.f16040a;
/* 7 */             bx0Var.f2631c = 4;
/* 17 */            Iterator it = ((Map) bx0Var.f2630b).values().iterator();
/* 25 */            while (it.hasNext()) {
/* 33 */                ((x61) it.next()).onStop();
                    }
                }
            }
