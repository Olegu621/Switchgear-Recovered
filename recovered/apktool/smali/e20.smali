.class public final Le20;
.super Ldg1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final c:Ljava/lang/String;

.field public final d:Li03;


# direct methods
.method public constructor <init>(Li03;)V
    .locals 1

    .line 1
    const-string v0, "Crashlytics"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Ldg1;-><init>(Ljava/lang/String;Li03;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Le20;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p1, p0, Le20;->d:Li03;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(ZLg13;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    const-string p2, "com.google.firebase.crashlytics.FirebaseCrashlytics"

    .line 5
    .line 6
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object p2, Lcom/google/firebase/ktx/Firebase;->a:Lcom/google/firebase/ktx/Firebase;

    .line 10
    .line 11
    invoke-static {p2}, Lcom/google/firebase/crashlytics/ktx/FirebaseCrashlyticsKt;->getCrashlytics(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2, p1}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->setCrashlyticsCollectionEnabled(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :catch_0
    move-exception p1

    .line 21
    invoke-virtual {p0, p1}, Ldg1;->f(Ljava/lang/Exception;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final c()Li03;
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->d:Li03;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le20;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
