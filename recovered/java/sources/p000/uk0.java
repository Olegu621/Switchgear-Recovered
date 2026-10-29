            package p000;

            import android.content.Context;
            import android.os.Handler;
            import android.view.View;
            import io.flutter.embedding.engine.loader.FlutterLoader;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.android.core.ViewHierarchyEventProcessor;
            import io.sentry.protocol.C1610k0;
            import io.sentry.protocol.C1612l0;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class uk0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17571a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f17572b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f17573c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f17574d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f17575e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Object f17576f;

                public /* synthetic */ uk0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
/* 1 */             this.f17571a = i;
/* 3 */             this.f17572b = obj;
/* 5 */             this.f17573c = obj2;
/* 7 */             this.f17574d = obj3;
/* 9 */             this.f17575e = obj4;
/* 11 */            this.f17576f = obj5;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f17571a;
/* 3 */             Object obj = this.f17576f;
/* 5 */             Object obj2 = this.f17575e;
/* 7 */             Object obj3 = this.f17574d;
/* 9 */             Object obj4 = this.f17573c;
/* 11 */            Object obj5 = this.f17572b;
                    switch (i) {
                        case 0:
/* 1 */                     ((FlutterLoader) obj5).lambda$ensureInitializationCompleteAsync$1((Context) obj4, (String[]) obj3, (Handler) obj2, (Runnable) obj);
                            break;
                        case 1:
/* 1 */                     ((FlutterLoader) obj5).lambda$ensureInitializationCompleteAsync$0((Context) obj4, (String[]) obj3, (Handler) obj2, (Runnable) obj);
                            break;
                        default:
/* 16 */                    AtomicReference atomicReference = (AtomicReference) obj5;
/* 18 */                    View view = (View) obj4;
/* 20 */                    List list = (List) obj3;
/* 22 */                    CountDownLatch countDownLatch = (CountDownLatch) obj2;
/* 24 */                    ILogger iLogger = (ILogger) obj;
                            try {
/* 29 */                        ArrayList arrayList = new ArrayList(1);
/* 36 */                        C1610k0 c1610k0 = new C1610k0("android_view_system", arrayList);
/* 39 */                        C1612l0 c1612l0M4768b = ViewHierarchyEventProcessor.m4768b(view);
/* 43 */                        arrayList.add(c1612l0M4768b);
/* 46 */                        ViewHierarchyEventProcessor.m4767a(view, c1612l0M4768b, list);
/* 49 */                        atomicReference.set(c1610k0);
/* 52 */                        countDownLatch.countDown();
                            } catch (Throwable th) {
/* 61 */                        iLogger.mo4671d(EnumC1553m5.ERROR, "Failed to process view hierarchy.", th);
                            }
                            break;
                    }
                }
            }
