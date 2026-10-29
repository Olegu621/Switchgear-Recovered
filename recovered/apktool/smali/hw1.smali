.class public final Lhw1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lw02;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:Ly10;

.field public final c:Ljava/lang/Object;

.field public volatile d:Lgw1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ly10;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhw1;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iput-object p2, p0, Lhw1;->b:Ly10;

    .line 7
    .line 8
    new-instance p1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lhw1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lu21;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lhw1;->d:Lgw1;

    .line 10
    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    iget-object p2, p0, Lhw1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter p2

    .line 16
    :try_start_0
    iget-object v0, p0, Lhw1;->d:Lgw1;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v0, p0, Lhw1;->a:Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/util/List;

    .line 34
    .line 35
    iget-object v1, p0, Lhw1;->b:Ly10;

    .line 36
    .line 37
    new-instance v2, Lcb1;

    .line 38
    .line 39
    invoke-direct {v2, p1, p0}, Lcb1;-><init>(Landroid/content/Context;Lhw1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance p1, Lqh0;

    .line 46
    .line 47
    new-instance v3, Lf8;

    .line 48
    .line 49
    const/4 v4, 0x6

    .line 50
    invoke-direct {v3, v2, v4}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, v3}, Lqh0;-><init>(Lf8;)V

    .line 54
    .line 55
    .line 56
    new-instance v2, Lgw1;

    .line 57
    .line 58
    new-instance v3, Lzb0;

    .line 59
    .line 60
    const/16 v4, 0x17

    .line 61
    .line 62
    invoke-direct {v3, v4}, Lzb0;-><init>(I)V

    .line 63
    .line 64
    .line 65
    new-instance v4, Ltm;

    .line 66
    .line 67
    const/4 v5, 0x3

    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-direct {v4, v0, v6, v5}, Ltm;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v4}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v4, Lb50;

    .line 77
    .line 78
    invoke-direct {v4, p1, v0, v3, v1}, Lb50;-><init>(Lqh0;Ljava/util/List;Lzb0;Ly10;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v2, v4}, Lgw1;-><init>(Lh40;)V

    .line 82
    .line 83
    .line 84
    new-instance p1, Lgw1;

    .line 85
    .line 86
    invoke-direct {p1, v2}, Lgw1;-><init>(Lh40;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Lhw1;->d:Lgw1;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception p0

    .line 93
    goto :goto_1

    .line 94
    :cond_0
    :goto_0
    iget-object p0, p0, Lhw1;->d:Lgw1;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    .line 99
    monitor-exit p2

    .line 100
    return-object p0

    .line 101
    :goto_1
    monitor-exit p2

    .line 102
    throw p0

    .line 103
    :cond_1
    return-object p2
.end method
