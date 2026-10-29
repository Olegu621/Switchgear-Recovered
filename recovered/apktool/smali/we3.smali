.class public final synthetic Lwe3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:Lgf3;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lgf3;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwe3;->a:Lgf3;

    .line 5
    .line 6
    iput p2, p0, Lwe3;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/zzr;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lwe3;->a:Lgf3;

    .line 2
    .line 3
    iget p0, p0, Lwe3;->b:I

    .line 4
    .line 5
    :try_start_0
    iget-object v1, v0, Lgf3;->D:Lcom/google/android/gms/internal/play_billing/zzav;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lgf3;->D:Lcom/google/android/gms/internal/play_billing/zzav;

    .line 10
    .line 11
    iget-object v2, v0, Lgf3;->B:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    packed-switch p0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    const-string p0, "QUERY_SKU_DETAILS_ASYNC"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :pswitch_0
    const-string p0, "QUERY_PRODUCT_DETAILS_ASYNC"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_1
    const-string p0, "START_CONNECTION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_2
    const-string p0, "IS_FEATURE_SUPPORTED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_3
    const-string p0, "CONSUME_ASYNC"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_4
    const-string p0, "ACKNOWLEDGE_PURCHASE"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_5
    const-string p0, "LAUNCH_BILLING_FLOW"

    .line 41
    .line 42
    :goto_0
    new-instance v3, Lxe3;

    .line 43
    .line 44
    invoke-direct {v3, p1}, Lxe3;-><init>(Lcom/google/android/gms/internal/play_billing/zzr;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, v2, p0, v3}, Lcom/google/android/gms/internal/play_billing/zzav;->zza(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/play_billing/zzax;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_0
    const/4 p0, 0x0

    .line 52
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    :goto_1
    const/16 v1, 0x1c

    .line 54
    .line 55
    sget-object v2, Lkf3;->s:Lkj;

    .line 56
    .line 57
    const/16 v3, 0x6b

    .line 58
    .line 59
    invoke-virtual {v0, v3, v1, v2}, Lgf3;->G(IILkj;)V

    .line 60
    .line 61
    .line 62
    const-string v0, "BillingClientTesting"

    .line 63
    .line 64
    const-string v1, "An error occurred while retrieving billing override."

    .line 65
    .line 66
    invoke-static {v0, v1, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/play_billing/zzr;->zzb(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :goto_2
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
