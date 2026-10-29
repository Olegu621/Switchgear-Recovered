            package com.google.android.gms.common.api.internal;

            import android.os.Looper;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.ICancelToken;
            import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.C0942g5;
            import p000.HandlerC1891li;
            import p000.b32;
            import p000.dr2;
            import p000.eb3;
            import p000.ic3;
            import p000.kb1;
            import p000.p42;
            import p000.q42;
            import p000.rb3;
            import p000.rr1;
            import p000.sb3;
            import p000.sr1;
            import p000.t42;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 63 */    public abstract class BasePendingResult<R extends p42> extends sr1 {
                static final ThreadLocal zaa = new C0942g5(9);
                public static final /* synthetic */ int zad = 0;
                private ic3 resultGuardian;
                protected final HandlerC1891li zab;
                protected final WeakReference zac;
                private q42 zah;
                private p42 zaj;
                private Status zak;
                private volatile boolean zal;
                private boolean zam;
                private boolean zan;
                private ICancelToken zao;

                /* JADX INFO: renamed from: zap, reason: collision with root package name */
                private volatile rb3 f20470zap;
                private final Object zae = new Object();
                private final CountDownLatch zaf = new CountDownLatch(1);
                private final ArrayList zag = new ArrayList();
                private final AtomicReference zai = new AtomicReference();
                private boolean zaq = false;

                public BasePendingResult(tr0 tr0Var) {
/* 57 */            this.zab = new HandlerC1891li(tr0Var != null ? ((eb3) tr0Var).f7609b.getLooper() : Looper.getMainLooper());
/* 64 */            this.zac = new WeakReference(tr0Var);
                }

                public static void zal(p42 p42Var) {
/* 3 */             if (p42Var instanceof b32) {
                        try {
/* 8 */                     ((b32) p42Var).release();
                        } catch (RuntimeException e) {
/* 25 */                    AbstractC1245n0.m4891s("BasePendingResult", "Unable to release ".concat(String.valueOf(p42Var)), e);
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final p42 m2007a() {
                    p42 p42Var;
                    synchronized (this.zae) {
/* 10 */                kb1.m6063p("Result has already been consumed.", !this.zal);
/* 19 */                kb1.m6063p("Result is not ready.", isReady());
/* 22 */                p42Var = this.zaj;
/* 25 */                this.zaj = null;
/* 27 */                this.zah = null;
/* 29 */                this.zal = true;
                    }
/* 38 */            if (this.zai.getAndSet(null) == null) {
/* 40 */                kb1.m6061n(p42Var);
/* 43 */                return p42Var;
                    }
/* 44 */            C1697u2.m5431g();
/* 24 */            return null;
                }

                @Override // p000.sr1
                public final void addStatusListener(rr1 rr1Var) {
/* 8 */             kb1.m6053f("Callback cannot be null.", rr1Var != null);
                    synchronized (this.zae) {
                        try {
/* 18 */                    if (isReady()) {
/* 22 */                        rr1Var.mo4165a(this.zak);
                            } else {
/* 30 */                        this.zag.add(rr1Var);
                            }
                        } catch (Throwable th) {
/* 36 */                    throw th;
                        }
                    }
                }

                @Override // p000.sr1
                @ResultIgnorabilityUnspecified
                public final R await(long j, TimeUnit timeUnit) {
/* 5 */             if (j > 0) {
/* 9 */                 kb1.m6060m("await must not be called on the UI thread when time is greater than zero.");
                    }
/* 18 */            kb1.m6063p("Result has already been consumed.", !this.zal);
/* 29 */            kb1.m6063p("Cannot await if then() has been called.", this.f20470zap == null);
                    try {
/* 38 */                if (!this.zaf.await(j, timeUnit)) {
/* 42 */                    forceFailureUnlessReady(Status.f3443v);
                        }
                    } catch (InterruptedException unused) {
/* 48 */                forceFailureUnlessReady(Status.f3441f);
                    }
/* 57 */            kb1.m6063p("Result is not ready.", isReady());
/* 60 */            return (R) m2007a();
                }

                /* JADX INFO: renamed from: b */
                public final void m2008b(p42 p42Var) {
/* 1 */             this.zaj = p42Var;
/* 7 */             this.zak = p42Var.getStatus();
/* 10 */            this.zao = null;
/* 14 */            this.zaf.countDown();
/* 19 */            if (this.zam) {
/* 21 */                this.zah = null;
                    } else {
/* 24 */                q42 q42Var = this.zah;
/* 26 */                if (q42Var != null) {
/* 45 */                    this.zab.removeMessages(2);
/* 54 */                    this.zab.m6453a(q42Var, m2007a());
                        } else if (this.zaj instanceof b32) {
/* 39 */                    this.resultGuardian = new ic3(this);
                        }
                    }
/* 57 */            ArrayList arrayList = this.zag;
/* 59 */            int size = arrayList.size();
/* 64 */            for (int i = 0; i < size; i++) {
/* 74 */                ((rr1) arrayList.get(i)).mo4165a(this.zak);
                    }
/* 82 */            this.zag.clear();
                }

                public void cancel() {
                    synchronized (this.zae) {
/* 6 */                 if (!this.zam && !this.zal) {
/* 13 */                    ICancelToken iCancelToken = this.zao;
/* 15 */                    if (iCancelToken != null) {
                                try {
/* 17 */                            iCancelToken.cancel();
                                } catch (RemoteException unused) {
                                }
                            }
/* 25 */                    zal(this.zaj);
/* 29 */                    this.zam = true;
/* 37 */                    m2008b(createFailedResult(Status.f3444w));
                        }
                    }
                }

                public abstract R createFailedResult(Status status);

                @Deprecated
                public final void forceFailureUnlessReady(Status status) {
                    synchronized (this.zae) {
                        try {
/* 8 */                     if (!isReady()) {
/* 14 */                        setResult(createFailedResult(status));
/* 18 */                        this.zan = true;
                            }
                        } catch (Throwable th) {
/* 26 */                    throw th;
                        }
                    }
                }

                public final boolean isCanceled() {
                    boolean z;
                    synchronized (this.zae) {
/* 4 */                 z = this.zam;
                    }
/* 7 */             return z;
                }

                public final boolean isReady() {
                    return this.zaf.getCount() == 0;
                }

                public final void setCancelToken(ICancelToken iCancelToken) {
                    synchronized (this.zae) {
/* 4 */                 this.zao = iCancelToken;
                    }
                }

                public final void setResult(R r) {
                    synchronized (this.zae) {
                        try {
/* 6 */                     if (this.zan || this.zam) {
/* 42 */                        zal(r);
/* 46 */                        return;
                            }
/* 12 */                    isReady();
/* 23 */                    kb1.m6063p("Results have already been set", !isReady());
/* 32 */                    kb1.m6063p("Result has already been consumed", !this.zal);
/* 35 */                    m2008b(r);
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
                }

                public final void setResultCallback(q42 q42Var, long j, TimeUnit timeUnit) {
                    synchronized (this.zae) {
                        try {
/* 4 */                     if (q42Var == null) {
/* 7 */                         this.zah = null;
/* 10 */                        return;
                            }
/* 15 */                    boolean z = true;
/* 19 */                    kb1.m6063p("Result has already been consumed.", !this.zal);
/* 24 */                    if (this.f20470zap != null) {
/* 27 */                        z = false;
                            }
/* 30 */                    kb1.m6063p("Cannot set callbacks if then() has been called.", z);
/* 37 */                    if (isCanceled()) {
/* 40 */                        return;
                            }
/* 45 */                    if (isReady()) {
/* 53 */                        this.zab.m6453a(q42Var, m2007a());
                            } else {
/* 57 */                        this.zah = q42Var;
/* 59 */                        HandlerC1891li handlerC1891li = this.zab;
/* 70 */                        handlerC1891li.sendMessageDelayed(handlerC1891li.obtainMessage(2, this), timeUnit.toMillis(j));
                            }
                        } catch (Throwable th) {
/* 76 */                    throw th;
                        }
                    }
                }

                public final <S extends p42> dr2 then(t42 t42Var) {
                    rb3 rb3Var;
/* 7 */             kb1.m6063p("Result has already been consumed.", !this.zal);
                    synchronized (this.zae) {
                        try {
/* 23 */                    kb1.m6063p("Cannot call then() twice.", this.f20470zap == null);
/* 33 */                    kb1.m6063p("Cannot call then() if callbacks are set.", this.zah == null);
/* 41 */                    kb1.m6063p("Cannot call then() if result was canceled.", !this.zam);
/* 44 */                    this.zaq = true;
/* 53 */                    this.f20470zap = new rb3(this.zac);
/* 55 */                    rb3 rb3Var2 = this.f20470zap;
                            synchronized (rb3Var2.f15967b) {
/* 64 */                        rb3Var = new rb3(rb3Var2.f15968c);
/* 67 */                        rb3Var2.f15966a = rb3Var;
                            }
/* 74 */                    if (isReady()) {
/* 84 */                        this.zab.m6453a(this.f20470zap, m2007a());
                            } else {
/* 92 */                        this.zah = this.f20470zap;
                            }
                        } catch (Throwable th) {
/* 100 */                   throw th;
                        }
                    }
/* 95 */            return rb3Var;
                }

                public final void zak() {
/* 3 */             boolean z = true;
/* 4 */             if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
/* 21 */                z = false;
                    }
/* 22 */            this.zaq = z;
                }

                public final boolean zam() {
                    boolean zIsCanceled;
                    synchronized (this.zae) {
                        try {
/* 12 */                    if (((tr0) this.zac.get()) == null || !this.zaq) {
/* 21 */                        cancel();
                            }
/* 24 */                    zIsCanceled = isCanceled();
                        } catch (Throwable th) {
/* 31 */                    throw th;
                        }
                    }
/* 29 */            return zIsCanceled;
                }

                public final void zan(sb3 sb3Var) {
/* 3 */             this.zai.set(sb3Var);
                }

                @ResultIgnorabilityUnspecified
/* 64 */        public final R await() {
/* 65 */            kb1.m6060m("await must not be called on the UI thread");
/* 66 */            kb1.m6063p("Result has already been consumed", !this.zal);
/* 67 */            kb1.m6063p("Cannot await if then() has been called.", this.f20470zap == null);
                    try {
/* 68 */                this.zaf.await();
                    } catch (InterruptedException unused) {
/* 69 */                forceFailureUnlessReady(Status.f3441f);
                    }
/* 70 */            kb1.m6063p("Result is not ready.", isReady());
/* 71 */            return (R) m2007a();
                }

/* 76 */        public final void setResultCallback(q42 q42Var) {
                    synchronized (this.zae) {
                        try {
                            if (q42Var == null) {
                                this.zah = null;
                                return;
                            }
                            boolean z = true;
/* 78 */                    kb1.m6063p("Result has already been consumed.", !this.zal);
                            if (this.f20470zap != null) {
                                z = false;
                            }
/* 79 */                    kb1.m6063p("Cannot set callbacks if then() has been called.", z);
/* 80 */                    if (isCanceled()) {
                                return;
                            }
/* 82 */                    if (isReady()) {
/* 83 */                        this.zab.m6453a(q42Var, m2007a());
                            } else {
/* 84 */                        this.zah = q42Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
