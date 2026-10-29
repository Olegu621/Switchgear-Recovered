            package p000;

            import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
            import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: me */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1924me {

                /* JADX INFO: renamed from: a */
                public final boolean f13704a;

                /* JADX INFO: renamed from: b */
                public final boolean f13705b;

                public C1924me(er0 er0Var, int i) {
/* 1 */             boolean z = true;
                    switch (i) {
                        case 1:
/* 35 */                    er0Var.getClass();
/* 40 */                    ArrayList arrayList = new ArrayList();
/* 55 */                    for (h02 h02Var : (ArrayList) er0Var.f7853b) {
/* 73 */                        if (CaptureIntentPreviewQuirk.class.isAssignableFrom(h02Var.getClass())) {
/* 75 */                            arrayList.add(h02Var);
                                }
                            }
/* 79 */                    Iterator it = arrayList.iterator();
/* 87 */                    while (it.hasNext()) {
/* 99 */                        if (((CaptureIntentPreviewQuirk) it.next()).mo438a()) {
/* 103 */                           this.f13704a = z;
/* 111 */                           this.f13705b = er0Var.m3579d(ImageCaptureFailedForVideoSnapshotQuirk.class);
                                    break;
                                }
                            }
/* 102 */                   z = false;
/* 103 */                   this.f13704a = z;
/* 111 */                   this.f13705b = er0Var.m3579d(ImageCaptureFailedForVideoSnapshotQuirk.class);
                            break;
                        default:
/* 15 */                    this.f13704a = er0Var.m3579d(ImageCaptureFailWithAutoFlashQuirk.class);
/* 29 */                    this.f13705b = f80.f8038a.m3582h(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                            break;
                    }
                }
            }
