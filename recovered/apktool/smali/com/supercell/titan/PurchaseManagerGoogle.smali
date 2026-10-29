.class public Lcom/supercell/titan/PurchaseManagerGoogle;
.super Lcom/supercell/titan/PurchaseManager;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final PURCHASE_REQUEST_CODE:I


# instance fields
.field public final o:Lfs0;

.field public final p:Lej;

.field public final q:Ljava/util/HashMap;

.field public final r:Ljava/util/HashMap;

.field public final s:Ljava/util/HashMap;

.field public t:Ljava/lang/String;

.field public u:Lkj;

.field public v:Z

.field public w:Z

.field public x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/supercell/titan/PurchaseManagerGoogle;

    const v1, 0x1

    const v0, 0x989684

    sput v0, Lcom/supercell/titan/PurchaseManagerGoogle;->PURCHASE_REQUEST_CODE:I

    return-void
.end method

.method public constructor <init>(Lcom/supercell/titan/GameApp;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/supercell/titan/PurchaseManager;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lfs0;

    .line 5
    .line 6
    const/16 p2, 0x8

    .line 7
    .line 8
    invoke-direct {p1, p0, p2}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->o:Lfs0;

    .line 12
    .line 13
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    new-instance v0, Lcj;

    .line 18
    .line 19
    invoke-direct {v0, p2}, Lcj;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, v0, Lcj;->c:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance p1, Lec0;

    .line 25
    .line 26
    const/16 p2, 0x17

    .line 27
    .line 28
    invoke-direct {p1, p2}, Lec0;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, v0, Lcj;->b:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcj;->a()Lej;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->p:Lej;

    .line 38
    .line 39
    new-instance p2, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->q:Ljava/util/HashMap;

    .line 45
    .line 46
    new-instance p2, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->r:Ljava/util/HashMap;

    .line 52
    .line 53
    new-instance p2, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->s:Ljava/util/HashMap;

    .line 59
    .line 60
    const-string p2, ""

    .line 61
    .line 62
    iput-object p2, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->v:Z

    .line 66
    .line 67
    iput-boolean v0, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->w:Z

    .line 68
    .line 69
    iput-object p2, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->x:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {}, Lkj;->a()Ljj;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    const/4 v0, 0x3

    .line 76
    iput v0, p2, Ljj;->a:I

    .line 77
    .line 78
    const-string v0, "onBillingServiceDisconnected"

    .line 79
    .line 80
    iput-object v0, p2, Ljj;->b:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljj;->a()Lkj;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    iput-object p2, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->u:Lkj;

    .line 87
    .line 88
    new-instance p2, Lts0;

    .line 89
    .line 90
    invoke-direct {p2, p0}, Lts0;-><init>(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p2}, Lej;->g(Lfj;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public static a(Lcom/supercell/titan/PurchaseManagerGoogle;Lkj;)V
    .locals 2

    .line 1
    const/16 p0, 0x3e8

    .line 2
    .line 3
    sget-object v0, Lcom/supercell/titan/SentryTitan;->a:Ljava/util/Random;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/Random;->nextInt(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-gtz p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 12
    .line 13
    iget p0, p1, Lkj;->a:I

    .line 14
    .line 15
    iget-object p1, p1, Lkj;->b:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const v1, 0x216

    const-string v1, "Google BillingClient billing result was unhandled with code: "

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const p0, 0x217

    const-string p0, " and message: "

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lcom/supercell/titan/SentryTitan;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->w:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    if-nez p1, :cond_4

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->u:Lkj;

    .line 12
    .line 13
    iget p1, p1, Lkj;->a:I

    .line 14
    .line 15
    if-nez p1, :cond_3

    .line 16
    .line 17
    iget-object p1, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->o:Lfs0;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    new-instance v0, Lx6;

    .line 23
    .line 24
    const/16 v1, 0xd

    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->p:Lej;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lej;->c()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/16 v1, 0x9

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    sget-object p1, Lkf3;->j:Lkj;

    .line 43
    .line 44
    const/4 v2, 0x2

    .line 45
    invoke-virtual {p0, v2, v1, p1}, Lej;->x(IILkj;)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p1, p0}, Lx6;->g(Lkj;Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    const p1, 0x218

    const-string p1, "inapp"

    .line 57
    .line 58
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    const p1, 0x219

    const-string p1, "BillingClient"

    .line 65
    .line 66
    const v2, 0x21a

    const-string v2, "Please provide a valid product type."

    .line 67
    .line 68
    invoke-static {p1, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sget-object p1, Lkf3;->f:Lkj;

    .line 72
    .line 73
    const/16 v2, 0x32

    .line 74
    .line 75
    invoke-virtual {p0, v2, v1, p1}, Lej;->x(IILkj;)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {v0, p1, p0}, Lx6;->g(Lkj;Ljava/util/List;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    new-instance v2, Lyd3;

    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    invoke-direct {v2, p1, p0, v0}, Lyd3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance v5, Ldp0;

    .line 93
    .line 94
    const/16 p1, 0x17

    .line 95
    .line 96
    invoke-direct {v5, p1, p0, v0}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lej;->u()Landroid/os/Handler;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {p0}, Lej;->l()Ljava/util/concurrent/ExecutorService;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    const-wide/16 v3, 0x7530

    .line 108
    .line 109
    invoke-static/range {v2 .. v7}, Lej;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-nez p1, :cond_4

    .line 114
    .line 115
    invoke-virtual {p0}, Lej;->i()Lkj;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    const/16 v2, 0x19

    .line 120
    .line 121
    invoke-virtual {p0, v2, v1, p1}, Lej;->x(IILkj;)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {v0, p1, p0}, Lx6;->g(Lkj;Ljava/util/List;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_3
    const p0, 0x21b

    const-string p0, "PurchaseManagerGoogle"

    .line 133
    .line 134
    const p1, 0x21c

    const-string p1, "getPendingPurchases() billingInitResult != BillingClient.BillingResponseCode.OK"

    .line 135
    .line 136
    invoke-static {p0, p1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    :cond_4
    return-void
.end method

.method public doSignInAfterGoogleLogin()V
    .locals 0

    .line 1
    return-void
.end method

.method public getProductDetailsImplementation(Ljava/lang/String;)Lcom/supercell/titan/PurchaseManager$ProductInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->q:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/supercell/titan/PurchaseManager$ProductInfo;

    .line 8
    .line 9
    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public isBillingAvailable()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->p:Lej;

    .line 2
    .line 3
    invoke-virtual {p0}, Lej;->c()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/supercell/titan/PurchaseManager;->onDestroy()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/supercell/titan/PurchaseManager;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->w:Z

    .line 6
    .line 7
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/supercell/titan/PurchaseManager;->onResume()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->w:Z

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/supercell/titan/PurchaseManagerGoogle;->b(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
