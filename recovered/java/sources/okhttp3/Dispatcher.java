            package okhttp3;

            import androidx.core.app.NotificationCompat;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Deque;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.SynchronousQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.internal.Util;
            import okhttp3.internal.connection.RealCall;
            import p000.AbstractC0208c9;
            import p000.C2122qw;
            import p000.ds0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0019\u0010 \u001a\u00020\u001f2\n\u0010!\u001a\u00060\u001aR\u00020\u001bH\u0000¢\u0006\u0002\b\"J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001bH\u0000¢\u0006\u0002\b$J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b%J\u0016\u0010&\u001a\b\u0018\u00010\u001aR\u00020\u001b2\u0006\u0010'\u001a\u00020(H\u0002J)\u0010)\u001a\u00020\u001f\"\u0004\b\u0000\u0010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H*0,2\u0006\u0010!\u001a\u0002H*H\u0002¢\u0006\u0002\u0010-J\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001bH\u0000¢\u0006\u0002\b.J\u0019\u0010)\u001a\u00020\u001f2\n\u0010!\u001a\u00060\u001aR\u00020\u001bH\u0000¢\u0006\u0002\b.J\b\u0010/\u001a\u000200H\u0002J\f\u00101\u001a\b\u0012\u0004\u0012\u00020302J\u0006\u00104\u001a\u00020\u0010J\f\u00105\u001a\b\u0012\u0004\u0012\u00020302J\u0006\u00106\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u001aR\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u00060\u001aR\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m6176d2 = {"Lokhttp3/Dispatcher;", HttpUrl.FRAGMENT_ENCODE_SET, "executorService", "Ljava/util/concurrent/ExecutorService;", "(Ljava/util/concurrent/ExecutorService;)V", "()V", "()Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "<set-?>", "Ljava/lang/Runnable;", "idleCallback", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "maxRequests", HttpUrl.FRAGMENT_ENCODE_SET, "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "readyAsyncCalls", "Ljava/util/ArrayDeque;", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "runningAsyncCalls", "runningSyncCalls", "cancelAll", HttpUrl.FRAGMENT_ENCODE_SET, "enqueue", NotificationCompat.CATEGORY_CALL, "enqueue$okhttp", "executed", "executed$okhttp", "-deprecated_executorService", "findExistingCallWithHost", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, HttpUrl.FRAGMENT_ENCODE_SET, "finished", "T", "calls", "Ljava/util/Deque;", "(Ljava/util/Deque;Ljava/lang/Object;)V", "finished$okhttp", "promoteAndExecute", HttpUrl.FRAGMENT_ENCODE_SET, "queuedCalls", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Call;", "queuedCallsCount", "runningCalls", "runningCallsCount", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 15 */    public final class Dispatcher {
                private ExecutorService executorServiceOrNull;
                private Runnable idleCallback;
                private int maxRequests;
                private int maxRequestsPerHost;
                private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
                private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
                private final ArrayDeque<RealCall> runningSyncCalls;

                public Dispatcher() {
/* 6 */             this.maxRequests = 64;
/* 9 */             this.maxRequestsPerHost = 5;
/* 16 */            this.readyAsyncCalls = new ArrayDeque<>();
/* 23 */            this.runningAsyncCalls = new ArrayDeque<>();
/* 30 */            this.runningSyncCalls = new ArrayDeque<>();
                }

                private final RealCall.AsyncCall findExistingCallWithHost(String host) {
/* 11 */            for (RealCall.AsyncCall asyncCall : this.runningAsyncCalls) {
/* 27 */                if (Intrinsics.m6216a(asyncCall.getHost(), host)) {
/* 29 */                    return asyncCall;
                        }
                    }
/* 40 */            for (RealCall.AsyncCall asyncCall2 : this.readyAsyncCalls) {
/* 56 */                if (Intrinsics.m6216a(asyncCall2.getHost(), host)) {
/* 58 */                    return asyncCall2;
                        }
                    }
/* 59 */            return null;
                }

                private final <T> void finished(Deque<T> calls, T call) {
                    Runnable idleCallback;
                    synchronized (this) {
/* 6 */                 if (!calls.remove(call)) {
/* 34 */                    throw new AssertionError("Call wasn't in-flight!");
                        }
/* 8 */                 idleCallback = getIdleCallback();
                    }
/* 17 */            if (promoteAndExecute() || idleCallback == null) {
/* 24 */                return;
                    }
/* 21 */            idleCallback.run();
                }

                private final boolean promoteAndExecute() {
                    boolean z;
/* 4 */             if (Util.assertionsEnabled && Thread.holdsLock(this)) {
/* 23 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
/* 3 */                 return false;
                    }
/* 29 */            ArrayList arrayList = new ArrayList();
                    synchronized (this) {
                        try {
/* 35 */                    Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
/* 39 */                    it.getClass();
/* 46 */                    while (it.hasNext()) {
/* 48 */                        RealCall.AsyncCall next = it.next();
/* 64 */                        if (this.runningAsyncCalls.size() >= getMaxRequests()) {
                                    break;
                                }
/* 79 */                        if (next.getCallsPerHost().get() < getMaxRequestsPerHost()) {
/* 82 */                            it.remove();
/* 89 */                            next.getCallsPerHost().incrementAndGet();
/* 92 */                            arrayList.add(next);
/* 97 */                            this.runningAsyncCalls.add(next);
                                }
                            }
/* 111 */                   z = runningCallsCount() > 0;
                        } catch (Throwable th) {
/* 138 */                   throw th;
                        }
                    }
/* 113 */           int size = arrayList.size();
/* 117 */           for (int i = 0; i < size; i++) {
/* 131 */               ((RealCall.AsyncCall) arrayList.get(i)).executeOn(executorService());
                    }
/* 136 */           return z;
                }

                /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
                public final ExecutorService m10539deprecated_executorService() {
/* 1 */             return executorService();
                }

                public final synchronized void cancelAll() {
                    try {
/* 4 */                 Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
/* 12 */                while (it.hasNext()) {
/* 24 */                    it.next().getThis$0().cancel();
                        }
/* 32 */                Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
/* 40 */                while (it2.hasNext()) {
/* 52 */                    it2.next().getThis$0().cancel();
                        }
/* 58 */                Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
/* 66 */                while (it3.hasNext()) {
/* 74 */                    it3.next().cancel();
                        }
                    } catch (Throwable th) {
/* 81 */                throw th;
                    }
                }

                public final void enqueue$okhttp(RealCall.AsyncCall call) {
                    RealCall.AsyncCall asyncCallFindExistingCallWithHost;
/* 1 */             call.getClass();
                    synchronized (this) {
/* 7 */                 this.readyAsyncCalls.add(call);
/* 18 */                if (!call.getThis$0().getForWebSocket() && (asyncCallFindExistingCallWithHost = findExistingCallWithHost(call.getHost())) != null) {
/* 30 */                    call.reuseCallsPerHostFrom(asyncCallFindExistingCallWithHost);
                        }
                    }
/* 37 */            promoteAndExecute();
                }

                public final synchronized void executed$okhttp(RealCall call) {
/* 2 */             call.getClass();
/* 7 */             this.runningSyncCalls.add(call);
                }

                public final synchronized ExecutorService executorService() {
                    ExecutorService executorService;
                    try {
/* 4 */                 if (this.executorServiceOrNull == null) {
/* 37 */                    this.executorServiceOrNull = new ThreadPoolExecutor(0, AbstractC0208c9.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(Intrinsics.m6219d(" Dispatcher", Util.okHttpName), false));
                        }
/* 42 */                executorService = this.executorServiceOrNull;
/* 44 */                executorService.getClass();
                    } catch (Throwable th) {
/* 50 */                throw th;
                    }
/* 48 */            return executorService;
                }

                public final void finished$okhttp(RealCall.AsyncCall call) {
/* 1 */             call.getClass();
/* 8 */             call.getCallsPerHost().decrementAndGet();
/* 13 */            finished(this.runningAsyncCalls, call);
                }

                public final synchronized Runnable getIdleCallback() {
/* 2 */             return this.idleCallback;
                }

                public final synchronized int getMaxRequests() {
/* 2 */             return this.maxRequests;
                }

                public final synchronized int getMaxRequestsPerHost() {
/* 2 */             return this.maxRequestsPerHost;
                }

                public final synchronized List<Call> queuedCalls() {
                    List<Call> listUnmodifiableList;
                    try {
/* 2 */                 ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
/* 12 */                ArrayList arrayList = new ArrayList(C2122qw.m8020h(arrayDeque, 10));
/* 15 */                Iterator<T> it = arrayDeque.iterator();
/* 23 */                while (it.hasNext()) {
/* 35 */                    arrayList.add(((RealCall.AsyncCall) it.next()).getThis$0());
                        }
/* 41 */                listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 45 */                listUnmodifiableList.getClass();
                    } catch (Throwable th) {
/* 51 */                throw th;
                    }
/* 49 */            return listUnmodifiableList;
                }

                public final synchronized int queuedCallsCount() {
/* 4 */             return this.readyAsyncCalls.size();
                }

                public final synchronized List<Call> runningCalls() {
                    List<Call> listUnmodifiableList;
                    try {
/* 2 */                 ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
/* 4 */                 ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
/* 14 */                ArrayList arrayList = new ArrayList(C2122qw.m8020h(arrayDeque2, 10));
/* 17 */                Iterator<T> it = arrayDeque2.iterator();
/* 25 */                while (it.hasNext()) {
/* 37 */                    arrayList.add(((RealCall.AsyncCall) it.next()).getThis$0());
                        }
/* 47 */                listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.m6183B(arrayDeque, arrayList));
/* 51 */                listUnmodifiableList.getClass();
                    } catch (Throwable th) {
/* 57 */                throw th;
                    }
/* 55 */            return listUnmodifiableList;
                }

                public final synchronized int runningCallsCount() {
/* 14 */            return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
                }

                public final synchronized void setIdleCallback(Runnable runnable) {
/* 2 */             this.idleCallback = runnable;
                }

                public final void setMaxRequests(int i) {
/* 2 */             if (i < 1) {
/* 25 */                ds0.m3200q(Intrinsics.m6219d(Integer.valueOf(i), "max < 1: "));
/* 28 */                return;
                    }
                    synchronized (this) {
/* 5 */                 this.maxRequests = i;
                    }
/* 8 */             promoteAndExecute();
                }

                public final void setMaxRequestsPerHost(int i) {
/* 2 */             if (i < 1) {
/* 25 */                ds0.m3200q(Intrinsics.m6219d(Integer.valueOf(i), "max < 1: "));
/* 28 */                return;
                    }
                    synchronized (this) {
/* 5 */                 this.maxRequestsPerHost = i;
                    }
/* 8 */             promoteAndExecute();
                }

/* 16 */        public final void finished$okhttp(RealCall call) {
                    call.getClass();
/* 17 */            finished(this.runningSyncCalls, call);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 32 */        public Dispatcher(ExecutorService executorService) {
/* 33 */            this();
                    executorService.getClass();
/* 34 */            this.executorServiceOrNull = executorService;
                }
            }
