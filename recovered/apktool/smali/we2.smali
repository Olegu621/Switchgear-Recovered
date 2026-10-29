.class public final Lwe2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lxo0;
.implements Ljp1;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Ljf3;
.implements Lcom/google/android/gms/internal/measurement/zzo;
.implements Lqk3;
.implements Ljd3;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Lwe2;->a:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :sswitch_0
    sget-object p1, Lpr0;->d:Lpr0;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroid/util/SparseIntArray;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p1, p0, Lwe2;->b:Ljava/lang/Object;

    .line 23
    .line 24
    return-void

    .line 25
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance p1, Ljava/util/WeakHashMap;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 38
    .line 39
    new-instance p1, Ljava/util/WeakHashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lwe2;->b:Ljava/lang/Object;

    .line 49
    .line 50
    return-void

    .line 51
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance p1, Lle2;

    .line 55
    .line 56
    invoke-direct {p1}, Lle2;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 60
    .line 61
    new-instance p1, Lta1;

    .line 62
    .line 63
    invoke-direct {p1}, Lta1;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lwe2;->b:Ljava/lang/Object;

    .line 67
    .line 68
    return-void

    .line 69
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance p1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lwe2;->b:Ljava/lang/Object;

    .line 78
    .line 79
    new-instance p1, Lug2;

    .line 80
    .line 81
    invoke-direct {p1}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 85
    .line 86
    return-void

    .line 87
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_3
        0xb -> :sswitch_2
        0x10 -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 111
    iput p1, p0, Lwe2;->a:I

    iput-object p2, p0, Lwe2;->b:Ljava/lang/Object;

    iput-object p3, p0, Lwe2;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lwe2;->a:I

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 89
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lwe2;->b:Ljava/lang/Object;

    .line 90
    sget v0, Lcom/google/android/gms/common/R$string;->common_google_play_services_unknown_issue:I

    .line 91
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/zzku;)V
    .locals 5

    const/16 v0, 0x12

    iput v0, p0, Lwe2;->a:I

    .line 92
    new-instance v0, Lzr3;

    .line 93
    invoke-direct {v0}, Lzr3;-><init>()V

    :try_start_0
    invoke-static {p1}, Lyr2;->b(Landroid/content/Context;)V

    .line 94
    invoke-static {}, Lyr2;->a()Lyr2;

    move-result-object p1

    sget-object v1, Lgm;->e:Lgm;

    .line 95
    invoke-virtual {p1, v1}, Lyr2;->c(Lgm;)Lxr2;

    move-result-object p1

    const-string v1, "PLAY_BILLING_LIBRARY"

    const-string v2, "proto"

    .line 96
    new-instance v3, Lvd0;

    invoke-direct {v3, v2}, Lvd0;-><init>(Ljava/lang/String;)V

    .line 97
    new-instance v2, Lq62;

    const/16 v4, 0x1b

    .line 98
    invoke-direct {v2, v4}, Lq62;-><init>(I)V

    .line 99
    invoke-virtual {p1, v1, v3, v2}, Lxr2;->a(Ljava/lang/String;Lvd0;Ler2;)Lb5;

    move-result-object p1

    iput-object p1, v0, Lzr3;->c:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p1, 0x1

    iput-boolean p1, v0, Lzr3;->b:Z

    .line 100
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    iput-object p2, p0, Lwe2;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 3

    const/16 v0, 0x19

    iput v0, p0, Lwe2;->a:I

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.os.IMessenger"

    .line 102
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 103
    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p1}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, Lwe2;->c:Ljava/lang/Object;

    iput-object v2, p0, Lwe2;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const-string v1, "com.google.android.gms.iid.IMessengerCompat"

    .line 104
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 105
    new-instance v0, Lcom/google/android/gms/cloudmessaging/zzd;

    .line 106
    invoke-direct {v0, p1}, Lcom/google/android/gms/cloudmessaging/zzd;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    iput-object v2, p0, Lwe2;->c:Ljava/lang/Object;

    :goto_0
    return-void

    .line 107
    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "MessengerIpcClient"

    const-string v0, "Invalid interface descriptor: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 108
    invoke-static {p1, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    new-instance p0, Landroid/os/RemoteException;

    invoke-direct {p0}, Landroid/os/RemoteException;-><init>()V

    throw p0
.end method

.method public constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lwe2;->a:I

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe2;->b:Ljava/lang/Object;

    .line 125
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 87
    iput p3, p0, Lwe2;->a:I

    iput-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    iput-object p2, p0, Lwe2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lwe2;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    iput-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 117
    iput-object p2, p0, Lwe2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Llo3;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Lwe2;->a:I

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm23;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lwe2;->a:I

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 120
    new-instance p1, Ll23;

    .line 121
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 122
    iput v0, p1, Ll23;->a:I

    .line 123
    iput-object p1, p0, Lwe2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lod2;Lod2;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lwe2;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 114
    iput-object p2, p0, Lwe2;->b:Ljava/lang/Object;

    return-void
.end method

.method public static d(Lmv1;Lra2;)Lzt2;
    .locals 6

    .line 1
    iget-object p0, p0, Lmv1;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Lyy1;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lzt2;

    .line 14
    .line 15
    iget-object p0, p1, Lra2;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lnv1;

    .line 18
    .line 19
    iget-object p0, p0, Lnv1;->a:Lru1;

    .line 20
    .line 21
    iget-object v1, p0, Lru1;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p0, Lru1;->a:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v5, 0x4

    .line 27
    invoke-direct/range {v0 .. v5}, Lzt2;-><init>(Ljava/lang/String;Ljava/lang/String;Lwe2;Ljava/util/List;I)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static e(Lmv1;Lra2;)Lzt2;
    .locals 6

    .line 1
    iget-object p0, p0, Lmv1;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Lyy1;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lzt2;

    .line 14
    .line 15
    iget-object p0, p1, Lra2;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lnv1;

    .line 18
    .line 19
    iget-object p0, p0, Lnv1;->c:Lru1;

    .line 20
    .line 21
    iget-object v1, p0, Lru1;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p0, Lru1;->a:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v5, 0x4

    .line 27
    invoke-direct/range {v0 .. v5}, Lzt2;-><init>(Ljava/lang/String;Ljava/lang/String;Lwe2;Ljava/util/List;I)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static f(Lmv1;Lra2;)Lzt2;
    .locals 6

    .line 1
    iget-object p0, p0, Lmv1;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Lyy1;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lzt2;

    .line 14
    .line 15
    iget-object p0, p1, Lra2;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lnv1;

    .line 18
    .line 19
    iget-object v1, p0, Lnv1;->d:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v5, 0x6

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct/range {v0 .. v5}, Lzt2;-><init>(Ljava/lang/String;Ljava/lang/String;Lwe2;Ljava/util/List;I)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static g(Lmv1;Lra2;)Lxt2;
    .locals 6

    .line 1
    iget-object p0, p0, Lmv1;->o:Lkv1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lkv1;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p0, v0

    .line 10
    :goto_0
    if-eqz p0, :cond_3

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    iget-object v0, p1, Lra2;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lnv1;

    .line 22
    .line 23
    iget-object v0, v0, Lnv1;->f:Lru1;

    .line 24
    .line 25
    iget-object v0, v0, Lru1;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->C(Ljava/util/List;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/16 v2, 0xa

    .line 34
    .line 35
    invoke-static {p0, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lvu1;

    .line 57
    .line 58
    new-instance v3, Lrt2;

    .line 59
    .line 60
    iget-boolean v4, v2, Lvu1;->a:Z

    .line 61
    .line 62
    iget-object v5, v2, Lvu1;->c:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v2, v2, Lvu1;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-direct {v3, v5, v2, v4}, Lrt2;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget-object p0, p1, Lra2;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Leq2;

    .line 76
    .line 77
    iget-object p1, p0, Leq2;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Ljava/lang/String;

    .line 80
    .line 81
    iget-object p0, p0, Leq2;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Ljava/lang/String;

    .line 84
    .line 85
    new-instance v2, Lxt2;

    .line 86
    .line 87
    invoke-direct {v2, v0, v1, p1, p0}, Lxt2;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v2

    .line 91
    :cond_3
    :goto_2
    return-object v0
.end method

.method public static h(Lmv1;Lra2;)Lzt2;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lmv1;->j:Lhv1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lhv1;->c:Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v2, v1

    .line 15
    :goto_0
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-static {v2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    :cond_2
    :goto_1
    if-eqz p0, :cond_3

    .line 28
    .line 29
    iget-object p0, p0, Lhv1;->a:Ljava/lang/String;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_3
    move-object p0, v1

    .line 33
    :goto_2
    if-eqz p0, :cond_6

    .line 34
    .line 35
    invoke-static {p0}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-lez v2, :cond_5

    .line 47
    .line 48
    const-string v2, "\n"

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_5
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_6
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v5}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_7

    .line 65
    .line 66
    new-instance v3, Lzt2;

    .line 67
    .line 68
    iget-object p0, p1, Lra2;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Lnv1;

    .line 71
    .line 72
    iget-object v4, p0, Lnv1;->h:Ljava/lang/String;

    .line 73
    .line 74
    const/4 v7, 0x0

    .line 75
    const/16 v8, 0xc

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-direct/range {v3 .. v8}, Lzt2;-><init>(Ljava/lang/String;Ljava/lang/String;Lwe2;Ljava/util/List;I)V

    .line 79
    .line 80
    .line 81
    return-object v3

    .line 82
    :cond_7
    return-object v1
.end method

.method public static i(Lmv1;Lra2;)Lzt2;
    .locals 7

    .line 1
    iget-object v0, p0, Lmv1;->i:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lzt2;

    .line 10
    .line 11
    iget-object p1, p1, Lra2;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lnv1;

    .line 14
    .line 15
    iget-object v2, p1, Lnv1;->e:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v3, p0, Lmv1;->i:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/16 v6, 0xc

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-direct/range {v1 .. v6}, Lzt2;-><init>(Ljava/lang/String;Ljava/lang/String;Lwe2;Ljava/util/List;I)V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method


# virtual methods
.method public a(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    new-instance v0, Lq62;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lq62;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lug2;

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public b(Landroidx/recyclerview/widget/o;Lm12;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lle2;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lp33;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lp33;->a()Lp33;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, p1, v0}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    iput-object p2, v0, Lp33;->c:Lm12;

    .line 22
    .line 23
    iget p0, v0, Lp33;->a:I

    .line 24
    .line 25
    or-int/lit8 p0, p0, 0x8

    .line 26
    .line 27
    iput p0, v0, Lp33;->a:I

    .line 28
    .line 29
    return-void
.end method

.method public c(IIII)Landroid/view/View;
    .locals 8

    .line 1
    iget-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll23;

    .line 4
    .line 5
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lm23;

    .line 8
    .line 9
    invoke-interface {p0}, Lm23;->b()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p0}, Lm23;->c()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-le p2, p1, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, -0x1

    .line 22
    :goto_0
    const/4 v4, 0x0

    .line 23
    :goto_1
    if-eq p1, p2, :cond_3

    .line 24
    .line 25
    invoke-interface {p0, p1}, Lm23;->d(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {p0, v5}, Lm23;->a(Landroid/view/View;)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-interface {p0, v5}, Lm23;->e(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iput v1, v0, Ll23;->b:I

    .line 38
    .line 39
    iput v2, v0, Ll23;->c:I

    .line 40
    .line 41
    iput v6, v0, Ll23;->d:I

    .line 42
    .line 43
    iput v7, v0, Ll23;->e:I

    .line 44
    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    iput p3, v0, Ll23;->a:I

    .line 48
    .line 49
    invoke-virtual {v0}, Ll23;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    return-object v5

    .line 56
    :cond_1
    if-eqz p4, :cond_2

    .line 57
    .line 58
    iput p4, v0, Ll23;->a:I

    .line 59
    .line 60
    invoke-virtual {v0}, Ll23;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    move-object v4, v5

    .line 67
    :cond_2
    add-int/2addr p1, v3

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    return-object v4
.end method

.method public j(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/content/res/Resources;

    .line 8
    .line 9
    const-string v1, "string"

    .line 10
    .line 11
    invoke-virtual {p0, p1, v1, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public k(Landroid/view/View;Lm83;)Lm83;
    .locals 5

    .line 1
    iget v0, p0, Lwe2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj53;

    .line 9
    .line 10
    new-instance v1, Lk53;

    .line 11
    .line 12
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lk53;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iget v2, p0, Lk53;->a:I

    .line 20
    .line 21
    iput v2, v1, Lk53;->a:I

    .line 22
    .line 23
    iget v2, p0, Lk53;->b:I

    .line 24
    .line 25
    iput v2, v1, Lk53;->b:I

    .line 26
    .line 27
    iget v2, p0, Lk53;->c:I

    .line 28
    .line 29
    iput v2, v1, Lk53;->c:I

    .line 30
    .line 31
    iget p0, p0, Lk53;->d:I

    .line 32
    .line 33
    iput p0, v1, Lk53;->d:I

    .line 34
    .line 35
    invoke-interface {v0, p1, p2, v1}, Lj53;->p(Landroid/view/View;Lm83;Lk53;)Lm83;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_0
    iget-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    .line 43
    .line 44
    invoke-static {p1, p2}, Le33;->h(Landroid/view/View;Lm83;)Lm83;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p2, p1, Lm83;->a:Lj83;

    .line 49
    .line 50
    invoke-virtual {p2}, Lj83;->m()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Landroid/graphics/Rect;

    .line 60
    .line 61
    invoke-virtual {p1}, Lm83;->b()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    iput p2, p0, Landroid/graphics/Rect;->left:I

    .line 66
    .line 67
    invoke-virtual {p1}, Lm83;->d()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    iput p2, p0, Landroid/graphics/Rect;->top:I

    .line 72
    .line 73
    invoke-virtual {p1}, Lm83;->c()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    iput p2, p0, Landroid/graphics/Rect;->right:I

    .line 78
    .line 79
    invoke-virtual {p1}, Lm83;->a()I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    iput p2, p0, Landroid/graphics/Rect;->bottom:I

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    const/4 v1, 0x0

    .line 90
    :goto_0
    if-ge v1, p2, :cond_1

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {v2, p1}, Le33;->b(Landroid/view/View;Lm83;)Lm83;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Lm83;->b()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    iget v4, p0, Landroid/graphics/Rect;->left:I

    .line 105
    .line 106
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    iput v3, p0, Landroid/graphics/Rect;->left:I

    .line 111
    .line 112
    invoke-virtual {v2}, Lm83;->d()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    iget v4, p0, Landroid/graphics/Rect;->top:I

    .line 117
    .line 118
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    iput v3, p0, Landroid/graphics/Rect;->top:I

    .line 123
    .line 124
    invoke-virtual {v2}, Lm83;->c()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    iget v4, p0, Landroid/graphics/Rect;->right:I

    .line 129
    .line 130
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    iput v3, p0, Landroid/graphics/Rect;->right:I

    .line 135
    .line 136
    invoke-virtual {v2}, Lm83;->a()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    iget v3, p0, Landroid/graphics/Rect;->bottom:I

    .line 141
    .line 142
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    iput v2, p0, Landroid/graphics/Rect;->bottom:I

    .line 147
    .line 148
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_1
    iget p2, p0, Landroid/graphics/Rect;->left:I

    .line 152
    .line 153
    iget v0, p0, Landroid/graphics/Rect;->top:I

    .line 154
    .line 155
    iget v1, p0, Landroid/graphics/Rect;->right:I

    .line 156
    .line 157
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 158
    .line 159
    invoke-virtual {p1, p2, v0, v1, p0}, Lm83;->f(IIII)Lm83;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    :goto_1
    return-object p1

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzda;

    .line 5
    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p2

    .line 8
    move-object v4, p3

    .line 9
    move-wide v5, p4

    .line 10
    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/zzda;->zze(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception v0

    .line 15
    move-object p1, v0

    .line 16
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 19
    .line 20
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 25
    .line 26
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 30
    .line 31
    const-string p2, "Event interceptor threw exception"

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public m(Landroid/view/View;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll23;

    .line 4
    .line 5
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lm23;

    .line 8
    .line 9
    invoke-interface {p0}, Lm23;->b()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p0}, Lm23;->c()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-interface {p0, p1}, Lm23;->a(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-interface {p0, p1}, Lm23;->e(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    iput v1, v0, Ll23;->b:I

    .line 26
    .line 27
    iput v2, v0, Ll23;->c:I

    .line 28
    .line 29
    iput v3, v0, Ll23;->d:I

    .line 30
    .line 31
    iput p0, v0, Ll23;->e:I

    .line 32
    .line 33
    const/16 p0, 0x6003

    .line 34
    .line 35
    iput p0, v0, Ll23;->a:I

    .line 36
    .line 37
    invoke-virtual {v0}, Ll23;->a()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public n(Landroidx/recyclerview/widget/o;I)Lm12;
    .locals 4

    .line 1
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lle2;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lle2;->e(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-gez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Lle2;->j(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lp33;

    .line 18
    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    iget v2, v1, Lp33;->a:I

    .line 22
    .line 23
    and-int v3, v2, p2

    .line 24
    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    not-int v3, p2

    .line 28
    and-int/2addr v2, v3

    .line 29
    iput v2, v1, Lp33;->a:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    if-ne p2, v3, :cond_1

    .line 33
    .line 34
    iget-object p2, v1, Lp33;->b:Lm12;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/16 v3, 0x8

    .line 38
    .line 39
    if-ne p2, v3, :cond_3

    .line 40
    .line 41
    iget-object p2, v1, Lp33;->c:Lm12;

    .line 42
    .line 43
    :goto_0
    and-int/lit8 v2, v2, 0xc

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lle2;->i(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    iput p0, v1, Lp33;->a:I

    .line 52
    .line 53
    iput-object v0, v1, Lp33;->b:Lm12;

    .line 54
    .line 55
    iput-object v0, v1, Lp33;->c:Lm12;

    .line 56
    .line 57
    sget-object p0, Lp33;->d:Lnt1;

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_2
    return-object p2

    .line 63
    :cond_3
    const-string p0, "Must provide flag PRE or POST"

    .line 64
    .line 65
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    :goto_1
    return-object v0
.end method

.method public o(Landroidx/recyclerview/widget/o;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lle2;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lp33;

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget p1, p0, Lp33;->a:I

    .line 16
    .line 17
    and-int/lit8 p1, p1, -0x2

    .line 18
    .line 19
    iput p1, p0, Lp33;->a:I

    .line 20
    .line 21
    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    .line 1
    iget p1, p0, Lwe2;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lyr3;

    .line 9
    .line 10
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 13
    .line 14
    iget-object v0, p1, Lyr3;->f:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    iget-object p1, p1, Lyr3;->e:Ljava/util/HashSet;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p0

    .line 27
    :pswitch_0
    iget-object p1, p0, Lwe2;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lwe2;

    .line 30
    .line 31
    iget-object p1, p1, Lwe2;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Ljava/util/Map;

    .line 34
    .line 35
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 38
    .line 39
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    iget-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lz93;

    .line 46
    .line 47
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 50
    .line 51
    iget-object v0, p1, Lz93;->f:Ljava/lang/Object;

    .line 52
    .line 53
    monitor-enter v0

    .line 54
    :try_start_1
    iget-object p1, p1, Lz93;->e:Ljava/util/HashSet;

    .line 55
    .line 56
    invoke-virtual {p1, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :catchall_1
    move-exception p0

    .line 62
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    throw p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 10

    .line 1
    iget v0, p0, Lwe2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzog;

    .line 13
    .line 14
    iget-object v5, p0, Lwe2;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v5, Lsl3;

    .line 17
    .line 18
    invoke-virtual {v5}, Leg3;->y()V

    .line 19
    .line 20
    .line 21
    iput-boolean v2, v5, Lsl3;->w:Z

    .line 22
    .line 23
    iget-object v6, v5, Lsq3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v6, Lij3;

    .line 26
    .line 27
    iget-object v7, v6, Lij3;->d:Lpd3;

    .line 28
    .line 29
    iget-object v8, v6, Lij3;->f:Luh3;

    .line 30
    .line 31
    sget-object v9, Lvg3;->T0:Lug3;

    .line 32
    .line 33
    invoke-virtual {v7, v1, v9}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_5

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    iput-boolean v2, v5, Lsl3;->Y:Z

    .line 44
    .line 45
    if-nez v7, :cond_0

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_0
    instance-of v2, p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    const-string v2, "garbage collected"

    .line 53
    .line 54
    invoke-virtual {v7, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const-string v9, "ServiceUnavailableException"

    .line 69
    .line 70
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    instance-of v2, p1, Ljava/lang/SecurityException;

    .line 78
    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    const-string v2, "READ_DEVICE_CONFIG"

    .line 82
    .line 83
    invoke-virtual {v7, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    const/4 v3, 0x3

    .line 91
    goto :goto_2

    .line 92
    :cond_3
    :goto_0
    const-string v2, "Background"

    .line 93
    .line 94
    invoke-virtual {v7, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_4

    .line 99
    .line 100
    :goto_1
    move v3, v4

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    iput-boolean v4, v5, Lsl3;->Y:Z

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    :goto_2
    add-int/lit8 v3, v3, -0x1

    .line 106
    .line 107
    if-eqz v3, :cond_9

    .line 108
    .line 109
    if-eq v3, v4, :cond_6

    .line 110
    .line 111
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, v8, Luh3;->f:Lsh3;

    .line 115
    .line 116
    invoke-virtual {v6}, Lij3;->q()Lih3;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, Lih3;->F()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const-string v2, "registerTriggerAsync failed. Dropping URI. App ID, Throwable"

    .line 129
    .line 130
    invoke-virtual {v0, v1, v2, p1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lwe2;->s()V

    .line 134
    .line 135
    .line 136
    iput v4, v5, Lsl3;->U:I

    .line 137
    .line 138
    invoke-virtual {v5}, Lsl3;->X()V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_3

    .line 142
    .line 143
    :cond_6
    invoke-virtual {v5}, Lsl3;->W()Ljava/util/PriorityQueue;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    iget p0, v5, Lsl3;->U:I

    .line 151
    .line 152
    sget-object v0, Lvg3;->w0:Lug3;

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Ljava/lang/Integer;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-le p0, v0, :cond_7

    .line 165
    .line 166
    iput v4, v5, Lsl3;->U:I

    .line 167
    .line 168
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 169
    .line 170
    .line 171
    iget-object p0, v8, Luh3;->w:Lsh3;

    .line 172
    .line 173
    invoke-virtual {v6}, Lij3;->q()Lih3;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Lih3;->F()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v0}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-static {p1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    const-string v1, "registerTriggerAsync failed. May try later. App ID, throwable"

    .line 194
    .line 195
    invoke-virtual {p0, v0, v1, p1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_7
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 200
    .line 201
    .line 202
    iget-object p0, v8, Luh3;->w:Lsh3;

    .line 203
    .line 204
    invoke-virtual {v6}, Lij3;->q()Lih3;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Lih3;->F()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-static {v0}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iget v1, v5, Lsl3;->U:I

    .line 217
    .line 218
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {v1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-static {p1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    const-string v2, "registerTriggerAsync failed. App ID, delay in seconds, throwable"

    .line 235
    .line 236
    invoke-virtual {p0, v2, v0, v1, p1}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    iget p0, v5, Lsl3;->U:I

    .line 240
    .line 241
    iget-object p1, v5, Lsl3;->V:Lwk3;

    .line 242
    .line 243
    if-nez p1, :cond_8

    .line 244
    .line 245
    new-instance p1, Lwk3;

    .line 246
    .line 247
    invoke-direct {p1, v5, v6, v4}, Lwk3;-><init>(Lsl3;Ljk3;I)V

    .line 248
    .line 249
    .line 250
    iput-object p1, v5, Lsl3;->V:Lwk3;

    .line 251
    .line 252
    :cond_8
    iget-object p1, v5, Lsl3;->V:Lwk3;

    .line 253
    .line 254
    int-to-long v0, p0

    .line 255
    const-wide/16 v2, 0x3e8

    .line 256
    .line 257
    mul-long/2addr v0, v2

    .line 258
    invoke-virtual {p1, v0, v1}, Lbe3;->b(J)V

    .line 259
    .line 260
    .line 261
    iget p0, v5, Lsl3;->U:I

    .line 262
    .line 263
    add-int/2addr p0, p0

    .line 264
    iput p0, v5, Lsl3;->U:I

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_9
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 268
    .line 269
    .line 270
    iget-object p0, v8, Luh3;->w:Lsh3;

    .line 271
    .line 272
    invoke-virtual {v6}, Lij3;->q()Lih3;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v1}, Lih3;->F()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-static {v1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    invoke-static {p1}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    const-string v2, "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable"

    .line 293
    .line 294
    invoke-virtual {p0, v1, v2, p1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    iput v4, v5, Lsl3;->U:I

    .line 298
    .line 299
    invoke-virtual {v5}, Lsl3;->W()Ljava/util/PriorityQueue;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    invoke-virtual {p0, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    :goto_3
    return-void

    .line 307
    :pswitch_0
    instance-of v0, p1, Lpj2;

    .line 308
    .line 309
    new-instance v1, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    const-string v2, "Camera surface session should only fail with request cancellation. Instead failed due to:\n"

    .line 312
    .line 313
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-static {p1, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 324
    .line 325
    .line 326
    iget-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast p1, Lc00;

    .line 329
    .line 330
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast p0, Landroid/view/Surface;

    .line 333
    .line 334
    new-instance v0, Lug;

    .line 335
    .line 336
    invoke-direct {v0, v4, p0}, Lug;-><init>(ILandroid/view/Surface;)V

    .line 337
    .line 338
    .line 339
    invoke-interface {p1, v0}, Lc00;->accept(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :pswitch_1
    instance-of p1, p1, Lpj2;

    .line 344
    .line 345
    if-eqz p1, :cond_a

    .line 346
    .line 347
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast p0, Lxm;

    .line 350
    .line 351
    invoke-virtual {p0, v2}, Lxm;->cancel(Z)Z

    .line 352
    .line 353
    .line 354
    move-result p0

    .line 355
    invoke-static {v1, p0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 356
    .line 357
    .line 358
    goto :goto_4

    .line 359
    :cond_a
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast p0, Lum;

    .line 362
    .line 363
    invoke-virtual {p0, v1}, Lum;->a(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result p0

    .line 367
    invoke-static {v1, p0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 368
    .line 369
    .line 370
    :goto_4
    return-void

    .line 371
    :pswitch_2
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast p0, Llj2;

    .line 374
    .line 375
    iget p0, p0, Llj2;->f:I

    .line 376
    .line 377
    const-string v0, "SurfaceProcessorNode"

    .line 378
    .line 379
    if-ne p0, v3, :cond_b

    .line 380
    .line 381
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 382
    .line 383
    if-eqz v1, :cond_b

    .line 384
    .line 385
    invoke-static {v0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_b
    invoke-static {p0}, Lhu0;->c0(I)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    const-string v1, "Downstream node failed to provide Surface. Target: "

    .line 394
    .line 395
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    invoke-static {v0, p0, p1}, Lhu0;->I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 400
    .line 401
    .line 402
    :goto_5
    return-void

    .line 403
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lwe2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Void;

    .line 7
    .line 8
    iget-object p1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lc00;

    .line 11
    .line 12
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroid/view/Surface;

    .line 15
    .line 16
    new-instance v0, Lug;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1, p0}, Lug;-><init>(ILandroid/view/Surface;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, Lc00;->accept(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    check-cast p1, Ljava/lang/Void;

    .line 27
    .line 28
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lum;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    invoke-virtual {p0, p1}, Lum;->a(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p1, p0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    check-cast p1, Lmj2;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lac1;

    .line 49
    .line 50
    iget-object p0, p0, Lac1;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lx60;

    .line 53
    .line 54
    iget-object v0, p0, Lx60;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    invoke-virtual {p1}, Lmj2;->close()V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    new-instance v0, Lj8;

    .line 67
    .line 68
    const/16 v1, 0xf

    .line 69
    .line 70
    invoke-direct {v0, v1, p0, p1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    new-instance v1, Ls2;

    .line 77
    .line 78
    const/16 v2, 0xe

    .line 79
    .line 80
    invoke-direct {v1, p1, v2}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0, v1}, Lx60;->b(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    return-void

    .line 87
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p(Landroidx/recyclerview/widget/o;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lta1;

    .line 4
    .line 5
    invoke-virtual {v0}, Lta1;->e()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    sub-int/2addr v1, v2

    .line 11
    :goto_0
    if-ltz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lta1;->f(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-ne p1, v3, :cond_0

    .line 18
    .line 19
    iget-object v3, v0, Lta1;->c:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object v4, v3, v1

    .line 22
    .line 23
    sget-object v5, Lta1;->e:Ljava/lang/Object;

    .line 24
    .line 25
    if-eq v4, v5, :cond_1

    .line 26
    .line 27
    aput-object v5, v3, v1

    .line 28
    .line 29
    iput-boolean v2, v0, Lta1;->a:Z

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lle2;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lp33;

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    iput p1, p0, Lp33;->a:I

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Lp33;->b:Lm12;

    .line 52
    .line 53
    iput-object p1, p0, Lp33;->c:Lm12;

    .line 54
    .line 55
    sget-object p1, Lp33;->d:Lnt1;

    .line 56
    .line 57
    invoke-virtual {p1, p0}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public q(Llv1;)Lzt2;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Llv1;->b:Lw11;

    .line 5
    .line 6
    check-cast v0, Luv1;

    .line 7
    .line 8
    iget-object v1, v0, Luv1;->g:Ltv1;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v2, Lwe2;

    .line 13
    .line 14
    iget-object v3, v1, Ltv1;->a:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v4, Llz;

    .line 17
    .line 18
    const/16 v5, 0xa

    .line 19
    .line 20
    invoke-direct {v4, v5, p0, v1}, Llz;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Lwe2;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    move-object v6, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/4 v2, 0x0

    .line 29
    goto :goto_0

    .line 30
    :goto_1
    new-instance v3, Lzt2;

    .line 31
    .line 32
    iget-object v4, p1, Llv1;->a:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v5, v0, Luv1;->f:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    const/16 v8, 0x8

    .line 38
    .line 39
    invoke-direct/range {v3 .. v8}, Lzt2;-><init>(Ljava/lang/String;Ljava/lang/String;Lwe2;Ljava/util/List;I)V

    .line 40
    .line 41
    .line 42
    return-object v3
.end method

.method public r(Lcom/google/android/gms/common/api/Status;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    iget-object v2, p0, Lwe2;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/util/Map;

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    iget-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v2, v0

    .line 19
    check-cast v2, Ljava/util/Map;

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ljava/util/Map;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/util/Map$Entry;

    .line 51
    .line 52
    if-nez p2, :cond_1

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 71
    .line 72
    invoke-virtual {v1, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->forceFailureUnlessReady(Lcom/google/android/gms/common/api/Status;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/util/Map$Entry;

    .line 95
    .line 96
    if-nez p2, :cond_4

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_3

    .line 109
    .line 110
    :cond_4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 115
    .line 116
    new-instance v1, Li9;

    .line 117
    .line 118
    invoke-direct {v1, p1}, Li9;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_5
    return-void

    .line 126
    :catchall_0
    move-exception p0

    .line 127
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    throw p0

    .line 129
    :catchall_1
    move-exception p0

    .line 130
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 131
    throw p0
.end method

.method public s()V
    .locals 6

    .line 1
    iget-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsl3;

    .line 4
    .line 5
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lij3;

    .line 8
    .line 9
    iget-object v1, v0, Lij3;->e:Lki3;

    .line 10
    .line 11
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lki3;->F()Landroid/util/SparseArray;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lcom/google/android/gms/measurement/internal/zzog;

    .line 21
    .line 22
    iget v2, p0, Lcom/google/android/gms/measurement/internal/zzog;->c:I

    .line 23
    .line 24
    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/zzog;->b:J

    .line 25
    .line 26
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v1, v2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, v0, Lij3;->e:Lki3;

    .line 34
    .line 35
    invoke-static {p0}, Lij3;->j(Lsq3;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    new-array v0, v0, [I

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    new-array v2, v2, [J

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-ge v3, v4, :cond_0

    .line 56
    .line 57
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    aput v4, v0, v3

    .line 62
    .line 63
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ljava/lang/Long;

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    aput-wide v4, v2, v3

    .line 74
    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 79
    .line 80
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v3, "uriSources"

    .line 84
    .line 85
    invoke-virtual {v1, v3, v0}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 86
    .line 87
    .line 88
    const-string v0, "uriTimestamps"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Lki3;->Y:Lra2;

    .line 94
    .line 95
    invoke-virtual {p0, v1}, Lra2;->y(Landroid/os/Bundle;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public t(Lcom/google/android/gms/internal/play_billing/zzjz;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlk;->zzc()Lcom/google/android/gms/internal/play_billing/zzli;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzli;->zzo(Lcom/google/android/gms/internal/play_billing/zzku;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/zzli;->zza(Lcom/google/android/gms/internal/play_billing/zzjz;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lzr3;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzlk;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lzr3;->A(Lcom/google/android/gms/internal/play_billing/zzlk;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    const-string p1, "BillingLogger"

    .line 34
    .line 35
    const-string v0, "Unable to log."

    .line 36
    .line 37
    invoke-static {p1, v0, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh52;

    .line 4
    .line 5
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/os/Bundle;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const-string v2, "google.messenger"

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Lh52;->a(Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object p1, Lo80;->d:Lo80;

    .line 40
    .line 41
    sget-object v0, Lxt0;->Y:Lxt0;

    .line 42
    .line 43
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_1
    return-object p1
.end method

.method public u(Lcom/google/android/gms/internal/play_billing/zzjz;I)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzhk;->zzn()Lcom/google/android/gms/internal/play_billing/zzhg;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzks;

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/zzks;->zza(I)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 19
    .line 20
    iput-object p2, p0, Lwe2;->c:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lwe2;->t(Lcom/google/android/gms/internal/play_billing/zzjz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    const-string p1, "BillingLogger"

    .line 28
    .line 29
    const-string p2, "Unable to log."

    .line 30
    .line 31
    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public v(Lcom/google/android/gms/internal/play_billing/zzkd;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlk;->zzc()Lcom/google/android/gms/internal/play_billing/zzli;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lwe2;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzli;->zzo(Lcom/google/android/gms/internal/play_billing/zzku;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/zzli;->zzm(Lcom/google/android/gms/internal/play_billing/zzkd;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lzr3;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzlk;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lzr3;->A(Lcom/google/android/gms/internal/play_billing/zzlk;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    const-string p1, "BillingLogger"

    .line 34
    .line 35
    const-string v0, "Unable to log."

    .line 36
    .line 37
    invoke-static {p1, v0, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public w(Lcom/google/android/gms/internal/play_billing/zzlq;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzr3;

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlk;->zzc()Lcom/google/android/gms/internal/play_billing/zzli;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/play_billing/zzli;->zzo(Lcom/google/android/gms/internal/play_billing/zzku;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/zzli;->zzp(Lcom/google/android/gms/internal/play_billing/zzlq;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/android/gms/internal/play_billing/zzlk;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Lzr3;->A(Lcom/google/android/gms/internal/play_billing/zzlk;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    const-string p1, "BillingLogger"

    .line 31
    .line 32
    const-string v0, "Unable to log."

    .line 33
    .line 34
    invoke-static {p1, v0, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwe2;->c:Ljava/lang/Object;

    check-cast v0, Lpi3;

    .line 35
    iget-object v0, v0, Lpi3;->a:Ljava/lang/Object;

    check-cast v0, Lqf3;

    .line 36
    iget-object v0, v0, Lqf3;->a:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    .line 37
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    check-cast p0, Ljd3;

    .line 38
    invoke-interface {p0}, Ljd3;->zza()Ljava/lang/Object;

    move-result-object p0

    .line 39
    new-instance v1, Lwq3;

    check-cast p0, Llr3;

    invoke-direct {v1, v0, p0}, Lwq3;-><init>(Landroid/content/Context;Llr3;)V

    return-object v1
.end method

.method public zza(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lvi3;

    .line 4
    .line 5
    iget-object v0, v0, Lvi3;->d:Lid;

    .line 6
    .line 7
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p0, v1}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/util/Map;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    :goto_0
    return-object v1
.end method
