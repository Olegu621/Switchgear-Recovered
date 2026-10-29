            package androidx.window.layout.adapter.sidecar;

            import android.os.IBinder;
            import androidx.window.sidecar.SidecarDeviceState;
            import androidx.window.sidecar.SidecarInterface;
            import androidx.window.sidecar.SidecarWindowLayoutInfo;
            import java.util.WeakHashMap;
            import kotlin.jvm.internal.Intrinsics;
            import p000.ce2;
            import p000.xd2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

                /* JADX INFO: renamed from: b */
                public SidecarDeviceState f2037b;

                /* JADX INFO: renamed from: d */
                public final ce2 f2039d;

                /* JADX INFO: renamed from: e */
                public final SidecarInterface.SidecarCallback f2040e;

                /* JADX INFO: renamed from: a */
                public final Object f2036a = new Object();

                /* JADX INFO: renamed from: c */
                public final WeakHashMap f2038c = new WeakHashMap();

                public DistinctElementSidecarCallback(ce2 ce2Var, SidecarInterface.SidecarCallback sidecarCallback) {
/* 18 */            this.f2039d = ce2Var;
/* 20 */            this.f2040e = sidecarCallback;
                }

                /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
                
                    if (p000.xd2.m9752b(r2) == p000.xd2.m9752b(r4)) goto L13;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
/* 1 */             if (sidecarDeviceState == null) {
/* 3 */                 return;
                    }
                    synchronized (this.f2036a) {
                        try {
/* 7 */                     ce2 ce2Var = this.f2039d;
/* 9 */                     SidecarDeviceState sidecarDeviceState2 = this.f2037b;
/* 11 */                    ce2Var.getClass();
/* 18 */                    if (!Intrinsics.m6216a(sidecarDeviceState2, sidecarDeviceState)) {
/* 21 */                        if (sidecarDeviceState2 == null) {
                                }
/* 38 */                        this.f2037b = sidecarDeviceState;
/* 42 */                        this.f2040e.onDeviceStateChanged(sidecarDeviceState);
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    boolean zM1642b;
                    synchronized (this.f2036a) {
                        try {
/* 10 */                    SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f2038c.get(iBinder);
/* 14 */                    this.f2039d.getClass();
/* 21 */                    if (Intrinsics.m6216a(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
/* 23 */                        zM1642b = true;
                            } else {
/* 41 */                        zM1642b = (sidecarWindowLayoutInfo2 == null || sidecarWindowLayoutInfo == null) ? false : ce2.m1642b(xd2.m9753c(sidecarWindowLayoutInfo2), xd2.m9753c(sidecarWindowLayoutInfo));
                            }
/* 45 */                    if (zM1642b) {
/* 48 */                        return;
                            }
/* 53 */                    this.f2038c.put(iBinder, sidecarWindowLayoutInfo);
/* 58 */                    this.f2040e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                        } catch (Throwable th) {
/* 64 */                    throw th;
                        }
                    }
                }
            }
