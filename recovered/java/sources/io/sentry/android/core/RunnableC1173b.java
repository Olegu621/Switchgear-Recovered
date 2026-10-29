            package io.sentry.android.core;

            import android.app.Activity;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.util.SparseIntArray;
            import androidx.core.app.FrameMetricsAggregator;
            import io.sentry.util.C1708g;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import p000.sn0;
            import p000.ur3;
            
            /* JADX INFO: renamed from: io.sentry.android.core.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1173b implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9963a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1181d f9964b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Activity f9965c;

                public /* synthetic */ RunnableC1173b(C1181d c1181d, Activity activity, int i) {
/* 1 */             this.f9963a = i;
/* 3 */             this.f9964b = c1181d;
/* 5 */             this.f9965c = activity;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f9963a;
/* 3 */             Activity activity = this.f9965c;
/* 5 */             C1181d c1181d = this.f9964b;
                    switch (i) {
                        case 0:
/* 73 */                    ur3 ur3Var = ((FrameMetricsAggregator) ((C1708g) c1181d.f9984a).m5471a()).f1234a;
/* 75 */                    ur3Var.getClass();
/* 80 */                    if (ur3.f17701f == null) {
/* 86 */                        HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
/* 89 */                        ur3.f17701f = handlerThread;
/* 91 */                        handlerThread.start();
/* 105 */                       ur3.f17702i = new Handler(ur3.f17701f.getLooper());
                            }
/* 110 */                   for (int i2 = 0; i2 <= 8; i2++) {
/* 114 */                       SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) ur3Var.f17704b;
/* 118 */                       if (sparseIntArrayArr[i2] == null && (ur3Var.f17703a & (1 << i2)) != 0) {
/* 132 */                           sparseIntArrayArr[i2] = new SparseIntArray();
                                }
                            }
/* 147 */                   activity.getWindow().addOnFrameMetricsAvailableListener((sn0) ur3Var.f17706d, ur3.f17702i);
/* 159 */                   ((ArrayList) ur3Var.f17705c).add(new WeakReference(activity));
                            break;
                        default:
/* 20 */                    ur3 ur3Var2 = ((FrameMetricsAggregator) ((C1708g) c1181d.f9984a).m5471a()).f1234a;
/* 24 */                    ArrayList<WeakReference> arrayList = (ArrayList) ur3Var2.f17705c;
/* 34 */                    for (WeakReference weakReference : arrayList) {
/* 46 */                        if (weakReference.get() == activity) {
/* 48 */                            arrayList.remove(weakReference);
/* 59 */                            activity.getWindow().removeOnFrameMetricsAvailableListener((sn0) ur3Var2.f17706d);
                                    break;
                                }
                            }
/* 59 */                    activity.getWindow().removeOnFrameMetricsAvailableListener((sn0) ur3Var2.f17706d);
                            break;
                    }
                }
            }
