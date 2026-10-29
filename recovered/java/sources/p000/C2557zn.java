            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import android.util.Size;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            
            /* JADX INFO: renamed from: zn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2557zn implements InterfaceC2469xp {

                /* JADX INFO: renamed from: a */
                public final String f20267a;

                /* JADX INFO: renamed from: b */
                public final C0962gp f20268b;

                /* JADX INFO: renamed from: c */
                public final qc3 f20269c;

                /* JADX INFO: renamed from: d */
                public final Object f20270d = new Object();

                /* JADX INFO: renamed from: e */
                public final C2504yn f20271e;

                /* JADX INFO: renamed from: f */
                public final er0 f20272f;

                public C2557zn(C0816cq c0816cq, String str) {
/* 11 */            str.getClass();
/* 14 */            this.f20267a = str;
/* 16 */            C0962gp c0962gpM2831b = c0816cq.m2831b(str);
/* 20 */            this.f20268b = c0962gpM2831b;
/* 26 */            qc3 qc3Var = new qc3(13);
/* 29 */            qc3Var.f15492b = this;
/* 31 */            this.f20269c = qc3Var;
/* 37 */            this.f20272f = de3.m3031m(c0962gpM2831b);
/* 41 */            new HashMap();
                    try {
/* 44 */                Integer.parseInt(str);
                    } catch (NumberFormatException unused) {
/* 69 */                hu0.m4315H0("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
                    }
/* 84 */            this.f20271e = new C2504yn(new C0878ef(5, null));
                }

                @Override // p000.InterfaceC2469xp
                /* JADX INFO: renamed from: a */
                public final int mo309a() {
/* 2 */             return mo313e(0);
                }

                @Override // p000.InterfaceC2469xp
                /* JADX INFO: renamed from: b */
                public final String mo310b() {
/* 1 */             return this.f20267a;
                }

                @Override // p000.InterfaceC2469xp
                /* JADX INFO: renamed from: d */
                public final int mo312d() {
/* 9 */             Integer num = (Integer) this.f20268b.m3981a(CameraCharacteristics.LENS_FACING);
/* 20 */            de3.m3023e("Unable to get the lens facing of the camera.", num != null);
/* 23 */            int iIntValue = num.intValue();
/* 27 */            if (iIntValue == 0) {
/* 11 */                return 0;
                    }
/* 29 */            if (iIntValue == 1) {
/* 12 */                return 1;
                    }
/* 32 */            if (iIntValue == 2) {
/* 31 */                return 2;
                    }
/* 43 */            C1951n4.m6859j(AbstractC0886en.m3505i(iIntValue, "The given lens facing integer: ", " can not be recognized."));
/* 46 */            return 0;
                }

                @Override // p000.InterfaceC2469xp
                /* JADX INFO: renamed from: e */
                public final int mo313e(int i) {
/* 9 */             Integer num = (Integer) this.f20268b.m3981a(CameraCharacteristics.SENSOR_ORIENTATION);
/* 11 */            num.getClass();
/* 31 */            return xe2.m9783u(xe2.m9763G(i), num.intValue(), 1 == mo312d());
                }

                @Override // p000.InterfaceC2469xp
                /* JADX INFO: renamed from: f */
                public final er0 mo314f() {
/* 1 */             return this.f20272f;
                }

                @Override // p000.InterfaceC2469xp
                /* JADX INFO: renamed from: g */
                public final List mo315g(int i) {
/* 7 */             Size[] sizeArrM188r = this.f20268b.m3982b().m188r(i);
                    return sizeArrM188r != null ? Arrays.asList(sizeArrM188r) : Collections.EMPTY_LIST;
                }
            }
