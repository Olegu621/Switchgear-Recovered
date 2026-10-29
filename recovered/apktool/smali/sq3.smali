.class public abstract Lsq3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljk3;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lij3;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    iput-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lqa2;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Luh3;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public b()Lbj3;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public c()Lq62;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public e()Landroid/content/Context;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public f()Lxv;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public abstract g(Lra2;)V
.end method

.method public abstract h(Lw;)Lw;
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public j()Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract k(Lvl;)Lw;
.end method

.method public l(Li61;)Lkv1;
    .locals 9

    .line 1
    iget-object v0, p1, Li61;->a:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-static {v0, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lj61;

    .line 29
    .line 30
    new-instance v3, Lvu1;

    .line 31
    .line 32
    iget-boolean v4, v2, Lj61;->b:Z

    .line 33
    .line 34
    iget-object v5, p0, Lsq3;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 37
    .line 38
    iget-object v6, v2, Lj61;->c:Lmz2;

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    sget-object v7, Lmz2;->b:Lmz2;

    .line 43
    .line 44
    if-ne v6, v7, :cond_0

    .line 45
    .line 46
    iget-object v5, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 47
    .line 48
    iget-object v5, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->K0:Ljava/lang/String;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    if-nez v4, :cond_1

    .line 52
    .line 53
    sget-object v7, Lmz2;->b:Lmz2;

    .line 54
    .line 55
    if-ne v6, v7, :cond_1

    .line 56
    .line 57
    iget-object v5, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 58
    .line 59
    iget-object v5, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->J0:Ljava/lang/String;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    if-nez v4, :cond_2

    .line 63
    .line 64
    sget-object v7, Lmz2;->a:Lmz2;

    .line 65
    .line 66
    if-ne v6, v7, :cond_2

    .line 67
    .line 68
    iget-object v5, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 69
    .line 70
    iget-object v5, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->U:Ljava/lang/String;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget-object v5, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 74
    .line 75
    iget-object v5, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->f0:Ljava/lang/String;

    .line 76
    .line 77
    :goto_1
    new-instance v6, Lh50;

    .line 78
    .line 79
    iget-wide v7, v2, Lj61;->e:J

    .line 80
    .line 81
    invoke-direct {v6, v7, v8}, Lh50;-><init>(J)V

    .line 82
    .line 83
    .line 84
    sget-object v2, Lh50;->Companion:Lf50;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    sget-object v2, Lh50;->d:Lhk2;

    .line 90
    .line 91
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Ljava/text/SimpleDateFormat;

    .line 96
    .line 97
    iget-object v6, v6, Lh50;->b:Ljava/util/Calendar;

    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v2, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-direct {v3, v5, v2, v4}, Lvu1;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    new-instance p0, Lkv1;

    .line 118
    .line 119
    iget-boolean p1, p1, Li61;->b:Z

    .line 120
    .line 121
    invoke-direct {p0, v1, p1}, Lkv1;-><init>(Ljava/util/ArrayList;Z)V

    .line 122
    .line 123
    .line 124
    return-object p0
.end method

.method public abstract m(Lw;)V
.end method

.method public abstract n()Ljava/lang/Object;
.end method

.method public abstract o(Ljava/lang/Object;JB)V
.end method

.method public p(Ljh3;Lkb1;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    invoke-virtual {p0}, Lsq3;->n()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_3

    .line 21
    .line 22
    invoke-virtual {p2}, Lkb1;->X()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v0, 0x0

    .line 27
    :goto_0
    if-ge v0, p1, :cond_2

    .line 28
    .line 29
    sget-object v1, Ldh3;->e:Lch3;

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Lkb1;->Y(I)Lph3;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2, v0}, Lkb1;->Z(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return-object p0

    .line 48
    :cond_3
    return-object p1
.end method

.method public abstract q(Ljava/lang/Object;J)Z
.end method

.method public abstract r(Ljava/util/logging/Level;)Z
.end method

.method public abstract s(Ljava/lang/Object;JZ)V
.end method

.method public abstract t(Lsg3;)V
.end method

.method public abstract u(Ljava/lang/Object;J)F
.end method

.method public v(Ljava/lang/RuntimeException;Lsg3;)V
    .locals 0

    .line 1
    const-string p0, "AbstractAndroidBackend"

    .line 2
    .line 3
    const-string p2, "Internal logging error"

    .line 4
    .line 5
    invoke-static {p0, p2, p1}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract w(Ljava/lang/Object;JF)V
.end method

.method public abstract x(Ljava/lang/Object;J)D
.end method

.method public y()V
    .locals 0

    .line 1
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lij3;

    .line 4
    .line 5
    iget-object p0, p0, Lij3;->i:Lbj3;

    .line 6
    .line 7
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lbj3;->y()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public abstract z(Ljava/lang/Object;JD)V
.end method
