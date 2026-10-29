.class public final Lqa2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroid/content/Context;

.field public c:Luq2;

.field public d:Ljc0;

.field public e:Ld31;

.field public f:Lht1;

.field public g:Lht1;

.field public h:Llb2;

.field public final i:Lhk2;

.field public final j:Lvq2;

.field public final k:Lsm1;

.field public final l:Lii2;

.field public final m:Lkc0;

.field public final n:Lgb2;

.field public final o:Liq0;

.field public final p:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lsm1;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lqa2;->a:Ljava/lang/String;

    .line 11
    .line 12
    new-instance p2, Lyh;

    .line 13
    .line 14
    const/16 v0, 0x19

    .line 15
    .line 16
    invoke-direct {p2, p0, v0}, Lyh;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 20
    .line 21
    .line 22
    new-instance p2, Lpa2;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p2, p0, v0}, Lpa2;-><init>(Lqa2;I)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 29
    .line 30
    .line 31
    new-instance p2, Lpa2;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-direct {p2, p0, v0}, Lpa2;-><init>(Lqa2;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, p0, Lqa2;->i:Lhk2;

    .line 42
    .line 43
    new-instance p2, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lqa2;->p:Ljava/util/ArrayList;

    .line 49
    .line 50
    iput-object p1, p0, Lqa2;->b:Landroid/content/Context;

    .line 51
    .line 52
    new-instance p1, Lvq2;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lqa2;->j:Lvq2;

    .line 58
    .line 59
    new-instance p1, Lsm1;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lqa2;->k:Lsm1;

    .line 65
    .line 66
    new-instance p1, Lii2;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lqa2;->l:Lii2;

    .line 72
    .line 73
    new-instance p1, Lkc0;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lqa2;->m:Lkc0;

    .line 79
    .line 80
    new-instance p1, Lgb2;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lqa2;->n:Lgb2;

    .line 86
    .line 87
    new-instance p1, Liq0;

    .line 88
    .line 89
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Lqa2;->o:Liq0;

    .line 93
    .line 94
    invoke-virtual {p0}, Lqa2;->b()Lsm1;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p3, p1, Lsm1;->a:Lsm1;

    .line 99
    .line 100
    invoke-virtual {p0, p4}, Lqa2;->g(Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lqa2;->d()Luq2;

    .line 104
    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final a()Lkc0;
    .locals 0

    .line 1
    iget-object p0, p0, Lqa2;->m:Lkc0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "emitterConfiguration"

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

.method public final b()Lsm1;
    .locals 0

    .line 1
    iget-object p0, p0, Lqa2;->k:Lsm1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "networkConfiguration"

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

.method public final c()Ld31;
    .locals 3

    .line 1
    iget-object v0, p0, Lqa2;->e:Ld31;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Ld31;

    .line 6
    .line 7
    iget-object v1, p0, Lqa2;->l:Lii2;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lqa2;->b:Landroid/content/Context;

    .line 12
    .line 13
    invoke-direct {v0, v2, v1}, Ld31;-><init>(Landroid/content/Context;Lii2;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lqa2;->e:Ld31;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const-string p0, "subjectConfiguration"

    .line 20
    .line 21
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0

    .line 26
    :cond_1
    return-object v0
.end method

.method public final d()Luq2;
    .locals 10

    .line 1
    iget-object v0, p0, Lqa2;->c:Luq2;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lqa2;->d:Ljc0;

    .line 6
    .line 7
    iget-object v2, p0, Lqa2;->a:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v9, 0x1

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Lqa2;->b()Lsm1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lsm1;->b()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    :cond_0
    move-object v5, v0

    .line 25
    new-instance v6, Lo;

    .line 26
    .line 27
    const/16 v0, 0x12

    .line 28
    .line 29
    invoke-direct {v6, p0, v0}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Ljc0;

    .line 33
    .line 34
    invoke-virtual {p0}, Lqa2;->a()Lkc0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lkc0;->f()Lb5;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v4, p0, Lqa2;->b:Landroid/content/Context;

    .line 43
    .line 44
    invoke-direct/range {v1 .. v6}, Ljc0;-><init>(Ljava/lang/String;Lb5;Landroid/content/Context;Ljava/lang/String;Lo;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lqa2;->a()Lkc0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lkc0;->m()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object v0, v1, Ljc0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 60
    .line 61
    .line 62
    :cond_1
    iput-object v1, p0, Lqa2;->d:Ljc0;

    .line 63
    .line 64
    move-object v0, v1

    .line 65
    :cond_2
    invoke-virtual {p0}, Lqa2;->c()Ld31;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    new-instance v8, Loc;

    .line 70
    .line 71
    const/4 v3, 0x7

    .line 72
    invoke-direct {v8, v3, v1, p0}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Luq2;

    .line 76
    .line 77
    invoke-virtual {p0}, Lqa2;->f()Lvq2;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Lvq2;->a()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {p0}, Lqa2;->f()Lvq2;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Lvq2;->n()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {p0}, Lqa2;->f()Lvq2;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Lvq2;->o()Lns1;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    iget-object v7, p0, Lqa2;->b:Landroid/content/Context;

    .line 102
    .line 103
    move-object v3, v2

    .line 104
    move-object v2, v0

    .line 105
    invoke-direct/range {v1 .. v8}, Luq2;-><init>(Ljc0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lns1;Landroid/content/Context;Loc;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lqa2;->f()Lvq2;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Lvq2;->v()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    iget-object v0, v1, Luq2;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 119
    .line 120
    const/4 v2, 0x0

    .line 121
    invoke-virtual {v0, v9, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_3

    .line 126
    .line 127
    invoke-virtual {v1}, Luq2;->b()V

    .line 128
    .line 129
    .line 130
    iget-object v0, v1, Luq2;->i:Ljc0;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljc0;->e()V

    .line 133
    .line 134
    .line 135
    :cond_3
    invoke-virtual {p0}, Lqa2;->e()Lgb2;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Lgb2;->d()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_4

    .line 144
    .line 145
    invoke-virtual {v1}, Luq2;->b()V

    .line 146
    .line 147
    .line 148
    :cond_4
    iget-object v0, v1, Luq2;->k:Lza2;

    .line 149
    .line 150
    if-eqz v0, :cond_5

    .line 151
    .line 152
    invoke-virtual {p0}, Lqa2;->e()Lgb2;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v2}, Lgb2;->c()Lc00;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-eqz v2, :cond_5

    .line 161
    .line 162
    iput-object v2, v0, Lza2;->p:Lc00;

    .line 163
    .line 164
    :cond_5
    iput-object v1, p0, Lqa2;->c:Luq2;

    .line 165
    .line 166
    return-object v1

    .line 167
    :cond_6
    return-object v0
.end method

.method public final e()Lgb2;
    .locals 0

    .line 1
    iget-object p0, p0, Lqa2;->n:Lgb2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "sessionConfiguration"

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

.method public final f()Lvq2;
    .locals 0

    .line 1
    iget-object p0, p0, Lqa2;->j:Lvq2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "trackerConfiguration"

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

.method public final g(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_8

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Luy;

    .line 16
    .line 17
    instance-of v1, v0, Lsm1;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lqa2;->b()Lsm1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v0, Lsm1;

    .line 26
    .line 27
    iput-object v0, v1, Lsm1;->a:Lsm1;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    instance-of v1, v0, Lvq2;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lqa2;->f()Lvq2;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v0, Lvq2;

    .line 39
    .line 40
    iput-object v0, v1, Lvq2;->b:Lvq2;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    instance-of v1, v0, Lii2;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    iget-object v1, p0, Lqa2;->l:Lii2;

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    check-cast v0, Lii2;

    .line 53
    .line 54
    iput-object v0, v1, Lii2;->a:Lii2;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const-string p0, "subjectConfiguration"

    .line 58
    .line 59
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v2

    .line 63
    :cond_4
    instance-of v1, v0, Lgb2;

    .line 64
    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    invoke-virtual {p0}, Lqa2;->e()Lgb2;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v0, Lgb2;

    .line 72
    .line 73
    iput-object v0, v1, Lgb2;->a:Lgb2;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    instance-of v1, v0, Lkc0;

    .line 77
    .line 78
    if-eqz v1, :cond_6

    .line 79
    .line 80
    invoke-virtual {p0}, Lqa2;->a()Lkc0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v0, Lkc0;

    .line 85
    .line 86
    iput-object v0, v1, Lkc0;->a:Lkc0;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_6
    instance-of v1, v0, Liq0;

    .line 90
    .line 91
    if-eqz v1, :cond_0

    .line 92
    .line 93
    iget-object v1, p0, Lqa2;->o:Liq0;

    .line 94
    .line 95
    if-eqz v1, :cond_7

    .line 96
    .line 97
    check-cast v0, Liq0;

    .line 98
    .line 99
    iput-object v0, v1, Liq0;->a:Liq0;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_7
    const-string p0, "gdprConfiguration"

    .line 103
    .line 104
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v2

    .line 108
    :cond_8
    return-void
.end method
