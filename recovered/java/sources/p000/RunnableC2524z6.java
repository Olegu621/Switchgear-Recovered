            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraDevice;
            import android.os.Bundle;
            import com.supercell.titan.agesignals.AgeSignals;
            
            /* JADX INFO: renamed from: z6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final /* synthetic */ class RunnableC2524z6 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19947a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f19948b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f19949c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f19950d;

                public /* synthetic */ RunnableC2524z6(Object obj, int i, Object obj2, int i2) {
/* 1 */             this.f19947a = i2;
/* 3 */             this.f19949c = obj;
/* 5 */             this.f19948b = i;
/* 7 */             this.f19950d = obj2;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f19947a;
/* 3 */             Object obj = this.f19950d;
/* 5 */             int i2 = this.f19948b;
/* 7 */             Object obj2 = this.f19949c;
                    switch (i) {
                        case 0:
/* 74 */                    int i3 = AgeSignals.MAX_RETRIES;
/* 76 */                    ((AgeSignals) obj2).m2752a((er0) obj, i2);
                            break;
                        case 1:
/* 66 */                    ((AbstractC1934mo) obj2).mo3976c(i2, (xt0) obj);
                            break;
                        case 2:
/* 58 */                    ((AbstractC1934mo) obj2).mo3975b(i2, (InterfaceC2188so) obj);
                            break;
                        case 3:
/* 50 */                    ((CameraCaptureSession.CaptureCallback) ((C0997hn) obj2).f9152b).onCaptureSequenceAborted((CameraCaptureSession) obj, i2);
                            break;
                        case 4:
/* 38 */                    ((CameraDevice.StateCallback) ((C2113qn) obj2).f15665b).onError((CameraDevice) obj, i2);
                            break;
                        case 5:
/* 26 */                    ((fe0) obj2).onGreatestScrollPercentageIncreased(i2, (Bundle) obj);
                            break;
                        default:
/* 18 */                    ((ay1) ((C0922fm) obj2).f8276d).mo1180f(i2, obj);
                            break;
                    }
                }

/* 12 */        public /* synthetic */ RunnableC2524z6(Object obj, Object obj2, int i, int i2) {
/* 13 */            this.f19947a = i2;
                    this.f19949c = obj;
                    this.f19950d = obj2;
                    this.f19948b = i;
                }
            }
