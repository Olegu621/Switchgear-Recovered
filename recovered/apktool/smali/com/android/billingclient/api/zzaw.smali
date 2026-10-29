.class final Lcom/android/billingclient/api/zzaw;
.super Landroid/os/ResultReceiver;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lkj;->a()Ljj;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iput p1, p0, Ljj;->a:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    const-string p1, "BillingClient"

    .line 13
    .line 14
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzh(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Ljj;->b:Ljava/lang/String;

    .line 19
    .line 20
    const-string p1, "INTERNAL_LOG_ERROR_REASON"

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/zzkg;->zza(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/16 p1, 0x17

    .line 34
    .line 35
    :goto_0
    invoke-virtual {p0}, Ljj;->a()Lkj;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v1, "INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS"

    .line 40
    .line 41
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const/16 v1, 0x10

    .line 46
    .line 47
    invoke-static {p1, v1, p0, p2}, Lif3;->c(IILkj;Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_1
    sget-object p0, Lkf3;->a:Lkj;

    .line 52
    .line 53
    throw v0

    .line 54
    :cond_2
    invoke-virtual {p0}, Ljj;->a()Lkj;

    .line 55
    .line 56
    .line 57
    throw v0
.end method
