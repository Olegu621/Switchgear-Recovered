.class public final Lfs0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ltc1;
.implements Low0;
.implements Ltz1;
.implements Lq1;
.implements Lwp2;
.implements Lfz2;
.implements Lorg/chromium/support_lib_boundary/WebMessageCallbackBoundaryInterface;
.implements Lfi;
.implements Lc32;
.implements Lc3;


# static fields
.field public static c:Lfs0;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lfs0;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lrk1;

    .line 10
    .line 11
    invoke-direct {p1}, La91;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lfs0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance p0, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lfs0;->b:Ljava/lang/Object;

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 45
    iput p1, p0, Lfs0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    const/16 v0, 0x1b

    iput v0, p0, Lfs0;->a:I

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :cond_0
    iput-object p1, p0, Lfs0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/util/Size;Landroid/graphics/Rect;I)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lfs0;->a:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljg;

    .line 48
    invoke-direct {v0, p1, p2, p3}, Ljg;-><init>(Landroid/util/Size;Landroid/graphics/Rect;I)V

    .line 49
    iput-object v0, p0, Lfs0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lfs0;->a:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    move-result-object p1

    iput-object p1, p0, Lfs0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ler0;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lfs0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iget-object p1, p1, Ler0;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 34
    iput-object p1, p0, Lfs0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lgl2;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lfs0;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lfs0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 35
    iput p2, p0, Lfs0;->a:I

    iput-object p1, p0, Lfs0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    const/16 p1, 0x13

    iput p1, p0, Lfs0;->a:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lfs0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu03;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, Lfs0;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lfs0;->b:Ljava/lang/Object;

    return-void
.end method

.method public static k(Lmw0;)Lwb2;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    sget-object v1, Lnm2;->b:Lnm2;

    .line 6
    .line 7
    new-instance v2, Lwb2;

    .line 8
    .line 9
    new-instance v3, Landroid/util/Size;

    .line 10
    .line 11
    invoke-interface {p0}, Lmw0;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-interface {p0}, Lmw0;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-direct {v3, v4, v5}, Landroid/util/Size;-><init>(II)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lto;

    .line 23
    .line 24
    new-instance v5, Lhh2;

    .line 25
    .line 26
    invoke-interface {p0}, Lmw0;->x0()Lgw0;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-interface {v6}, Lgw0;->b()J

    .line 31
    .line 32
    .line 33
    move-result-wide v6

    .line 34
    invoke-direct {v5, v0, v6, v7, v1}, Lhh2;-><init>(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v4, v5}, Lto;-><init>(Lso;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, p0, v3, v4}, Lwb2;-><init>(Lmw0;Landroid/util/Size;Lgw0;)V

    .line 41
    .line 42
    .line 43
    return-object v2
.end method

