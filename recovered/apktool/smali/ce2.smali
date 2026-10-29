.class public final Lce2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic b:I


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iput v0, p0, Lce2;->a:I

    .line 6
    .line 7
    return-void
.end method

.method public static a(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDisplayFeature;)Z
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    if-nez p0, :cond_1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    if-nez p1, :cond_2

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eq v0, v1, :cond_3

    .line 24
    .line 25
    :goto_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_3
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public static b(Ljava/util/List;Ljava/util/List;)Z
    .locals 5

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    if-nez p0, :cond_1

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_1
    if-nez p1, :cond_2

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eq v1, v2, :cond_3

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    move v2, v0

    .line 27
    :goto_0
    if-ge v2, v1, :cond_5

    .line 28
    .line 29
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Landroidx/window/sidecar/SidecarDisplayFeature;

    .line 34
    .line 35
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Landroidx/window/sidecar/SidecarDisplayFeature;

    .line 40
    .line 41
    invoke-static {v3, v4}, Lce2;->a(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDisplayFeature;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_4

    .line 46
    .line 47
    :goto_1
    return v0

    .line 48
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    :goto_2
    const/4 p0, 0x1

    .line 52
    return p0
.end method


# virtual methods
.method public final c(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Lq83;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    new-instance p0, Lq83;

    .line 7
    .line 8
    sget-object p1, Lnd0;->a:Lnd0;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lq83;-><init>(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Landroidx/window/sidecar/SidecarDeviceState;

    .line 15
    .line 16
    invoke-direct {v0}, Landroidx/window/sidecar/SidecarDeviceState;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Lxd2;->b(Landroidx/window/sidecar/SidecarDeviceState;)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-static {v0, p2}, Lxd2;->d(Landroidx/window/sidecar/SidecarDeviceState;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lxd2;->c(Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1, v0}, Lce2;->d(Ljava/util/List;Landroidx/window/sidecar/SidecarDeviceState;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    new-instance p1, Lq83;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Lq83;-><init>(Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public final d(Ljava/util/List;Landroidx/window/sidecar/SidecarDeviceState;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroidx/window/sidecar/SidecarDisplayFeature;

    .line 24
    .line 25
    invoke-virtual {p0, v1, p2}, Lce2;->e(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Lot0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-object v0
.end method

.method public final e(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Lot0;
    .locals 4

    .line 1
    sget-object v0, Lr4;->l:Lr4;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Ldc0;->b:Ldc0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iget p0, p0, Lce2;->a:I

    .line 10
    .line 11
    if-eqz p0, :cond_6

    .line 12
    .line 13
    new-instance v3, Lug0;

    .line 14
    .line 15
    invoke-direct {v3, p1, p0, v1}, Lug0;-><init>(Ljava/lang/Object;ILdc0;)V

    .line 16
    .line 17
    .line 18
    const-string p0, "Type must be either TYPE_FOLD or TYPE_HINGE"

    .line 19
    .line 20
    sget-object v1, Lyd2;->a:Lyd2;

    .line 21
    .line 22
    invoke-virtual {v3, p0, v1}, Lug0;->v(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lpg3;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v1, "Feature bounds must not be 0"

    .line 27
    .line 28
    sget-object v3, Lzd2;->a:Lzd2;

    .line 29
    .line 30
    invoke-virtual {p0, v1, v3}, Lpg3;->v(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lpg3;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v1, "TYPE_FOLD must have 0 area"

    .line 35
    .line 36
    sget-object v3, Lae2;->a:Lae2;

    .line 37
    .line 38
    invoke-virtual {p0, v1, v3}, Lpg3;->v(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lpg3;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v1, "Feature be pinned to either left or top"

    .line 43
    .line 44
    sget-object v3, Lbe2;->a:Lbe2;

    .line 45
    .line 46
    invoke-virtual {p0, v1, v3}, Lpg3;->v(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lpg3;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Lpg3;->b()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Landroidx/window/sidecar/SidecarDisplayFeature;

    .line 55
    .line 56
    if-nez p0, :cond_0

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_0
    invoke-virtual {p0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    const/4 v1, 0x2

    .line 64
    const/4 v3, 0x1

    .line 65
    if-eq p0, v3, :cond_2

    .line 66
    .line 67
    if-eq p0, v1, :cond_1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    sget-object p0, Lc5;->q:Lc5;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    sget-object p0, Lc5;->p:Lc5;

    .line 74
    .line 75
    :goto_0
    invoke-static {p2}, Lxd2;->b(Landroidx/window/sidecar/SidecarDeviceState;)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-eqz p2, :cond_5

    .line 80
    .line 81
    if-eq p2, v3, :cond_5

    .line 82
    .line 83
    if-eq p2, v1, :cond_3

    .line 84
    .line 85
    const/4 v1, 0x3

    .line 86
    if-eq p2, v1, :cond_4

    .line 87
    .line 88
    const/4 v1, 0x4

    .line 89
    if-eq p2, v1, :cond_5

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    sget-object v0, Lr4;->m:Lr4;

    .line 93
    .line 94
    :cond_4
    :goto_1
    new-instance p2, Lot0;

    .line 95
    .line 96
    new-instance v1, Lwk;

    .line 97
    .line 98
    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-direct {v1, p1}, Lwk;-><init>(Landroid/graphics/Rect;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {p2, v1, p0, v0}, Lot0;-><init>(Lwk;Lc5;Lr4;)V

    .line 109
    .line 110
    .line 111
    return-object p2

    .line 112
    :cond_5
    :goto_2
    return-object v2

    .line 113
    :cond_6
    throw v2
.end method
