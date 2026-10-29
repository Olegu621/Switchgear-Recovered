.class public final Lyq2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/HashMap;

.field public final d:Lfs0;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/UUID;

.field public final g:J

.field public final h:Z

.field public final i:Z


# direct methods
.method public constructor <init>(Lk;Lfs0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lyq2;->f:Ljava/util/UUID;

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, Lyq2;->g:J

    .line 18
    .line 19
    iget-object v0, p1, Lk;->a:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lyq2;->e:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v0, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-virtual {p1}, Lk;->c()Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Loc1;->h(Ljava/util/Map;)Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lyq2;->c:Ljava/util/HashMap;

    .line 41
    .line 42
    iput-object p2, p0, Lyq2;->d:Lfs0;

    .line 43
    .line 44
    instance-of p2, p1, Lxq2;

    .line 45
    .line 46
    iput-boolean p2, p0, Lyq2;->i:Z

    .line 47
    .line 48
    instance-of p2, p1, Lfi2;

    .line 49
    .line 50
    if-eqz p2, :cond_0

    .line 51
    .line 52
    const-string p1, "se"

    .line 53
    .line 54
    iput-object p1, p0, Lyq2;->b:Ljava/lang/String;

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, Lyq2;->h:Z

    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    instance-of p2, p1, Lm0;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    if-eqz p2, :cond_1

    .line 64
    .line 65
    check-cast p1, Lm0;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    move-object p1, v0

    .line 69
    :goto_0
    if-eqz p1, :cond_2

    .line 70
    .line 71
    invoke-virtual {p1}, Lm0;->d()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_2
    iput-object v0, p0, Lyq2;->a:Ljava/lang/String;

    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    iput-boolean p1, p0, Lyq2;->h:Z

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lyq2;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "entities"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final b()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lyq2;->c:Ljava/util/HashMap;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "payload"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method
