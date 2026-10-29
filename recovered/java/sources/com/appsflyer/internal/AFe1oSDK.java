            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import java.io.InterruptedIOException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.NavigableSet;
            import java.util.Set;
            import java.util.Timer;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentSkipListSet;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 35 */    public final class AFe1oSDK {
                final ExecutorService getRevenue;
                public Executor getCurrencyIso4217Code = Executors.newSingleThreadExecutor();
                final Timer getMonetizationNetwork = new Timer(true);
                public final List<AFe1qSDK> getMediationNetwork = new CopyOnWriteArrayList();
                final Set<AFe1pSDK> AFAdRevenueData = new CopyOnWriteArraySet();
                final Set<AFe1pSDK> component2 = Collections.newSetFromMap(new ConcurrentHashMap());
                final NavigableSet<AFe1mSDK<?>> areAllFieldsValid = new ConcurrentSkipListSet();
                final NavigableSet<AFe1mSDK<?>> component1 = new ConcurrentSkipListSet();
                final List<AFe1mSDK<?>> component3 = new ArrayList();
                final Set<AFe1mSDK<?>> component4 = Collections.newSetFromMap(new ConcurrentHashMap());

                /* JADX INFO: renamed from: com.appsflyer.internal.AFe1oSDK$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class RunnableC02601 implements Runnable {
                    private /* synthetic */ AFe1mSDK getRevenue;

                    public RunnableC02601(AFe1mSDK aFe1mSDK) {
/* 3 */                 this.getRevenue = aFe1mSDK;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zAdd;
                        synchronized (AFe1oSDK.this.areAllFieldsValid) {
                            try {
/* 16 */                        if (AFe1oSDK.this.component4.contains(this.getRevenue)) {
/* 18 */                            AFLogger aFLogger = AFLogger.INSTANCE;
/* 20 */                            AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
/* 26 */                            StringBuilder sb = new StringBuilder("tried to add already running task: ");
/* 31 */                            sb.append(this.getRevenue);
/* 38 */                            aFLogger.m1810d(aFg1cSDK, sb.toString());
/* 42 */                            return;
                                }
/* 56 */                        if (!AFe1oSDK.this.areAllFieldsValid.contains(this.getRevenue) && !AFe1oSDK.this.component1.contains(this.getRevenue)) {
/* 72 */                            AFe1oSDK aFe1oSDK = AFe1oSDK.this;
/* 74 */                            AFe1mSDK aFe1mSDK = this.getRevenue;
/* 86 */                            for (AFe1pSDK aFe1pSDK : aFe1mSDK.getCurrencyIso4217Code) {
/* 100 */                               if (aFe1oSDK.component2.contains(aFe1pSDK)) {
/* 104 */                                   aFe1mSDK.AFAdRevenueData.add(aFe1pSDK);
                                        }
                                    }
/* 112 */                           boolean monetizationNetwork = AFe1oSDK.this.getMonetizationNetwork(this.getRevenue);
/* 116 */                           AFe1oSDK aFe1oSDK2 = AFe1oSDK.this;
/* 118 */                           if (monetizationNetwork) {
/* 124 */                               zAdd = aFe1oSDK2.areAllFieldsValid.add(this.getRevenue);
                                    } else {
/* 133 */                               zAdd = aFe1oSDK2.component1.add(this.getRevenue);
/* 137 */                               if (zAdd) {
/* 139 */                                   AFLogger aFLogger2 = AFLogger.INSTANCE;
/* 141 */                                   AFg1cSDK aFg1cSDK2 = AFg1cSDK.QUEUE;
/* 147 */                                   StringBuilder sb2 = new StringBuilder("new task was blocked: ");
/* 152 */                                   sb2.append(this.getRevenue);
/* 159 */                                   aFLogger2.m1810d(aFg1cSDK2, sb2.toString());
/* 164 */                                   this.getRevenue.getMediationNetwork();
                                        }
                                    }
/* 167 */                           if (zAdd) {
/* 169 */                               AFe1oSDK aFe1oSDK3 = AFe1oSDK.this;
/* 175 */                               aFe1oSDK3.areAllFieldsValid.addAll(aFe1oSDK3.component3);
/* 182 */                               AFe1oSDK.this.component3.clear();
                                    } else {
/* 186 */                               AFLogger aFLogger3 = AFLogger.INSTANCE;
/* 188 */                               AFg1cSDK aFg1cSDK3 = AFg1cSDK.QUEUE;
/* 194 */                               StringBuilder sb3 = new StringBuilder("task not added, it's already in the queue: ");
/* 199 */                               sb3.append(this.getRevenue);
/* 206 */                               aFLogger3.m1810d(aFg1cSDK3, sb3.toString());
                                    }
/* 210 */                           if (!zAdd) {
/* 375 */                               AFLogger aFLogger4 = AFLogger.INSTANCE;
/* 377 */                               AFg1cSDK aFg1cSDK4 = AFg1cSDK.QUEUE;
/* 383 */                               StringBuilder sb4 = new StringBuilder("QUEUE: tried to add already pending task: ");
/* 388 */                               sb4.append(this.getRevenue);
/* 395 */                               aFLogger4.m1817w(aFg1cSDK4, sb4.toString());
/* 398 */                               return;
                                    }
/* 220 */                           AFe1oSDK.this.component2.add(this.getRevenue.getRevenue);
/* 223 */                           AFLogger aFLogger5 = AFLogger.INSTANCE;
/* 225 */                           AFg1cSDK aFg1cSDK5 = AFg1cSDK.QUEUE;
/* 231 */                           StringBuilder sb5 = new StringBuilder("new task added: ");
/* 236 */                           sb5.append(this.getRevenue);
/* 243 */                           aFLogger5.m1810d(aFg1cSDK5, sb5.toString());
/* 258 */                           for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                    }
/* 267 */                           AFe1oSDK aFe1oSDK4 = AFe1oSDK.this;
/* 276 */                           aFe1oSDK4.getRevenue.submit(aFe1oSDK4.new RunnableC02612());
/* 279 */                           AFe1oSDK aFe1oSDK5 = AFe1oSDK.this;
                                    synchronized (aFe1oSDK5.areAllFieldsValid) {
                                        try {
/* 299 */                                   for (int size = (aFe1oSDK5.areAllFieldsValid.size() + aFe1oSDK5.component1.size()) - 40; size > 0; size--) {
/* 303 */                                       boolean zIsEmpty = aFe1oSDK5.component1.isEmpty();
/* 309 */                                       boolean zIsEmpty2 = aFe1oSDK5.areAllFieldsValid.isEmpty();
/* 313 */                                       if (zIsEmpty2 || zIsEmpty) {
/* 353 */                                           if (!zIsEmpty2) {
/* 357 */                                               aFe1oSDK5.getMonetizationNetwork(aFe1oSDK5.areAllFieldsValid);
                                                    } else if (!zIsEmpty) {
/* 365 */                                               aFe1oSDK5.getMonetizationNetwork(aFe1oSDK5.component1);
                                                    }
                                                } else if (aFe1oSDK5.areAllFieldsValid.first().compareTo(aFe1oSDK5.component1.first()) > 0) {
/* 341 */                                           aFe1oSDK5.getMonetizationNetwork(aFe1oSDK5.areAllFieldsValid);
                                                } else {
/* 349 */                                           aFe1oSDK5.getMonetizationNetwork(aFe1oSDK5.component1);
                                                }
                                            }
                                        } catch (Throwable th) {
/* 374 */                                   throw th;
                                        }
                                    }
/* 372 */                           return;
                                }
/* 399 */                       AFLogger aFLogger6 = AFLogger.INSTANCE;
/* 401 */                       AFg1cSDK aFg1cSDK6 = AFg1cSDK.QUEUE;
/* 407 */                       StringBuilder sb6 = new StringBuilder("tried to add already scheduled task: ");
/* 412 */                       sb6.append(this.getRevenue);
/* 419 */                       aFLogger6.m1810d(aFg1cSDK6, sb6.toString());
                            } catch (Throwable th2) {
/* 425 */                       throw th2;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: com.appsflyer.internal.AFe1oSDK$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class RunnableC02612 implements Runnable {
                    public RunnableC02612() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        synchronized (AFe1oSDK.this.areAllFieldsValid) {
                            try {
/* 10 */                        final AFe1mSDK<?> aFe1mSDKPollFirst = AFe1oSDK.this.areAllFieldsValid.pollFirst();
/* 16 */                        if (aFe1mSDKPollFirst == null) {
/* 19 */                            return;
                                }
/* 27 */                        AFe1oSDK.this.component4.add(aFe1mSDKPollFirst);
/* 31 */                        long jAFAdRevenueData = aFe1mSDKPollFirst.AFAdRevenueData();
/* 41 */                        AFe1lSDK aFe1lSDK = new AFe1lSDK(Thread.currentThread());
/* 48 */                        if (jAFAdRevenueData > 0) {
/* 54 */                            AFe1oSDK.this.getMonetizationNetwork.schedule(aFe1lSDK, jAFAdRevenueData);
                                }
/* 57 */                        final AFe1oSDK aFe1oSDK = AFe1oSDK.this;
/* 66 */                        aFe1oSDK.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.3
                                    @Override // java.lang.Runnable
                                    public final void run() {
/* 13 */                                for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                        }
                                    }
                                });
/* 77 */                        if (!AFe1oSDK.this.areAllFieldsValid.isEmpty()) {
/* 79 */                            AFe1oSDK aFe1oSDK2 = AFe1oSDK.this;
/* 88 */                            aFe1oSDK2.getRevenue.submit(aFe1oSDK2.new RunnableC02612());
                                }
                                try {
/* 105 */                           AFLogger.INSTANCE.m1810d(AFg1cSDK.QUEUE, "starting task execution: ".concat(String.valueOf(aFe1mSDKPollFirst)));
/* 108 */                           final AFe1uSDK aFe1uSDKCall = aFe1mSDKPollFirst.call();
/* 112 */                           aFe1lSDK.cancel();
/* 115 */                           final AFe1oSDK aFe1oSDK3 = AFe1oSDK.this;
/* 124 */                           aFe1oSDK3.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                                        @Override // java.lang.Runnable
                                        public final void run() {
/* 1 */                                     AFLogger aFLogger = AFLogger.INSTANCE;
/* 3 */                                     AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
/* 9 */                                     StringBuilder sb = new StringBuilder("execution finished for ");
/* 14 */                                    sb.append(aFe1mSDKPollFirst);
/* 19 */                                    sb.append(", result: ");
/* 24 */                                    sb.append(aFe1uSDKCall);
/* 31 */                                    aFLogger.m1810d(aFg1cSDK, sb.toString());
/* 40 */                                    AFe1oSDK.this.component4.remove(aFe1mSDKPollFirst);
/* 47 */                                    Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
/* 55 */                                    while (it.hasNext()) {
/* 67 */                                        it.next().getRevenue(aFe1mSDKPollFirst, aFe1uSDKCall);
                                            }
/* 75 */                                    if (aFe1uSDKCall == AFe1uSDK.SUCCESS) {
/* 85 */                                        AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
/* 90 */                                        AFe1oSDK.this.getRevenue();
/* 93 */                                        return;
                                            }
/* 96 */                                    boolean monetizationNetwork = aFe1mSDKPollFirst.getMonetizationNetwork();
/* 100 */                                   AFe1oSDK aFe1oSDK4 = AFe1oSDK.this;
/* 102 */                                   if (!monetizationNetwork) {
/* 160 */                                       aFe1oSDK4.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
/* 165 */                                       AFe1oSDK.this.getRevenue();
                                            } else if (AFe1oSDK.AFAdRevenueData(aFe1mSDKPollFirst)) {
                                                synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                                    try {
/* 123 */                                               AFe1oSDK.this.component3.add(aFe1mSDKPollFirst);
/* 138 */                                               for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                                        }
                                                    } catch (Throwable th) {
/* 152 */                                               throw th;
                                                    }
                                                }
                                            }
                                        }
                                    });
                                } catch (InterruptedIOException | InterruptedException unused) {
/* 160 */                           AFLogger.INSTANCE.m1810d(AFg1cSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(aFe1mSDKPollFirst)));
/* 163 */                           final AFe1uSDK aFe1uSDK = AFe1uSDK.TIMEOUT;
/* 165 */                           aFe1mSDKPollFirst.getMonetizationNetwork = aFe1uSDK;
/* 167 */                           final AFe1oSDK aFe1oSDK4 = AFe1oSDK.this;
/* 176 */                           aFe1oSDK4.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                                        @Override // java.lang.Runnable
                                        public final void run() {
/* 1 */                                     AFLogger aFLogger = AFLogger.INSTANCE;
/* 3 */                                     AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
/* 9 */                                     StringBuilder sb = new StringBuilder("execution finished for ");
/* 14 */                                    sb.append(aFe1mSDKPollFirst);
/* 19 */                                    sb.append(", result: ");
/* 24 */                                    sb.append(aFe1uSDK);
/* 31 */                                    aFLogger.m1810d(aFg1cSDK, sb.toString());
/* 40 */                                    AFe1oSDK.this.component4.remove(aFe1mSDKPollFirst);
/* 47 */                                    Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
/* 55 */                                    while (it.hasNext()) {
/* 67 */                                        it.next().getRevenue(aFe1mSDKPollFirst, aFe1uSDK);
                                            }
/* 75 */                                    if (aFe1uSDK == AFe1uSDK.SUCCESS) {
/* 85 */                                        AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
/* 90 */                                        AFe1oSDK.this.getRevenue();
/* 93 */                                        return;
                                            }
/* 96 */                                    boolean monetizationNetwork = aFe1mSDKPollFirst.getMonetizationNetwork();
/* 100 */                                   AFe1oSDK aFe1oSDK5 = AFe1oSDK.this;
/* 102 */                                   if (!monetizationNetwork) {
/* 160 */                                       aFe1oSDK5.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
/* 165 */                                       AFe1oSDK.this.getRevenue();
                                            } else if (AFe1oSDK.AFAdRevenueData(aFe1mSDKPollFirst)) {
                                                synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                                    try {
/* 123 */                                               AFe1oSDK.this.component3.add(aFe1mSDKPollFirst);
/* 138 */                                               for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                                        }
                                                    } catch (Throwable th) {
/* 152 */                                               throw th;
                                                    }
                                                }
                                            }
                                        }
                                    });
                                } catch (Throwable unused2) {
/* 128 */                           aFe1lSDK.cancel();
/* 131 */                           final AFe1oSDK aFe1oSDK5 = AFe1oSDK.this;
/* 133 */                           final AFe1uSDK aFe1uSDK2 = AFe1uSDK.FAILURE;
/* 142 */                           aFe1oSDK5.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                                        @Override // java.lang.Runnable
                                        public final void run() {
/* 1 */                                     AFLogger aFLogger = AFLogger.INSTANCE;
/* 3 */                                     AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
/* 9 */                                     StringBuilder sb = new StringBuilder("execution finished for ");
/* 14 */                                    sb.append(aFe1mSDKPollFirst);
/* 19 */                                    sb.append(", result: ");
/* 24 */                                    sb.append(aFe1uSDK2);
/* 31 */                                    aFLogger.m1810d(aFg1cSDK, sb.toString());
/* 40 */                                    AFe1oSDK.this.component4.remove(aFe1mSDKPollFirst);
/* 47 */                                    Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
/* 55 */                                    while (it.hasNext()) {
/* 67 */                                        it.next().getRevenue(aFe1mSDKPollFirst, aFe1uSDK2);
                                            }
/* 75 */                                    if (aFe1uSDK2 == AFe1uSDK.SUCCESS) {
/* 85 */                                        AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
/* 90 */                                        AFe1oSDK.this.getRevenue();
/* 93 */                                        return;
                                            }
/* 96 */                                    boolean monetizationNetwork = aFe1mSDKPollFirst.getMonetizationNetwork();
/* 100 */                                   AFe1oSDK aFe1oSDK6 = AFe1oSDK.this;
/* 102 */                                   if (!monetizationNetwork) {
/* 160 */                                       aFe1oSDK6.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
/* 165 */                                       AFe1oSDK.this.getRevenue();
                                            } else if (AFe1oSDK.AFAdRevenueData(aFe1mSDKPollFirst)) {
                                                synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                                    try {
/* 123 */                                               AFe1oSDK.this.component3.add(aFe1mSDKPollFirst);
/* 138 */                                               for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                                        }
                                                    } catch (Throwable th) {
/* 152 */                                               throw th;
                                                    }
                                                }
                                            }
                                        }
                                    });
                                }
                            } catch (Throwable th) {
/* 181 */                       throw th;
                            }
                        }
                    }
                }

                public AFe1oSDK(ExecutorService executorService) {
/* 75 */            this.getRevenue = executorService;
                }

                public static boolean AFAdRevenueData(AFe1mSDK<?> aFe1mSDK) {
                    return ((aFe1mSDK instanceof AFf1uSDK) && aFe1mSDK.getRevenue == AFe1pSDK.ARS_VALIDATE) ? false : true;
                }

                public final void getMonetizationNetwork(NavigableSet<AFe1mSDK<?>> navigableSet) {
/* 1 */             AFe1mSDK<?> aFe1mSDKPollFirst = navigableSet.pollFirst();
/* 11 */            this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
/* 16 */            Iterator<AFe1qSDK> it = this.getMediationNetwork.iterator();
/* 24 */            while (it.hasNext()) {
/* 32 */                it.next().getCurrencyIso4217Code(aFe1mSDKPollFirst);
                    }
                }

                public final void getRevenue() {
                    synchronized (this.areAllFieldsValid) {
                        try {
/* 6 */                     Iterator<AFe1mSDK<?>> it = this.component1.iterator();
/* 10 */                    boolean z = false;
/* 15 */                    while (it.hasNext()) {
/* 17 */                        AFe1mSDK<?> next = it.next();
/* 27 */                        if (getMonetizationNetwork(next)) {
/* 29 */                            it.remove();
/* 34 */                            this.areAllFieldsValid.add(next);
/* 37 */                            z = true;
                                }
                            }
/* 41 */                    if (z) {
/* 50 */                        this.getRevenue.submit(new RunnableC02612());
                            }
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
                }

/* 36 */        public final boolean getMonetizationNetwork(AFe1mSDK<?> aFe1mSDK) {
/* 39 */            return this.AFAdRevenueData.containsAll(aFe1mSDK.AFAdRevenueData);
                }
            }