.method public static y(Ljava/lang/String;)Lfs0;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Lok3;->e(C)Llk3;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    sget-object p0, Llk3;->b:Llk3;

    .line 26
    .line 27
    :goto_1
    new-instance v0, Lfs0;

    .line 28
    .line 29
    const/16 v1, 0x1d

    .line 30
    .line 31
    invoke-direct {v0, p0, v1}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lk8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lk8;->a()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lgc3;

    .line 2
    .line 3
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/google/android/gms/common/internal/service/zai;

    .line 10
    .line 11
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcom/google/android/gms/common/internal/TelemetryData;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/internal/base/zaa;->zaa()Landroid/os/Parcel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/base/zac;->zac(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/internal/base/zaa;->zad(ILandroid/os/Parcel;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    invoke-virtual {p2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public acquireLatestImage()Lmw0;
    .locals 0

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lk8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lk8;->acquireLatestImage()Lmw0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lfs0;->k(Lmw0;)Lwb2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public b(Lez2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lu03;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lu03;->c(Lez2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;

    .line 4
    .line 5
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 6
    .line 7
    iget-object v0, p1, Landroidx/activity/result/ActivityResult;->b:Landroid/content/Intent;

    .line 8
    .line 9
    const-string v1, "ProxyBillingActivityV2"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzf(Landroid/content/Intent;Ljava/lang/String;)Lkj;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget v2, v2, Lkj;->a:I

    .line 16
    .line 17
    iget-object v3, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->d:Landroid/os/ResultReceiver;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-virtual {v3, v2, v0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget p1, p1, Landroidx/activity/result/ActivityResult;->a:I

    .line 33
    .line 34
    const/4 v0, -0x1

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v3, "Alternative billing only dialog finished with resultCode "

    .line 42
    .line 43
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, " and billing\'s responseCode: "

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lk8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lk8;->close()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d()V
    .locals 0

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lk8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lk8;->d()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e(Lkj;Ljava/util/List;)V
    .locals 8

    .line 1
    iget v0, p1, Lkj;->a:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lsz1;

    .line 21
    .line 22
    iget-object v3, v2, Lsz1;->c:Lorg/json/JSONObject;

    .line 23
    .line 24
    const-string v4, "orderId"

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    const-string v3, ","

    .line 34
    .line 35
    invoke-virtual {v2}, Lsz1;->a()Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    new-instance v5, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_0

    .line 53
    .line 54
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Ljava/lang/CharSequence;

    .line 59
    .line 60
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_0

    .line 68
    .line 69
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    iget-object v3, v2, Lsz1;->c:Lorg/json/JSONObject;

    .line 74
    .line 75
    const-string v4, "purchaseToken"

    .line 76
    .line 77
    const-string v5, "token"

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    iget-object v2, v2, Lsz1;->c:Lorg/json/JSONObject;

    .line 87
    .line 88
    const-string v3, "purchaseState"

    .line 89
    .line 90
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    iget v1, p1, Lkj;->a:I

    .line 95
    .line 96
    const/4 v2, 0x2

    .line 97
    const/4 v3, 0x0

    .line 98
    if-eqz v1, :cond_5

    .line 99
    .line 100
    if-eq v1, v0, :cond_4

    .line 101
    .line 102
    if-eq v1, v2, :cond_3

    .line 103
    .line 104
    const/4 p2, 0x3

    .line 105
    if-eq v1, p2, :cond_3

    .line 106
    .line 107
    const/4 p2, 0x6

    .line 108
    if-eq v1, p2, :cond_3

    .line 109
    .line 110
    const/4 p2, 0x7

    .line 111
    if-eq v1, p2, :cond_2

    .line 112
    .line 113
    const/16 p2, 0xc

    .line 114
    .line 115
    if-eq v1, p2, :cond_3

    .line 116
    .line 117
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p0, Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 120
    .line 121
    invoke-static {p0, p1}, Lcom/supercell/titan/PurchaseManagerGoogle;->a(Lcom/supercell/titan/PurchaseManagerGoogle;Lkj;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_2
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 126
    .line 127
    move-object p2, p0

    .line 128
    check-cast p2, Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 129
    .line 130
    new-instance p0, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;

    .line 131
    .line 132
    invoke-direct {p0}, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;-><init>()V

    .line 133
    .line 134
    .line 135
    iget v1, p1, Lkj;->a:I

    .line 136
    .line 137
    iput v1, p0, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->errorCode:I

    .line 138
    .line 139
    iget-object p1, p1, Lkj;->b:Ljava/lang/String;

    .line 140
    .line 141
    iput-object p1, p0, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->localizedDescription:Ljava/lang/String;

    .line 142
    .line 143
    iget-object p1, p2, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 144
    .line 145
    iput-object p1, p0, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->productID:Ljava/lang/String;

    .line 146
    .line 147
    iget-object p1, p2, Lcom/supercell/titan/PurchaseManager;->b:Ljava/util/Vector;

    .line 148
    .line 149
    invoke-virtual {p1, p0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    const-string p0, ""

    .line 153
    .line 154
    iput-object p0, p2, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 155
    .line 156
    monitor-enter p2

    .line 157
    :try_start_0
    iget p0, p2, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 158
    .line 159
    sub-int/2addr p0, v0

    .line 160
    invoke-static {p0, v3}, Ljava/lang/Math;->max(II)I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    iput p0, p2, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 165
    .line 166
    monitor-exit p2

    .line 167
    return-void

    .line 168
    :catchall_0
    move-exception p0

    .line 169
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    throw p0

    .line 171
    :cond_3
    iget-object p2, p0, Lfs0;->b:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p2, Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 174
    .line 175
    new-instance v1, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;

    .line 176
    .line 177
    invoke-direct {v1}, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;-><init>()V

    .line 178
    .line 179
    .line 180
    iget v2, p1, Lkj;->a:I

    .line 181
    .line 182
    iput v2, v1, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->errorCode:I

    .line 183
    .line 184
    iget-object v2, p1, Lkj;->b:Ljava/lang/String;

    .line 185
    .line 186
    iput-object v2, v1, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->localizedDescription:Ljava/lang/String;

    .line 187
    .line 188
    iget-object v2, p2, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 189
    .line 190
    iput-object v2, v1, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->productID:Ljava/lang/String;

    .line 191
    .line 192
    iget-object v2, p2, Lcom/supercell/titan/PurchaseManager;->b:Ljava/util/Vector;

    .line 193
    .line 194
    invoke-virtual {v2, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    const-string v1, ""

    .line 198
    .line 199
    iput-object v1, p2, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 200
    .line 201
    monitor-enter p2

    .line 202
    :try_start_1
    iget v1, p2, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 203
    .line 204
    sub-int/2addr v1, v0

    .line 205
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    iput v0, p2, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 210
    .line 211
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 212
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast p0, Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 215
    .line 216
    invoke-static {p0, p1}, Lcom/supercell/titan/PurchaseManagerGoogle;->a(Lcom/supercell/titan/PurchaseManagerGoogle;Lkj;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :catchall_1
    move-exception p0

    .line 221
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 222
    throw p0

    .line 223
    :cond_4
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast p0, Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 226
    .line 227
    iget-object p1, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 228
    .line 229
    const-string p2, ""

    .line 230
    .line 231
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    if-nez p1, :cond_d

    .line 236
    .line 237
    iget-object p1, p0, Lcom/supercell/titan/PurchaseManager;->c:Ljava/util/Vector;

    .line 238
    .line 239
    iget-object p2, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {p1, p2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    const-string p1, ""

    .line 245
    .line 246
    iput-object p1, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 247
    .line 248
    monitor-enter p0

    .line 249
    :try_start_3
    iget p1, p0, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 250
    .line 251
    sub-int/2addr p1, v0

    .line 252
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    iput p1, p0, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 257
    .line 258
    monitor-exit p0

    .line 259
    return-void

    .line 260
    :catchall_2
    move-exception p1

    .line 261
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 262
    throw p1

    .line 263
    :cond_5
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast p0, Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 266
    .line 267
    if-eqz p2, :cond_d

    .line 268
    .line 269
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result p2

    .line 277
    if-eqz p2, :cond_d

    .line 278
    .line 279
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    check-cast p2, Lsz1;

    .line 284
    .line 285
    iget-object v1, p2, Lsz1;->a:Ljava/lang/String;

    .line 286
    .line 287
    if-eqz v1, :cond_6

    .line 288
    .line 289
    :try_start_4
    iget-object v1, p2, Lsz1;->b:Ljava/lang/String;

    .line 290
    .line 291
    if-eqz v1, :cond_6

    .line 292
    .line 293
    iget-object v1, p2, Lsz1;->c:Lorg/json/JSONObject;

    .line 294
    .line 295
    const-string v4, "purchaseToken"

    .line 296
    .line 297
    const-string v5, "token"

    .line 298
    .line 299
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-virtual {v1, v5, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {p2}, Lsz1;->a()Ljava/util/ArrayList;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    if-nez v5, :cond_6

    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-nez v5, :cond_6

    .line 322
    .line 323
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    check-cast v4, Ljava/lang/String;

    .line 328
    .line 329
    new-instance v5, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;

    .line 330
    .line 331
    invoke-direct {v5}, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;-><init>()V

    .line 332
    .line 333
    .line 334
    iget-object v6, p2, Lsz1;->c:Lorg/json/JSONObject;

    .line 335
    .line 336
    const-string v7, "orderId"

    .line 337
    .line 338
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    if-eqz v7, :cond_7

    .line 347
    .line 348
    const/4 v6, 0x0

    .line 349
    :cond_7
    iput-object v6, v5, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->transactionId:Ljava/lang/String;

    .line 350
    .line 351
    iput-object v4, v5, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->productID:Ljava/lang/String;

    .line 352
    .line 353
    iget-object v6, p2, Lsz1;->a:Ljava/lang/String;

    .line 354
    .line 355
    iput-object v6, v5, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->receipt:Ljava/lang/String;

    .line 356
    .line 357
    iget-object v6, p2, Lsz1;->b:Ljava/lang/String;

    .line 358
    .line 359
    iput-object v6, v5, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->signature:Ljava/lang/String;

    .line 360
    .line 361
    iput-object v1, v5, Lcom/supercell/titan/PurchaseManager$PurchaseInfo;->purchaseToken:Ljava/lang/String;

    .line 362
    .line 363
    iget-object v1, p0, Lcom/supercell/titan/PurchaseManager;->g:Ljava/util/LinkedHashMap;

    .line 364
    .line 365
    if-eqz v4, :cond_6

    .line 366
    .line 367
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    if-eqz v6, :cond_8

    .line 372
    .line 373
    goto :goto_2

    .line 374
    :cond_8
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    if-nez v6, :cond_9

    .line 379
    .line 380
    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-eqz v1, :cond_6

    .line 385
    .line 386
    :cond_9
    iget-object p2, p2, Lsz1;->c:Lorg/json/JSONObject;

    .line 387
    .line 388
    const-string v1, "purchaseState"

    .line 389
    .line 390
    invoke-virtual {p2, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 391
    .line 392
    .line 393
    move-result p2

    .line 394
    const/4 v1, 0x4

    .line 395
    if-eq p2, v1, :cond_a

    .line 396
    .line 397
    move p2, v0

    .line 398
    goto :goto_3

    .line 399
    :cond_a
    move p2, v2

    .line 400
    :goto_3
    if-eq p2, v0, :cond_b

    .line 401
    .line 402
    goto/16 :goto_2

    .line 403
    .line 404
    :cond_b
    iget-object p2, p0, Lcom/supercell/titan/PurchaseManager;->a:Ljava/util/Vector;

    .line 405
    .line 406
    invoke-virtual {p2, v5}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    iget-object p2, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 410
    .line 411
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result p2

    .line 415
    if-eqz p2, :cond_c

    .line 416
    .line 417
    const-string p2, ""

    .line 418
    .line 419
    iput-object p2, p0, Lcom/supercell/titan/PurchaseManagerGoogle;->t:Ljava/lang/String;

    .line 420
    .line 421
    goto :goto_4

    .line 422
    :catch_0
    move-exception p2

    .line 423
    goto :goto_5

    .line 424
    :cond_c
    :goto_4
    monitor-enter p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 425
    :try_start_5
    iget p2, p0, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 426
    .line 427
    sub-int/2addr p2, v0

    .line 428
    invoke-static {p2, v3}, Ljava/lang/Math;->max(II)I

    .line 429
    .line 430
    .line 431
    move-result p2

    .line 432
    iput p2, p0, Lcom/supercell/titan/PurchaseManager;->h:I

    .line 433
    .line 434
    monitor-exit p0

    .line 435
    goto/16 :goto_2

    .line 436
    .line 437
    :catchall_3
    move-exception p2

    .line 438
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 439
    :try_start_6
    throw p2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 440
    :goto_5
    invoke-static {p2}, Lcom/supercell/titan/GameApp;->debuggerException(Ljava/lang/Exception;)V

    .line 441
    .line 442
    .line 443
    goto/16 :goto_2

    .line 444
    .line 445
    :cond_d
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lfs0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljg;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljg;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lnw0;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk8;

    .line 4
    .line 5
    new-instance v1, Lpn;

    .line 6
    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    invoke-direct {v1, v2, p0, p1}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, p2}, Lk8;->f(Lnw0;Ljava/util/concurrent/Executor;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public g()I
    .locals 0

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lk8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lk8;->g()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lk8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lk8;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    .line 2
    .line 3
    filled-new-array {p0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 0

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lk8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lk8;->getSurface()Landroid/view/Surface;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lk8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lk8;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public h()Lmw0;
    .locals 0

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lk8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lk8;->h()Lmw0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lfs0;->k(Lmw0;)Lwb2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lfs0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljg;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljg;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized i(Lw31;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    invoke-static {p1}, Lr22;->e(Lw31;)Li31;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lw31;->A()Lwq1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, v0, p1}, Lfs0;->l(Li31;Lwq1;)Lh41;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :try_start_2
    monitor-exit p0

    .line 16
    iget-object v0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lf41;

    .line 19
    .line 20
    invoke-virtual {v0}, Loq0;->e()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Loq0;->b:Lsq0;

    .line 24
    .line 25
    check-cast v0, Li41;

    .line 26
    .line 27
    invoke-static {v0, p1}, Li41;->x(Li41;Lh41;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 34
    :try_start_4
    throw p1

    .line 35
    :goto_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 36
    throw p1

    .line 37
    :catchall_1
    move-exception p1

    .line 38
    goto :goto_0
.end method

.method public j(Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->s(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    .line 21
    move v1, v2

    .line 22
    :cond_0
    iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->d:I

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    :cond_1
    if-ne v0, v2, :cond_3

    .line 29
    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    neg-int v0, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b:Lfs0;

    .line 50
    .line 51
    if-eqz p0, :cond_4

    .line 52
    .line 53
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Lcom/supercell/titan/k;

    .line 56
    .line 57
    iget-object p0, p0, Lcom/supercell/titan/k;->b:Lcom/supercell/titan/ScInfoBox;

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/supercell/titan/ScInfoBox;->dismiss()V

    .line 60
    .line 61
    .line 62
    :cond_4
    return v2

    .line 63
    :cond_5
    return v1
.end method

.method public declared-synchronized l(Li31;Lwq1;)Lh41;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    invoke-static {}, Lp13;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    :goto_0
    invoke-virtual {p0, v0}, Lfs0;->u(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lp13;->a()I

    .line 14
    .line 15
    .line 16
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :try_start_2
    monitor-exit p0

    .line 21
    sget-object v1, Lwq1;->b:Lwq1;

    .line 22
    .line 23
    if-eq p2, v1, :cond_1

    .line 24
    .line 25
    invoke-static {}, Lh41;->F()Lg41;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Loq0;->e()V

    .line 30
    .line 31
    .line 32
    iget-object v2, v1, Loq0;->b:Lsq0;

    .line 33
    .line 34
    check-cast v2, Lh41;

    .line 35
    .line 36
    invoke-static {v2, p1}, Lh41;->w(Lh41;Li31;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Loq0;->e()V

    .line 40
    .line 41
    .line 42
    iget-object p1, v1, Loq0;->b:Lsq0;

    .line 43
    .line 44
    check-cast p1, Lh41;

    .line 45
    .line 46
    invoke-static {p1, v0}, Lh41;->z(Lh41;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Loq0;->e()V

    .line 50
    .line 51
    .line 52
    iget-object p1, v1, Loq0;->b:Lsq0;

    .line 53
    .line 54
    check-cast p1, Lh41;

    .line 55
    .line 56
    invoke-static {p1}, Lh41;->y(Lh41;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Loq0;->e()V

    .line 60
    .line 61
    .line 62
    iget-object p1, v1, Loq0;->b:Lsq0;

    .line 63
    .line 64
    check-cast p1, Lh41;

    .line 65
    .line 66
    invoke-static {p1, p2}, Lh41;->x(Lh41;Lwq1;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Loq0;->b()Lsq0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Lh41;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    .line 75
    monitor-exit p0

    .line 76
    return-object p1

    .line 77
    :catchall_1
    move-exception p1

    .line 78
    goto :goto_2

    .line 79
    :cond_1
    :try_start_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 80
    .line 81
    const-string p2, "unknown output prefix type"

    .line 82
    .line 83
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 87
    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 88
    :try_start_5
    throw p1

    .line 89
    :goto_2
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 90
    throw p1
.end method

.method public m()Leb2;
    .locals 5

    .line 1
    new-instance v0, Leb2;

    .line 2
    .line 3
    invoke-direct {v0}, Leb2;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lxy2;

    .line 40
    .line 41
    iget-boolean v4, v3, Lxy2;->e:Z

    .line 42
    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    iget-object v3, v3, Lxy2;->a:Lfb2;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Leb2;->a(Lfb2;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    const-string p0, "UseCaseAttachState"

    .line 64
    .line 65
    invoke-static {p0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    return-object v0
.end method

.method public n()Ljava/util/Collection;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lxy2;

    .line 35
    .line 36
    iget-boolean v2, v2, Lxy2;->e:Z

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lxy2;

    .line 45
    .line 46
    iget-object v1, v1, Lxy2;->a:Lfb2;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method public o()Ljava/util/Collection;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lxy2;

    .line 35
    .line 36
    iget-boolean v2, v2, Lxy2;->e:Z

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lxy2;

    .line 45
    .line 46
    iget-object v1, v1, Lxy2;->b:Lzy2;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method public onMessage(Ljava/lang/reflect/InvocationHandler;Ljava/lang/reflect/InvocationHandler;)V
    .locals 1

    .line 1
    const-class v0, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    .line 2
    .line 3
    invoke-static {v0, p2}, Lj13;->b(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    .line 8
    .line 9
    invoke-static {p2}, Lh63;->a(Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;)Li63;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lk63;

    .line 18
    .line 19
    new-instance v0, Lm63;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lm63;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, p2}, Lk63;->onMessage(Ll63;Li63;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public p(Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lyk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lyk2;

    .line 7
    .line 8
    iget v1, v0, Lyk2;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lyk2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyk2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lyk2;-><init>(Lfs0;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lyk2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lyk2;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lyk2;->a:Lfs0;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    iget-object p2, p0, Lfs0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p2, Lgl2;

    .line 55
    .line 56
    iput-object p0, v0, Lyk2;->a:Lfs0;

    .line 57
    .line 58
    iput v3, v0, Lyk2;->d:I

    .line 59
    .line 60
    invoke-virtual {p2, p1, v0}, Lgl2;->a(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    sget-object p1, Lo42;->b:Lm42;

    .line 68
    .line 69
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Lgl2;

    .line 72
    .line 73
    iget-object p0, p0, Lgl2;->d:Lcom/usercentrics/tcf/core/model/gvl/Declarations;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    .line 77
    .line 78
    return-object p0

    .line 79
    :catch_0
    move-exception p0

    .line 80
    sget-object p1, Lo42;->b:Lm42;

    .line 81
    .line 82
    new-instance p1, Lvz2;

    .line 83
    .line 84
    const-string p2, "Unable to initialise due to poor or no network connection while fetching the TCF data."

    .line 85
    .line 86
    invoke-direct {p1, p2, p0}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    new-instance p0, Ln42;

    .line 90
    .line 91
    invoke-direct {p0, p1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    return-object p0
.end method

.method public declared-synchronized q()Lec;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lf41;

    .line 5
    .line 6
    invoke-virtual {v0}, Loq0;->b()Lsq0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Li41;

    .line 11
    .line 12
    invoke-static {v0}, Lec;->s(Li41;)Lec;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit p0

    .line 17
    return-object v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw v0
.end method

.method public r(Ljava/lang/String;)Lng2;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ltg2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p1}, Ltg2;->a()Lng2;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p1
.end method

.method public s(Ld10;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lzk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lzk2;

    .line 7
    .line 8
    iget v1, v0, Lzk2;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lzk2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzk2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lzk2;-><init>(Lfs0;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lzk2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lzk2;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lzk2;->a:Lfs0;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    iget-object p1, p0, Lfs0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lgl2;

    .line 55
    .line 56
    iput-object p0, v0, Lzk2;->a:Lfs0;

    .line 57
    .line 58
    iput v3, v0, Lzk2;->d:I

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Lgl2;->b(Ld10;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    sget-object p1, Lo42;->b:Lm42;

    .line 68
    .line 69
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Lgl2;

    .line 72
    .line 73
    iget-object p0, p0, Lgl2;->c:Lcom/usercentrics/tcf/core/model/gvl/VendorList;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    .line 77
    .line 78
    return-object p0

    .line 79
    :catch_0
    move-exception p0

    .line 80
    sget-object p1, Lo42;->b:Lm42;

    .line 81
    .line 82
    new-instance p1, Lvz2;

    .line 83
    .line 84
    const-string v0, "Unable to initialise due to poor or no network connection while fetching the TCF data."

    .line 85
    .line 86
    invoke-direct {p1, v0, p0}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    new-instance p0, Ln42;

    .line 90
    .line 91
    invoke-direct {p0, p1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    return-object p0
.end method

.method public t(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lxy2;

    .line 18
    .line 19
    iget-boolean p0, p0, Lxy2;->e:Z

    .line 20
    .line 21
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lfs0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljg;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljg;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized u(I)Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lf41;

    .line 5
    .line 6
    iget-object v0, v0, Loq0;->b:Lsq0;

    .line 7
    .line 8
    check-cast v0, Li41;

    .line 9
    .line 10
    invoke-virtual {v0}, Li41;->A()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lh41;

    .line 33
    .line 34
    invoke-virtual {v1}, Lh41;->B()I

    .line 35
    .line 36
    .line 37
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    if-ne v1, p1, :cond_0

    .line 39
    .line 40
    monitor-exit p0

    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    monitor-exit p0

    .line 46
    const/4 p0, 0x0

    .line 47
    return p0

    .line 48
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw p1
.end method

.method public v()V
    .locals 3

    .line 1
    iget-object v0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcb3;

    .line 4
    .line 5
    iget-object v0, v0, Lcb3;->o:Lur0;

    .line 6
    .line 7
    iget-object v0, v0, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 8
    .line 9
    new-instance v1, Lbb3;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, p0, v2}, Lbb3;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public w(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    new-instance v0, Lf62;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p1, v1}, Lf62;-><init>(Ljava/lang/Runnable;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p0

    .line 16
    const-string p1, "HSThreader"

    .line 17
    .line 18
    const-string v0, "Error while submitting request."

    .line 19
    .line 20
    invoke-static {p1, v0, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public x(Ljava/lang/String;Lfb2;Lzy2;Lpg;Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Lxy2;

    .line 13
    .line 14
    invoke-direct {v0, p2, p3, p4, p5}, Lxy2;-><init>(Lfb2;Lzy2;Lpg;Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Lxy2;

    .line 22
    .line 23
    iget-boolean p3, p2, Lxy2;->e:Z

    .line 24
    .line 25
    iput-boolean p3, v0, Lxy2;->e:Z

    .line 26
    .line 27
    iget-boolean p2, p2, Lxy2;->f:Z

    .line 28
    .line 29
    iput-boolean p2, v0, Lxy2;->f:Z

    .line 30
    .line 31
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method
