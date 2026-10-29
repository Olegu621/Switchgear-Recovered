.class public final Lcj;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/Object;

.field public volatile b:Ljava/lang/Object;

.field public volatile c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcj;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lej;
    .locals 3

    .line 1
    iget-object v0, p0, Lcj;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget-object v0, p0, Lcj;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ltz1;

    .line 10
    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    iget-object v0, p0, Lcj;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lec0;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    iget-object v0, p0, Lcj;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lec0;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcj;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ltz1;

    .line 29
    .line 30
    iget-object v1, p0, Lcj;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lec0;

    .line 33
    .line 34
    iget-object v2, p0, Lcj;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Landroid/content/Context;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Lcj;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ltz1;

    .line 43
    .line 44
    invoke-virtual {p0}, Lcj;->b()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    new-instance p0, Lgf3;

    .line 51
    .line 52
    invoke-direct {p0, v1, v2, v0}, Lgf3;-><init>(Lec0;Landroid/content/Context;Ltz1;)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_0
    new-instance p0, Lej;

    .line 57
    .line 58
    invoke-direct {p0, v1, v2, v0}, Lej;-><init>(Lec0;Landroid/content/Context;Ltz1;)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_1
    invoke-virtual {p0}, Lcj;->b()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    new-instance p0, Lgf3;

    .line 69
    .line 70
    invoke-direct {p0, v1, v2}, Lgf3;-><init>(Lec0;Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_2
    new-instance p0, Lej;

    .line 75
    .line 76
    invoke-direct {p0, v1, v2}, Lej;-><init>(Lec0;Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_3
    const-string p0, "Pending purchases for one-time products must be supported."

    .line 81
    .line 82
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x0

    .line 86
    return-object p0

    .line 87
    :cond_4
    const-string p0, "Please provide a valid listener for purchases updates."

    .line 88
    .line 89
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    return-object p0

    .line 94
    :cond_5
    const-string p0, "Please provide a valid Context."

    .line 95
    .line 96
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    return-object p0
.end method

.method public b()Z
    .locals 3

    .line 1
    iget-object p0, p0, Lcj;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/content/Context;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/16 v2, 0x80

    .line 15
    .line 16
    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 21
    .line 22
    const-string v1, "com.google.android.play.billingclient.enableBillingOverridesTesting"

    .line 23
    .line 24
    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return p0

    .line 29
    :catch_0
    move-exception p0

    .line 30
    const-string v1, "BillingClient"

    .line 31
    .line 32
    const-string v2, "Unable to retrieve metadata value for enableBillingOverridesTesting."

    .line 33
    .line 34
    invoke-static {v1, v2, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return v0
.end method
