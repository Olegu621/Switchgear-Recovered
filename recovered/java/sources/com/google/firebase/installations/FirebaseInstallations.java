            package com.google.firebase.installations;

            import android.text.TextUtils;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.gms.tasks.Tasks;
            import com.google.firebase.installations.internal.FidListener;
            import com.google.firebase.installations.internal.FidListenerHandle;
            import com.google.firebase.installations.local.IidStore;
            import com.google.firebase.installations.local.PersistedInstallation;
            import com.google.firebase.installations.local.PersistedInstallationEntry;
            import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
            import com.google.firebase.installations.remote.InstallationResponse;
            import com.google.firebase.installations.remote.TokenResult;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.atomic.AtomicInteger;
            import p000.C0897ey;
            import p000.RunnableC2166s2;
            import p000.iz1;
            import p000.kb1;
            import p000.q51;
            import p000.vi0;
            import p000.xi0;
            import p000.yi0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public class FirebaseInstallations implements FirebaseInstallationsApi {
                private static final String API_KEY_VALIDATION_MSG = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
                private static final String APP_ID_VALIDATION_MSG = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
                private static final String AUTH_ERROR_MSG = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
                private static final String CHIME_FIREBASE_APP_NAME = "CHIME_ANDROID_SDK";
                private static final int CORE_POOL_SIZE = 0;
                private static final long KEEP_ALIVE_TIME_IN_SECONDS = 30;
                private static final String LOCKFILE_NAME_GENERATE_FID = "generatefid.lock";
                private static final int MAXIMUM_POOL_SIZE = 1;
                private static final String PROJECT_ID_VALIDATION_MSG = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
                private final ExecutorService backgroundExecutor;
                private String cachedFid;
                private final RandomFidGenerator fidGenerator;
                private Set<FidListener> fidListeners;
                private final vi0 firebaseApp;
                private final q51 iidStore;
                private final List<StateListener> listeners;
                private final Object lock;
                private final Executor networkExecutor;
                private final PersistedInstallation persistedInstallation;
                private final FirebaseInstallationServiceClient serviceClient;
                private final Utils utils;
                private static final Object lockGenerateFid = new Object();
                private static final ThreadFactory THREAD_FACTORY = new ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.1
                    private final AtomicInteger mCount = new AtomicInteger(1);

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
/* 23 */                return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.mCount.getAndIncrement())));
                    }
                };

                /* JADX INFO: renamed from: com.google.firebase.installations.FirebaseInstallations$3 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C04843 {

                    /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode */
                    static final /* synthetic */ int[] f5288xc38d2559;

                    /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode */
                    static final /* synthetic */ int[] f5289xe5baa01a;

                    static {
/* 6 */                 int[] iArr = new int[TokenResult.ResponseCode.values().length];
/* 8 */                 f5289xe5baa01a = iArr;
                        try {
/* 17 */                    iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f5289xe5baa01a[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    f5289xe5baa01a[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
/* 46 */                int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
/* 48 */                f5288xc38d2559 = iArr2;
                        try {
/* 56 */                    iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
/* 66 */                    f5288xc38d2559[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
                        } catch (NoSuchFieldError unused5) {
                        }
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public FirebaseInstallations(vi0 vi0Var, iz1 iz1Var, ExecutorService executorService, Executor executor) {
/* 40 */            this(executorService, executor, vi0Var, new FirebaseInstallationServiceClient(vi0Var.f18192a, iz1Var), new PersistedInstallation(vi0Var), Utils.getInstance(), new q51(new C0897ey(vi0Var, 2)), new RandomFidGenerator());
/* 3 */             vi0Var.m9274a();
                }

                private Task<InstallationTokenResult> addGetAuthTokenListener() {
/* 3 */             TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 13 */            addStateListeners(new GetAuthTokenListener(this.utils, taskCompletionSource));
/* 16 */            return taskCompletionSource.getTask();
                }

                private Task<String> addGetIdListener() {
/* 3 */             TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 11 */            addStateListeners(new GetIdListener(taskCompletionSource));
/* 14 */            return taskCompletionSource.getTask();
                }

                private void addStateListeners(StateListener stateListener) {
                    synchronized (this.lock) {
/* 6 */                 this.listeners.add(stateListener);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public Void deleteFirebaseInstallationId() throws FirebaseInstallationsException {
/* 2 */             updateCacheFid(null);
/* 5 */             PersistedInstallationEntry multiProcessSafePrefs = getMultiProcessSafePrefs();
/* 13 */            if (multiProcessSafePrefs.isRegistered()) {
/* 33 */                this.serviceClient.deleteFirebaseInstallation(getApiKey(), multiProcessSafePrefs.getFirebaseInstallationId(), getProjectIdentifier(), multiProcessSafePrefs.getRefreshToken());
                    }
/* 40 */            insertOrUpdatePrefs(multiProcessSafePrefs.withNoGeneratedFid());
/* 1 */             return null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX INFO: renamed from: doNetworkCallIfNecessary, reason: merged with bridge method [inline-methods] */
                public void lambda$doRegistrationOrRefresh$3(boolean z) {
                    PersistedInstallationEntry persistedInstallationEntryRegisterFidWithServer;
/* 1 */             PersistedInstallationEntry multiProcessSafePrefs = getMultiProcessSafePrefs();
                    try {
/* 9 */                 if (multiProcessSafePrefs.isErrored() || multiProcessSafePrefs.isUnregistered()) {
/* 37 */                    persistedInstallationEntryRegisterFidWithServer = registerFidWithServer(multiProcessSafePrefs);
                        } else {
/* 18 */                    if (!z && !this.utils.isAuthTokenExpired(multiProcessSafePrefs)) {
/* 29 */                        return;
                            }
/* 32 */                    persistedInstallationEntryRegisterFidWithServer = fetchAuthTokenFromServer(multiProcessSafePrefs);
                        }
/* 41 */                insertOrUpdatePrefs(persistedInstallationEntryRegisterFidWithServer);
/* 44 */                updateFidListener(multiProcessSafePrefs, persistedInstallationEntryRegisterFidWithServer);
/* 51 */                if (persistedInstallationEntryRegisterFidWithServer.isRegistered()) {
/* 57 */                    updateCacheFid(persistedInstallationEntryRegisterFidWithServer.getFirebaseInstallationId());
                        }
/* 64 */                if (persistedInstallationEntryRegisterFidWithServer.isErrored()) {
/* 73 */                    triggerOnException(new FirebaseInstallationsException(FirebaseInstallationsException.Status.BAD_CONFIG));
                        } else if (persistedInstallationEntryRegisterFidWithServer.isNotGenerated()) {
/* 90 */                    triggerOnException(new IOException(AUTH_ERROR_MSG));
                        } else {
/* 94 */                    triggerOnStateReached(persistedInstallationEntryRegisterFidWithServer);
                        }
                    } catch (FirebaseInstallationsException e) {
/* 98 */                triggerOnException(e);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX INFO: renamed from: doRegistrationOrRefresh, reason: merged with bridge method [inline-methods] */
                public final void lambda$getToken$2(boolean z) {
/* 1 */             PersistedInstallationEntry prefsWithGeneratedIdMultiProcessSafe = getPrefsWithGeneratedIdMultiProcessSafe();
/* 5 */             if (z) {
/* 7 */                 prefsWithGeneratedIdMultiProcessSafe = prefsWithGeneratedIdMultiProcessSafe.withClearedAuthToken();
                    }
/* 11 */            triggerOnStateReached(prefsWithGeneratedIdMultiProcessSafe);
/* 22 */            this.networkExecutor.execute(new xi0(this, z, 0));
                }

                private PersistedInstallationEntry fetchAuthTokenFromServer(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
/* 19 */            TokenResult tokenResultGenerateAuthToken = this.serviceClient.generateAuthToken(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), persistedInstallationEntry.getRefreshToken());
/* 33 */            int i = C04843.f5289xe5baa01a[tokenResultGenerateAuthToken.getResponseCode().ordinal()];
/* 36 */            if (i == 1) {
/* 85 */                return persistedInstallationEntry.withAuthToken(tokenResultGenerateAuthToken.getToken(), tokenResultGenerateAuthToken.getTokenExpirationTimestamp(), this.utils.currentTimeInSecs());
                    }
/* 39 */            if (i == 2) {
/* 65 */                return persistedInstallationEntry.withFisError("BAD CONFIG");
                    }
/* 42 */            if (i != 3) {
/* 62 */                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                    }
/* 45 */            updateCacheFid(null);
/* 48 */            return persistedInstallationEntry.withNoGeneratedFid();
                }

                private synchronized String getCacheFid() {
/* 2 */             return this.cachedFid;
                }

                private IidStore getIidStore() {
/* 7 */             return (IidStore) this.iidStore.get();
                }

                public static FirebaseInstallations getInstance(vi0 vi0Var) {
/* 8 */             kb1.m6053f("Null is not a valid value of FirebaseApp.", vi0Var != null);
/* 17 */            return (FirebaseInstallations) vi0Var.m9275b(FirebaseInstallationsApi.class);
                }

                private PersistedInstallationEntry getMultiProcessSafePrefs() {
                    PersistedInstallationEntry persistedInstallationEntryValue;
                    synchronized (lockGenerateFid) {
                        try {
/* 4 */                     vi0 vi0Var = this.firebaseApp;
/* 6 */                     vi0Var.m9274a();
/* 13 */                    CrossProcessLock crossProcessLockAcquire = CrossProcessLock.acquire(vi0Var.f18192a, LOCKFILE_NAME_GENERATE_FID);
                            try {
/* 19 */                        persistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
/* 23 */                        if (crossProcessLockAcquire != null) {
/* 25 */                            crossProcessLockAcquire.releaseAndClose();
                                }
                            } catch (Throwable th) {
/* 34 */                        if (crossProcessLockAcquire != null) {
/* 36 */                            crossProcessLockAcquire.releaseAndClose();
                                }
/* 39 */                        throw th;
                            }
                        } catch (Throwable th2) {
/* 41 */                    throw th2;
                        }
                    }
/* 32 */            return persistedInstallationEntryValue;
                }

                private PersistedInstallationEntry getPrefsWithGeneratedIdMultiProcessSafe() {
                    PersistedInstallationEntry persistedInstallationEntryValue;
                    synchronized (lockGenerateFid) {
                        try {
/* 4 */                     vi0 vi0Var = this.firebaseApp;
/* 6 */                     vi0Var.m9274a();
/* 13 */                    CrossProcessLock crossProcessLockAcquire = CrossProcessLock.acquire(vi0Var.f18192a, LOCKFILE_NAME_GENERATE_FID);
                            try {
/* 19 */                        persistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
/* 27 */                        if (persistedInstallationEntryValue.isNotGenerated()) {
/* 39 */                            persistedInstallationEntryValue = this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntryValue.withUnregisteredFid(readExistingIidOrCreateFid(persistedInstallationEntryValue)));
                                }
/* 46 */                        if (crossProcessLockAcquire != null) {
/* 48 */                            crossProcessLockAcquire.releaseAndClose();
                                }
                            } catch (Throwable th) {
/* 56 */                        if (crossProcessLockAcquire != null) {
/* 58 */                            crossProcessLockAcquire.releaseAndClose();
                                }
/* 61 */                        throw th;
                            }
                        } catch (Throwable th2) {
/* 63 */                    throw th2;
                        }
                    }
/* 55 */            return persistedInstallationEntryValue;
                }

                private void insertOrUpdatePrefs(PersistedInstallationEntry persistedInstallationEntry) {
                    synchronized (lockGenerateFid) {
                        try {
/* 4 */                     vi0 vi0Var = this.firebaseApp;
/* 6 */                     vi0Var.m9274a();
/* 13 */                    CrossProcessLock crossProcessLockAcquire = CrossProcessLock.acquire(vi0Var.f18192a, LOCKFILE_NAME_GENERATE_FID);
                            try {
/* 19 */                        this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
/* 22 */                        if (crossProcessLockAcquire != null) {
/* 24 */                            crossProcessLockAcquire.releaseAndClose();
                                }
                            } catch (Throwable th) {
/* 33 */                        if (crossProcessLockAcquire != null) {
/* 35 */                            crossProcessLockAcquire.releaseAndClose();
                                }
/* 38 */                        throw th;
                            }
                        } catch (Throwable th2) {
/* 40 */                    throw th2;
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$getId$1() {
/* 2 */             lambda$getToken$2(false);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ IidStore lambda$new$0(vi0 vi0Var) {
/* 3 */             return new IidStore(vi0Var);
                }

                private void preConditionChecks() {
/* 7 */             kb1.m6059l(getApplicationId(), APP_ID_VALIDATION_MSG);
/* 16 */            kb1.m6059l(getProjectIdentifier(), PROJECT_ID_VALIDATION_MSG);
/* 25 */            kb1.m6059l(getApiKey(), API_KEY_VALIDATION_MSG);
/* 36 */            kb1.m6053f(APP_ID_VALIDATION_MSG, Utils.isValidAppIdFormat(getApplicationId()));
/* 47 */            kb1.m6053f(API_KEY_VALIDATION_MSG, Utils.isValidApiKeyFormat(getApiKey()));
                }

                /* JADX WARN: Code duplicated, block: B:10:0x002b  */
                /* JADX WARN: Code duplicated, block: B:12:0x0039  */
                /* JADX WARN: Code duplicated, block: B:14:0x0040 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:6:0x001e  */
                private String readExistingIidOrCreateFid(PersistedInstallationEntry persistedInstallationEntry) {
                    String iid;
/* 1 */             vi0 vi0Var = this.firebaseApp;
/* 3 */             vi0Var.m9274a();
/* 14 */            if (!vi0Var.f18193b.equals(CHIME_FIREBASE_APP_NAME)) {
/* 16 */                vi0 vi0Var2 = this.firebaseApp;
/* 18 */                vi0Var2.m9274a();
/* 29 */                if ("[DEFAULT]".equals(vi0Var2.f18193b)) {
/* 35 */                    if (persistedInstallationEntry.shouldAttemptMigration()) {
/* 48 */                        iid = getIidStore().readIid();
/* 56 */                        if (TextUtils.isEmpty(iid)) {
/* 60 */                            return this.fidGenerator.createRandomFid();
                                }
/* 65 */                        return iid;
                            }
                        }
                    } else if (persistedInstallationEntry.shouldAttemptMigration()) {
/* 48 */                iid = getIidStore().readIid();
/* 56 */                if (TextUtils.isEmpty(iid)) {
/* 60 */                    return this.fidGenerator.createRandomFid();
                        }
/* 65 */                return iid;
                    }
/* 39 */            return this.fidGenerator.createRandomFid();
                }

                private PersistedInstallationEntry registerFidWithServer(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
/* 49 */            InstallationResponse installationResponseCreateFirebaseInstallation = this.serviceClient.createFirebaseInstallation(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), getApplicationId(), (persistedInstallationEntry.getFirebaseInstallationId() == null || persistedInstallationEntry.getFirebaseInstallationId().length() != 11) ? null : getIidStore().readToken());
/* 63 */            int i = C04843.f5288xc38d2559[installationResponseCreateFirebaseInstallation.getResponseCode().ordinal()];
/* 66 */            if (i == 1) {
/* 119 */               return persistedInstallationEntry.withRegisteredFid(installationResponseCreateFirebaseInstallation.getFid(), installationResponseCreateFirebaseInstallation.getRefreshToken(), this.utils.currentTimeInSecs(), installationResponseCreateFirebaseInstallation.getAuthToken().getToken(), installationResponseCreateFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
                    }
/* 69 */            if (i == 2) {
/* 73 */                return persistedInstallationEntry.withFisError("BAD CONFIG");
                    }
/* 87 */            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                }

                private void triggerOnException(Exception exc) {
                    synchronized (this.lock) {
                        try {
/* 6 */                     Iterator<StateListener> it = this.listeners.iterator();
/* 14 */                    while (it.hasNext()) {
/* 26 */                        if (it.next().onException(exc)) {
/* 28 */                            it.remove();
                                }
                            }
                        } catch (Throwable th) {
/* 37 */                    throw th;
                        }
                    }
                }

                private void triggerOnStateReached(PersistedInstallationEntry persistedInstallationEntry) {
                    synchronized (this.lock) {
                        try {
/* 6 */                     Iterator<StateListener> it = this.listeners.iterator();
/* 14 */                    while (it.hasNext()) {
/* 26 */                        if (it.next().onStateReached(persistedInstallationEntry)) {
/* 28 */                            it.remove();
                                }
                            }
                        } catch (Throwable th) {
/* 37 */                    throw th;
                        }
                    }
                }

                private synchronized void updateCacheFid(String str) {
/* 2 */             this.cachedFid = str;
                }

                private synchronized void updateFidListener(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
/* 8 */             if (this.fidListeners.size() != 0 && !TextUtils.equals(persistedInstallationEntry.getFirebaseInstallationId(), persistedInstallationEntry2.getFirebaseInstallationId())) {
/* 26 */                Iterator<FidListener> it = this.fidListeners.iterator();
/* 34 */                while (it.hasNext()) {
/* 46 */                    it.next().onFidChanged(persistedInstallationEntry2.getFirebaseInstallationId());
                        }
                    }
                }

                @Override // com.google.firebase.installations.FirebaseInstallationsApi
                public Task<Void> delete() {
/* 9 */             return Tasks.call(this.backgroundExecutor, new yi0(this, 0));
                }

                public String getApiKey() {
/* 1 */             vi0 vi0Var = this.firebaseApp;
/* 3 */             vi0Var.m9274a();
/* 8 */             return vi0Var.f18194c.f2934a;
                }

                public String getApplicationId() {
/* 1 */             vi0 vi0Var = this.firebaseApp;
/* 3 */             vi0Var.m9274a();
/* 8 */             return vi0Var.f18194c.f2935b;
                }

                @Override // com.google.firebase.installations.FirebaseInstallationsApi
                public Task<String> getId() {
/* 1 */             preConditionChecks();
/* 4 */             String cacheFid = getCacheFid();
/* 8 */             if (cacheFid != null) {
/* 10 */                return Tasks.forResult(cacheFid);
                    }
/* 15 */            Task<String> taskAddGetIdListener = addGetIdListener();
/* 28 */            this.backgroundExecutor.execute(new RunnableC2166s2(this, 20));
/* 31 */            return taskAddGetIdListener;
                }

                public String getName() {
/* 1 */             vi0 vi0Var = this.firebaseApp;
/* 3 */             vi0Var.m9274a();
/* 6 */             return vi0Var.f18193b;
                }

                public String getProjectIdentifier() {
/* 1 */             vi0 vi0Var = this.firebaseApp;
/* 3 */             vi0Var.m9274a();
/* 8 */             return vi0Var.f18194c.f2940g;
                }

                @Override // com.google.firebase.installations.FirebaseInstallationsApi
                public Task<InstallationTokenResult> getToken(boolean z) {
/* 1 */             preConditionChecks();
/* 4 */             Task<InstallationTokenResult> taskAddGetAuthTokenListener = addGetAuthTokenListener();
/* 16 */            this.backgroundExecutor.execute(new xi0(this, z, 1));
/* 19 */            return taskAddGetAuthTokenListener;
                }

                @Override // com.google.firebase.installations.FirebaseInstallationsApi
                public synchronized FidListenerHandle registerFidListener(final FidListener fidListener) {
/* 4 */             this.fidListeners.add(fidListener);
/* 9 */             return new FidListenerHandle() { // from class: com.google.firebase.installations.FirebaseInstallations.2
                        @Override // com.google.firebase.installations.internal.FidListenerHandle
                        public void unregister() {
                            synchronized (FirebaseInstallations.this) {
/* 12 */                        FirebaseInstallations.this.fidListeners.remove(fidListener);
                            }
                        }
                    };
                }

/* 19 */        public static FirebaseInstallations getInstance() {
/* 21 */            return getInstance(vi0.m9271c());
                }

/* 43 */        public FirebaseInstallations(ExecutorService executorService, Executor executor, vi0 vi0Var, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, q51 q51Var, RandomFidGenerator randomFidGenerator) {
/* 45 */            this.lock = new Object();
/* 46 */            this.fidListeners = new HashSet();
/* 47 */            this.listeners = new ArrayList();
/* 48 */            this.firebaseApp = vi0Var;
/* 49 */            this.serviceClient = firebaseInstallationServiceClient;
/* 50 */            this.persistedInstallation = persistedInstallation;
/* 51 */            this.utils = utils;
/* 52 */            this.iidStore = q51Var;
/* 53 */            this.fidGenerator = randomFidGenerator;
/* 54 */            this.backgroundExecutor = executorService;
/* 55 */            this.networkExecutor = executor;
                }
            }
