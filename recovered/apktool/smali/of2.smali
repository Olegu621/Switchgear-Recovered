.class public final Lof2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# instance fields
.field public a:Lio/flutter/plugin/common/MethodChannel;

.field public b:Landroid/content/Context;


# direct methods
.method public static a(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_2

    .line 13
    .line 14
    new-instance v0, Lyq0;

    .line 15
    .line 16
    sget-object v0, Lyq0;->a:[Lu21;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    aget-object v0, v0, v2

    .line 20
    .line 21
    invoke-interface {v0}, Ln21;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {p0, v0}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p0}, Lnf2;->a(Ljava/lang/String;)Lht1;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lht1;->A()Llb2;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lqa2;

    .line 46
    .line 47
    invoke-virtual {v0}, Lqa2;->d()Luq2;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, Luq2;->k:Lza2;

    .line 52
    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    iget-object p0, p0, Llb2;->b:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const-string v0, "Attempt to access SessionController fields when disabled"

    .line 61
    .line 62
    new-array v1, v2, [Ljava/lang/Object;

    .line 63
    .line 64
    invoke-static {p0, v0, v1}, Lk50;->K(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const-string v1, ""

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    iget-object p0, v0, Lza2;->e:Lkn;

    .line 71
    .line 72
    if-eqz p0, :cond_2

    .line 73
    .line 74
    iget-object p0, p0, Lkn;->d:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v1, p0

    .line 77
    check-cast v1, Ljava/lang/String;

    .line 78
    .line 79
    :cond_2
    :goto_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public static b(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_2

    .line 13
    .line 14
    new-instance v0, Lyq0;

    .line 15
    .line 16
    sget-object v0, Lyq0;->a:[Lu21;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    aget-object v0, v0, v2

    .line 20
    .line 21
    invoke-interface {v0}, Ln21;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {p0, v0}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p0}, Lnf2;->a(Ljava/lang/String;)Lht1;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lht1;->A()Llb2;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lqa2;

    .line 46
    .line 47
    invoke-virtual {v0}, Lqa2;->d()Luq2;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, Luq2;->k:Lza2;

    .line 52
    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    iget-object p0, p0, Llb2;->b:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const-string v0, "Attempt to access SessionController fields when disabled"

    .line 61
    .line 62
    new-array v1, v2, [Ljava/lang/Object;

    .line 63
    .line 64
    invoke-static {p0, v0, v1}, Lk50;->K(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const-string v1, ""

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    iget-object v1, v0, Lza2;->a:Ljava/lang/String;

    .line 71
    .line 72
    :cond_2
    :goto_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static c(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 8

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_4

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Liz;

    .line 20
    .line 21
    invoke-virtual {v0}, Lgf0;->b()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, v2}, Liz;-><init>(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Lhz;

    .line 29
    .line 30
    sget-object v4, Liz;->c:[Lu21;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    aget-object v5, v4, v5

    .line 34
    .line 35
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {v2, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/4 v6, 0x1

    .line 50
    aget-object v6, v4, v6

    .line 51
    .line 52
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-static {v2, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Ljava/lang/String;

    .line 61
    .line 62
    const/4 v7, 0x2

    .line 63
    aget-object v7, v4, v7

    .line 64
    .line 65
    invoke-interface {v7}, Ln21;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-static {v2, v7}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {v3, v6, v2, v5}, Lhz;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const/4 v2, 0x3

    .line 79
    aget-object v2, v4, v2

    .line 80
    .line 81
    invoke-interface {v2}, Ln21;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    iget-object v5, p0, Liz;->a:Ljava/util/Map;

    .line 86
    .line 87
    invoke-static {v5, v2}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v2, :cond_1

    .line 94
    .line 95
    iput-object v2, v3, Lhz;->e:Ljava/lang/String;

    .line 96
    .line 97
    :cond_1
    const/4 v2, 0x4

    .line 98
    aget-object v2, v4, v2

    .line 99
    .line 100
    invoke-interface {v2}, Ln21;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-static {v5, v2}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v2, :cond_2

    .line 111
    .line 112
    iput-object v2, v3, Lhz;->f:Ljava/lang/String;

    .line 113
    .line 114
    :cond_2
    iget-object p0, p0, Liz;->b:Lhk2;

    .line 115
    .line 116
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, Ljava/util/List;

    .line 121
    .line 122
    if-eqz p0, :cond_3

    .line 123
    .line 124
    iget-object v2, v3, Lhz;->g:Ljava/util/LinkedList;

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/util/LinkedList;->clear()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, p0}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-virtual {v0, v3}, Lgf0;->a(Lk;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v3, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 136
    .line 137
    .line 138
    :cond_4
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public static d(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 6

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lh81;

    .line 20
    .line 21
    invoke-virtual {v0}, Lgf0;->b()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, v2}, Lh81;-><init>(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Lg81;

    .line 29
    .line 30
    sget-object v4, Lh81;->b:[Lu21;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    aget-object v5, v4, v5

    .line 34
    .line 35
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {v2, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/4 v5, 0x1

    .line 50
    aget-object v4, v4, v5

    .line 51
    .line 52
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget-object p0, p0, Lh81;->a:Ljava/util/Map;

    .line 57
    .line 58
    invoke-static {p0, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-direct {v3}, Lk;-><init>()V

    .line 65
    .line 66
    .line 67
    iput v2, v3, Lg81;->b:I

    .line 68
    .line 69
    iput-object p0, v3, Lg81;->c:Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Lgf0;->a(Lk;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static e(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lvd1;

    .line 20
    .line 21
    invoke-direct {p0}, Lk;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lgf0;->a(Lk;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static f(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lbe1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lgf0;->b()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, v2}, Lbe1;-><init>(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lxd1;

    .line 29
    .line 30
    invoke-virtual {p0}, Lbe1;->a()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v2}, Lk;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p0, v2, Lxd1;->b:Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Lgf0;->a(Lk;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static g(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lyd1;

    .line 20
    .line 21
    invoke-direct {p0}, Lk;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lgf0;->a(Lk;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static h(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lde1;

    .line 20
    .line 21
    invoke-direct {p0}, Lk;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lgf0;->a(Lk;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static i(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lbe1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lgf0;->b()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, v2}, Lbe1;-><init>(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lee1;

    .line 29
    .line 30
    invoke-virtual {p0}, Lbe1;->a()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v2}, Lk;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p0, v2, Lee1;->b:Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Lgf0;->a(Lk;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static j(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lbe1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lgf0;->b()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, v2}, Lbe1;-><init>(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lge1;

    .line 29
    .line 30
    invoke-virtual {p0}, Lbe1;->a()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v2}, Lk;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p0, v2, Lge1;->b:Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Lgf0;->a(Lk;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static k(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lhe1;

    .line 20
    .line 21
    invoke-direct {p0}, Lk;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lgf0;->a(Lk;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static l(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lse1;

    .line 20
    .line 21
    invoke-direct {p0}, Lk;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lgf0;->a(Lk;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static m(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lwe1;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {p0, v2}, Lwe1;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Lgf0;->a(Lk;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static n(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 5

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lcf1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lgf0;->b()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v2, Lze1;

    .line 29
    .line 30
    sget-object v3, Lcf1;->a:[Lu21;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    aget-object v3, v3, v4

    .line 34
    .line 35
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {p0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    const/4 v3, 0x1

    .line 50
    invoke-direct {v2, v3}, Lze1;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-boolean p0, v2, Lze1;->c:Z

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Lgf0;->a(Lk;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static o(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lff1;

    .line 20
    .line 21
    invoke-direct {p0}, Lk;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lgf0;->a(Lk;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static p(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 7

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lhf1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lgf0;->b()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, v2}, Lhf1;-><init>(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Lgf1;

    .line 29
    .line 30
    sget-object v4, Lhf1;->b:[Lu21;

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aget-object v5, v4, v5

    .line 34
    .line 35
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {v2, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    const/4 v2, 0x0

    .line 50
    aget-object v2, v4, v2

    .line 51
    .line 52
    invoke-interface {v2}, Ln21;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object p0, p0, Lhf1;->a:Ljava/util/Map;

    .line 57
    .line 58
    invoke-static {p0, v2}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljava/lang/Double;

    .line 63
    .line 64
    invoke-direct {v3}, Lk;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-wide v5, v3, Lgf1;->b:D

    .line 68
    .line 69
    iput-object p0, v3, Lgf1;->c:Ljava/lang/Double;

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Lgf0;->a(Lk;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static q(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 8

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lmf1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lgf0;->b()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, v2}, Lmf1;-><init>(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    sget-object v2, Lmf1;->b:[Lu21;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    aget-object v3, v2, v3

    .line 32
    .line 33
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object p0, p0, Lmf1;->a:Ljava/util/Map;

    .line 38
    .line 39
    invoke-static {p0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/lang/String;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    aget-object v4, v2, v4

    .line 47
    .line 48
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {p0, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Ljava/lang/String;

    .line 57
    .line 58
    const/4 v5, 0x2

    .line 59
    aget-object v5, v2, v5

    .line 60
    .line 61
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {p0, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Ljava/lang/Integer;

    .line 70
    .line 71
    const/4 v6, 0x3

    .line 72
    aget-object v6, v2, v6

    .line 73
    .line 74
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {p0, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Ljava/lang/Integer;

    .line 83
    .line 84
    const/4 v7, 0x4

    .line 85
    aget-object v2, v2, v7

    .line 86
    .line 87
    invoke-interface {v2}, Ln21;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {p0, v2}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Ljava/lang/Boolean;

    .line 96
    .line 97
    new-instance v2, Llf1;

    .line 98
    .line 99
    invoke-direct {v2}, Lk;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v4, v2, Llf1;->b:Ljava/lang/String;

    .line 103
    .line 104
    iput-object v3, v2, Llf1;->c:Ljava/lang/String;

    .line 105
    .line 106
    iput-object v5, v2, Llf1;->d:Ljava/lang/Integer;

    .line 107
    .line 108
    iput-object v6, v2, Llf1;->e:Ljava/lang/Integer;

    .line 109
    .line 110
    iput-object p0, v2, Llf1;->f:Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Lgf0;->a(Lk;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v2, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 116
    .line 117
    .line 118
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public static r(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lpc;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-direct {p0, v2}, Lpc;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Lgf0;->a(Lk;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static s(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 5

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lyf1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lgf0;->b()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, v2}, Lyf1;-><init>(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    sget-object v3, Lyf1;->b:[Lu21;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    aget-object v4, v3, v4

    .line 32
    .line 33
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object p0, p0, Lyf1;->a:Ljava/util/Map;

    .line 38
    .line 39
    invoke-static {p0, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/lang/Integer;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    aget-object v3, v3, v4

    .line 47
    .line 48
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v2, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/lang/Number;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    new-instance v3, Lxf1;

    .line 63
    .line 64
    invoke-direct {v3}, Lk;-><init>()V

    .line 65
    .line 66
    .line 67
    iput v2, v3, Lxf1;->b:I

    .line 68
    .line 69
    iput-object p0, v3, Lxf1;->c:Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Lgf0;->a(Lk;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static t(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 10

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lgf0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lb82;

    .line 20
    .line 21
    invoke-virtual {v0}, Lgf0;->b()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, v2}, Lb82;-><init>(Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, La82;

    .line 29
    .line 30
    sget-object v3, Lb82;->b:[Lu21;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    aget-object v4, v3, v4

    .line 34
    .line 35
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object p0, p0, Lb82;->a:Ljava/util/Map;

    .line 40
    .line 41
    invoke-static {p0, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ljava/lang/Integer;

    .line 46
    .line 47
    const/4 v5, 0x1

    .line 48
    aget-object v5, v3, v5

    .line 49
    .line 50
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {p0, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Ljava/lang/Integer;

    .line 59
    .line 60
    const/4 v6, 0x2

    .line 61
    aget-object v6, v3, v6

    .line 62
    .line 63
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {p0, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    check-cast v6, Ljava/lang/Integer;

    .line 72
    .line 73
    const/4 v7, 0x3

    .line 74
    aget-object v7, v3, v7

    .line 75
    .line 76
    invoke-interface {v7}, Ln21;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-static {p0, v7}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Ljava/lang/Integer;

    .line 85
    .line 86
    const/4 v8, 0x4

    .line 87
    aget-object v8, v3, v8

    .line 88
    .line 89
    invoke-interface {v8}, Ln21;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-static {p0, v8}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Ljava/lang/Integer;

    .line 98
    .line 99
    const/4 v9, 0x5

    .line 100
    aget-object v3, v3, v9

    .line 101
    .line 102
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-static {p0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-direct {v2}, Lk;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-object v4, v2, La82;->b:Ljava/lang/Integer;

    .line 116
    .line 117
    iput-object v5, v2, La82;->c:Ljava/lang/Integer;

    .line 118
    .line 119
    iput-object v6, v2, La82;->d:Ljava/lang/Integer;

    .line 120
    .line 121
    iput-object v7, v2, La82;->e:Ljava/lang/Integer;

    .line 122
    .line 123
    iput-object v8, v2, La82;->f:Ljava/lang/Integer;

    .line 124
    .line 125
    iput-object p0, v2, La82;->g:Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Lgf0;->a(Lk;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2, v0}, Lhe3;->v(Lk;Lgf0;)V

    .line 131
    .line 132
    .line 133
    :cond_1
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    return-void
.end method


# virtual methods
.method public final onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    .line 5
    .line 6
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "snowplow_tracker"

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lof2;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lof2;->b:Landroid/content/Context;

    .line 25
    .line 26
    return-void
.end method

.method public final onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lof2;->a:Lio/flutter/plugin/common/MethodChannel;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lof2;->b:Landroid/content/Context;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "channel"

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v2, :cond_9d

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v5, 0x5

    .line 20
    const/4 v6, 0x4

    .line 21
    const/4 v7, 0x3

    .line 22
    const/4 v8, 0x2

    .line 23
    const/4 v9, 0x1

    .line 24
    const/4 v10, 0x0

    .line 25
    const/4 v11, 0x0

    .line 26
    sparse-switch v3, :sswitch_data_0

    .line 27
    .line 28
    .line 29
    goto/16 :goto_2a

    .line 30
    .line 31
    :sswitch_0
    const-string v3, "trackMediaBufferStartEvent"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    goto/16 :goto_2a

    .line 40
    .line 41
    :cond_0
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 42
    .line 43
    instance-of v2, v0, Ljava/util/Map;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    check-cast v0, Ljava/util/Map;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v0, v11

    .line 51
    :goto_0
    if-eqz v0, :cond_2

    .line 52
    .line 53
    new-instance v2, Lgf0;

    .line 54
    .line 55
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lte1;

    .line 59
    .line 60
    invoke-direct {v0}, Lk;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, Lgf0;->a(Lk;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :sswitch_1
    const-string v3, "endMediaTracking"

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_3

    .line 80
    .line 81
    goto/16 :goto_2a

    .line 82
    .line 83
    :cond_3
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 84
    .line 85
    instance-of v2, v0, Ljava/util/Map;

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    check-cast v0, Ljava/util/Map;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    move-object v0, v11

    .line 93
    :goto_1
    if-eqz v0, :cond_7

    .line 94
    .line 95
    new-instance v2, Lee0;

    .line 96
    .line 97
    sget-object v2, Lee0;->a:[Lu21;

    .line 98
    .line 99
    aget-object v3, v2, v10

    .line 100
    .line 101
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {v0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v3}, Lnf2;->a(Ljava/lang/String;)Lht1;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    if-eqz v3, :cond_7

    .line 116
    .line 117
    iget-object v3, v3, Lsq3;->a:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v3, Lqa2;

    .line 120
    .line 121
    iget-object v3, v3, Lqa2;->i:Lhk2;

    .line 122
    .line 123
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    check-cast v3, Lve1;

    .line 128
    .line 129
    if-eqz v3, :cond_7

    .line 130
    .line 131
    aget-object v2, v2, v9

    .line 132
    .line 133
    invoke-interface {v2}, Ln21;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-static {v0, v2}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object v2, v3, Lve1;->b:Ljava/util/LinkedHashMap;

    .line 147
    .line 148
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    check-cast v3, Lvf1;

    .line 153
    .line 154
    if-eqz v3, :cond_6

    .line 155
    .line 156
    iget-object v3, v3, Lvf1;->c:Lef1;

    .line 157
    .line 158
    if-eqz v3, :cond_6

    .line 159
    .line 160
    iget-object v4, v3, Lef1;->e:Lts0;

    .line 161
    .line 162
    if-eqz v4, :cond_5

    .line 163
    .line 164
    iget-object v4, v4, Lts0;->a:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v4, Ljava/util/Timer;

    .line 167
    .line 168
    if-eqz v4, :cond_5

    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/util/Timer;->cancel()V

    .line 171
    .line 172
    .line 173
    :cond_5
    iput-object v11, v3, Lef1;->e:Lts0;

    .line 174
    .line 175
    :cond_6
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    :cond_7
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :sswitch_2
    const-string v3, "updateMediaTracking"

    .line 183
    .line 184
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-nez v2, :cond_8

    .line 189
    .line 190
    goto/16 :goto_2a

    .line 191
    .line 192
    :cond_8
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 193
    .line 194
    instance-of v2, v0, Ljava/util/Map;

    .line 195
    .line 196
    if-eqz v2, :cond_9

    .line 197
    .line 198
    check-cast v0, Ljava/util/Map;

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_9
    move-object v0, v11

    .line 202
    :goto_2
    if-eqz v0, :cond_e

    .line 203
    .line 204
    new-instance v2, Lqy2;

    .line 205
    .line 206
    invoke-direct {v2, v0}, Lqy2;-><init>(Ljava/util/Map;)V

    .line 207
    .line 208
    .line 209
    sget-object v3, Lqy2;->e:[Lu21;

    .line 210
    .line 211
    aget-object v4, v3, v10

    .line 212
    .line 213
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-static {v0, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    check-cast v4, Ljava/lang/String;

    .line 222
    .line 223
    invoke-static {v4}, Lnf2;->a(Ljava/lang/String;)Lht1;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    if-eqz v4, :cond_a

    .line 228
    .line 229
    iget-object v4, v4, Lsq3;->a:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v4, Lqa2;

    .line 232
    .line 233
    iget-object v4, v4, Lqa2;->i:Lhk2;

    .line 234
    .line 235
    invoke-virtual {v4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    check-cast v4, Lve1;

    .line 240
    .line 241
    if-eqz v4, :cond_a

    .line 242
    .line 243
    aget-object v3, v3, v9

    .line 244
    .line 245
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-static {v0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    iget-object v3, v4, Lve1;->b:Ljava/util/LinkedHashMap;

    .line 259
    .line 260
    invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    check-cast v0, Lvf1;

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_a
    move-object v0, v11

    .line 268
    :goto_3
    if-eqz v0, :cond_e

    .line 269
    .line 270
    iget-object v3, v2, Lqy2;->b:Lhk2;

    .line 271
    .line 272
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    check-cast v3, Ljf1;

    .line 277
    .line 278
    if-eqz v3, :cond_b

    .line 279
    .line 280
    invoke-virtual {v3}, Ljf1;->a()Lif1;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    goto :goto_4

    .line 285
    :cond_b
    move-object v3, v11

    .line 286
    :goto_4
    iget-object v4, v2, Lqy2;->c:Lhk2;

    .line 287
    .line 288
    invoke-virtual {v4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    check-cast v4, Lae1;

    .line 293
    .line 294
    if-eqz v4, :cond_c

    .line 295
    .line 296
    invoke-virtual {v4}, Lae1;->a()Lzd1;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    goto :goto_5

    .line 301
    :cond_c
    move-object v4, v11

    .line 302
    :goto_5
    iget-object v2, v2, Lqy2;->d:Lhk2;

    .line 303
    .line 304
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    check-cast v2, Lud1;

    .line 309
    .line 310
    if-eqz v2, :cond_d

    .line 311
    .line 312
    invoke-virtual {v2}, Lud1;->a()Ltd1;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    goto :goto_6

    .line 317
    :cond_d
    move-object v2, v11

    .line 318
    :goto_6
    invoke-virtual {v0, v11, v3, v4, v2}, Lvf1;->c(Lk;Lif1;Lzd1;Ltd1;)V

    .line 319
    .line 320
    .line 321
    :cond_e
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :sswitch_3
    const-string v3, "trackConsentGranted"

    .line 326
    .line 327
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    if-nez v2, :cond_f

    .line 332
    .line 333
    goto/16 :goto_2a

    .line 334
    .line 335
    :cond_f
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 336
    .line 337
    instance-of v2, v0, Ljava/util/Map;

    .line 338
    .line 339
    if-eqz v2, :cond_10

    .line 340
    .line 341
    check-cast v0, Ljava/util/Map;

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_10
    move-object v0, v11

    .line 345
    :goto_7
    if-eqz v0, :cond_14

    .line 346
    .line 347
    new-instance v2, Lgf0;

    .line 348
    .line 349
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 350
    .line 351
    .line 352
    new-instance v0, Lez;

    .line 353
    .line 354
    invoke-virtual {v2}, Lgf0;->b()Ljava/util/Map;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-direct {v0, v3}, Lez;-><init>(Ljava/util/Map;)V

    .line 359
    .line 360
    .line 361
    new-instance v4, Ldz;

    .line 362
    .line 363
    sget-object v5, Lez;->c:[Lu21;

    .line 364
    .line 365
    aget-object v10, v5, v10

    .line 366
    .line 367
    invoke-interface {v10}, Ln21;->getName()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    invoke-static {v3, v10}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    check-cast v10, Ljava/lang/String;

    .line 376
    .line 377
    aget-object v9, v5, v9

    .line 378
    .line 379
    invoke-interface {v9}, Ln21;->getName()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v9

    .line 383
    invoke-static {v3, v9}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    check-cast v9, Ljava/lang/String;

    .line 388
    .line 389
    aget-object v8, v5, v8

    .line 390
    .line 391
    invoke-interface {v8}, Ln21;->getName()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v8

    .line 395
    invoke-static {v3, v8}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    check-cast v3, Ljava/lang/String;

    .line 400
    .line 401
    invoke-direct {v4, v10, v9, v3}, Ldz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    iget-object v3, v0, Lez;->a:Ljava/util/Map;

    .line 405
    .line 406
    aget-object v7, v5, v7

    .line 407
    .line 408
    invoke-interface {v7}, Ln21;->getName()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    invoke-static {v3, v7}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v7

    .line 416
    check-cast v7, Ljava/lang/String;

    .line 417
    .line 418
    if-eqz v7, :cond_11

    .line 419
    .line 420
    iput-object v7, v4, Ldz;->e:Ljava/lang/String;

    .line 421
    .line 422
    :cond_11
    aget-object v5, v5, v6

    .line 423
    .line 424
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    invoke-static {v3, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    check-cast v3, Ljava/lang/String;

    .line 433
    .line 434
    if-eqz v3, :cond_12

    .line 435
    .line 436
    iput-object v3, v4, Ldz;->f:Ljava/lang/String;

    .line 437
    .line 438
    :cond_12
    iget-object v0, v0, Lez;->b:Lhk2;

    .line 439
    .line 440
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    check-cast v0, Ljava/util/List;

    .line 445
    .line 446
    if-eqz v0, :cond_13

    .line 447
    .line 448
    iget-object v3, v4, Ldz;->g:Ljava/util/LinkedList;

    .line 449
    .line 450
    invoke-virtual {v3}, Ljava/util/LinkedList;->clear()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 454
    .line 455
    .line 456
    :cond_13
    invoke-virtual {v2, v4}, Lgf0;->a(Lk;)V

    .line 457
    .line 458
    .line 459
    invoke-static {v4, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 460
    .line 461
    .line 462
    :cond_14
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :sswitch_4
    const-string v3, "trackMediaSeekEndEvent"

    .line 467
    .line 468
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v2

    .line 472
    if-nez v2, :cond_15

    .line 473
    .line 474
    goto/16 :goto_2a

    .line 475
    .line 476
    :cond_15
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 477
    .line 478
    instance-of v2, v0, Ljava/util/Map;

    .line 479
    .line 480
    if-eqz v2, :cond_16

    .line 481
    .line 482
    check-cast v0, Ljava/util/Map;

    .line 483
    .line 484
    goto :goto_8

    .line 485
    :cond_16
    move-object v0, v11

    .line 486
    :goto_8
    if-eqz v0, :cond_17

    .line 487
    .line 488
    new-instance v2, Lgf0;

    .line 489
    .line 490
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 491
    .line 492
    .line 493
    new-instance v0, Lnf1;

    .line 494
    .line 495
    invoke-direct {v0}, Lk;-><init>()V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v0}, Lgf0;->a(Lk;)V

    .line 499
    .line 500
    .line 501
    invoke-static {v0, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 502
    .line 503
    .line 504
    :cond_17
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :sswitch_5
    const-string v3, "trackStructured"

    .line 509
    .line 510
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-nez v2, :cond_18

    .line 515
    .line 516
    goto/16 :goto_2a

    .line 517
    .line 518
    :cond_18
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 519
    .line 520
    instance-of v2, v0, Ljava/util/Map;

    .line 521
    .line 522
    if-eqz v2, :cond_19

    .line 523
    .line 524
    check-cast v0, Ljava/util/Map;

    .line 525
    .line 526
    goto :goto_9

    .line 527
    :cond_19
    move-object v0, v11

    .line 528
    :goto_9
    if-eqz v0, :cond_1d

    .line 529
    .line 530
    new-instance v2, Lgf0;

    .line 531
    .line 532
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 533
    .line 534
    .line 535
    new-instance v0, Lgi2;

    .line 536
    .line 537
    invoke-virtual {v2}, Lgf0;->b()Ljava/util/Map;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    invoke-direct {v0, v3}, Lgi2;-><init>(Ljava/util/Map;)V

    .line 542
    .line 543
    .line 544
    new-instance v3, Lfi2;

    .line 545
    .line 546
    iget-object v4, v0, Lgi2;->b:Ljava/util/Map;

    .line 547
    .line 548
    sget-object v5, Lgi2;->d:[Lu21;

    .line 549
    .line 550
    aget-object v10, v5, v10

    .line 551
    .line 552
    invoke-interface {v10}, Ln21;->getName()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v10

    .line 556
    invoke-static {v4, v10}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    check-cast v4, Ljava/lang/String;

    .line 561
    .line 562
    iget-object v10, v0, Lgi2;->c:Ljava/util/Map;

    .line 563
    .line 564
    aget-object v9, v5, v9

    .line 565
    .line 566
    invoke-interface {v9}, Ln21;->getName()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v9

    .line 570
    invoke-static {v10, v9}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v9

    .line 574
    check-cast v9, Ljava/lang/String;

    .line 575
    .line 576
    invoke-direct {v3, v4, v9}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    iget-object v0, v0, Lgi2;->a:Ljava/util/Map;

    .line 580
    .line 581
    aget-object v4, v5, v8

    .line 582
    .line 583
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v4

    .line 587
    invoke-static {v0, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    check-cast v4, Ljava/lang/String;

    .line 592
    .line 593
    if-eqz v4, :cond_1a

    .line 594
    .line 595
    iput-object v4, v3, Lfi2;->d:Ljava/lang/String;

    .line 596
    .line 597
    :cond_1a
    aget-object v4, v5, v7

    .line 598
    .line 599
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    invoke-static {v0, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v4

    .line 607
    check-cast v4, Ljava/lang/String;

    .line 608
    .line 609
    if-eqz v4, :cond_1b

    .line 610
    .line 611
    iput-object v4, v3, Lfi2;->e:Ljava/lang/String;

    .line 612
    .line 613
    :cond_1b
    aget-object v4, v5, v6

    .line 614
    .line 615
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v4

    .line 619
    invoke-static {v0, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    check-cast v0, Ljava/lang/Double;

    .line 624
    .line 625
    if-eqz v0, :cond_1c

    .line 626
    .line 627
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 628
    .line 629
    .line 630
    move-result-wide v4

    .line 631
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    iput-object v0, v3, Lfi2;->f:Ljava/lang/Double;

    .line 636
    .line 637
    :cond_1c
    invoke-virtual {v2, v3}, Lgf0;->a(Lk;)V

    .line 638
    .line 639
    .line 640
    invoke-static {v3, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 641
    .line 642
    .line 643
    :cond_1d
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    return-void

    .line 647
    :sswitch_6
    const-string v3, "trackMediaEndEvent"

    .line 648
    .line 649
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v2

    .line 653
    if-nez v2, :cond_1e

    .line 654
    .line 655
    goto/16 :goto_2a

    .line 656
    .line 657
    :cond_1e
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 658
    .line 659
    instance-of v2, v0, Ljava/util/Map;

    .line 660
    .line 661
    if-eqz v2, :cond_1f

    .line 662
    .line 663
    check-cast v0, Ljava/util/Map;

    .line 664
    .line 665
    goto :goto_a

    .line 666
    :cond_1f
    move-object v0, v11

    .line 667
    :goto_a
    if-eqz v0, :cond_20

    .line 668
    .line 669
    new-instance v2, Lgf0;

    .line 670
    .line 671
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 672
    .line 673
    .line 674
    new-instance v0, Lwe1;

    .line 675
    .line 676
    invoke-direct {v0, v10}, Lwe1;-><init>(I)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v2, v0}, Lgf0;->a(Lk;)V

    .line 680
    .line 681
    .line 682
    invoke-static {v0, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 683
    .line 684
    .line 685
    :cond_20
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 686
    .line 687
    .line 688
    return-void

    .line 689
    :sswitch_7
    const-string v3, "trackMediaAdBreakEndEvent"

    .line 690
    .line 691
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v2

    .line 695
    if-nez v2, :cond_21

    .line 696
    .line 697
    goto/16 :goto_2a

    .line 698
    .line 699
    :cond_21
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 700
    .line 701
    instance-of v2, v0, Ljava/util/Map;

    .line 702
    .line 703
    if-eqz v2, :cond_22

    .line 704
    .line 705
    check-cast v0, Ljava/util/Map;

    .line 706
    .line 707
    goto :goto_b

    .line 708
    :cond_22
    move-object v0, v11

    .line 709
    :goto_b
    if-eqz v0, :cond_23

    .line 710
    .line 711
    new-instance v2, Lgf0;

    .line 712
    .line 713
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 714
    .line 715
    .line 716
    new-instance v0, Lsd1;

    .line 717
    .line 718
    invoke-direct {v0}, Lk;-><init>()V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v2, v0}, Lgf0;->a(Lk;)V

    .line 722
    .line 723
    .line 724
    invoke-static {v0, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 725
    .line 726
    .line 727
    :cond_23
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    return-void

    .line 731
    :sswitch_8
    const-string v3, "startMediaTracking"

    .line 732
    .line 733
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 734
    .line 735
    .line 736
    move-result v2

    .line 737
    if-nez v2, :cond_24

    .line 738
    .line 739
    goto/16 :goto_2a

    .line 740
    .line 741
    :cond_24
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 742
    .line 743
    instance-of v2, v0, Ljava/util/Map;

    .line 744
    .line 745
    if-eqz v2, :cond_25

    .line 746
    .line 747
    check-cast v0, Ljava/util/Map;

    .line 748
    .line 749
    goto :goto_c

    .line 750
    :cond_25
    move-object v0, v11

    .line 751
    :goto_c
    if-eqz v0, :cond_2a

    .line 752
    .line 753
    new-instance v2, Llg2;

    .line 754
    .line 755
    invoke-direct {v2, v0}, Llg2;-><init>(Ljava/util/Map;)V

    .line 756
    .line 757
    .line 758
    sget-object v3, Llg2;->c:[Lu21;

    .line 759
    .line 760
    aget-object v3, v3, v10

    .line 761
    .line 762
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v3

    .line 766
    invoke-static {v0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    check-cast v0, Ljava/lang/String;

    .line 771
    .line 772
    invoke-static {v0}, Lnf2;->a(Ljava/lang/String;)Lht1;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    if-eqz v0, :cond_2a

    .line 777
    .line 778
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 779
    .line 780
    check-cast v0, Lqa2;

    .line 781
    .line 782
    iget-object v0, v0, Lqa2;->i:Lhk2;

    .line 783
    .line 784
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    check-cast v0, Lve1;

    .line 789
    .line 790
    if-eqz v0, :cond_2a

    .line 791
    .line 792
    iget-object v2, v2, Llg2;->b:Lhk2;

    .line 793
    .line 794
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    check-cast v2, Luf1;

    .line 799
    .line 800
    iget-object v3, v2, Luf1;->a:Ljava/util/Map;

    .line 801
    .line 802
    iget-object v4, v2, Luf1;->b:Ljava/util/Map;

    .line 803
    .line 804
    sget-object v12, Luf1;->g:[Lu21;

    .line 805
    .line 806
    aget-object v13, v12, v10

    .line 807
    .line 808
    invoke-interface {v13}, Ln21;->getName()Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v13

    .line 812
    invoke-static {v4, v13}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v4

    .line 816
    move-object v14, v4

    .line 817
    check-cast v14, Ljava/lang/String;

    .line 818
    .line 819
    iget-object v4, v2, Luf1;->c:Lhk2;

    .line 820
    .line 821
    invoke-virtual {v4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v4

    .line 825
    check-cast v4, Ljf1;

    .line 826
    .line 827
    if-eqz v4, :cond_26

    .line 828
    .line 829
    invoke-virtual {v4}, Ljf1;->a()Lif1;

    .line 830
    .line 831
    .line 832
    move-result-object v4

    .line 833
    move-object/from16 v16, v4

    .line 834
    .line 835
    goto :goto_d

    .line 836
    :cond_26
    move-object/from16 v16, v11

    .line 837
    .line 838
    :goto_d
    iget-object v4, v2, Luf1;->d:Ljava/util/Map;

    .line 839
    .line 840
    aget-object v13, v12, v9

    .line 841
    .line 842
    invoke-interface {v13}, Ln21;->getName()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v13

    .line 846
    invoke-static {v4, v13}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    check-cast v4, Ljava/lang/Boolean;

    .line 851
    .line 852
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 853
    .line 854
    .line 855
    move-result v4

    .line 856
    aget-object v8, v12, v8

    .line 857
    .line 858
    invoke-interface {v8}, Ln21;->getName()Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v8

    .line 862
    invoke-static {v3, v8}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v8

    .line 866
    check-cast v8, Ljava/lang/Integer;

    .line 867
    .line 868
    aget-object v7, v12, v7

    .line 869
    .line 870
    invoke-interface {v7}, Ln21;->getName()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v7

    .line 874
    invoke-static {v3, v7}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v7

    .line 878
    check-cast v7, Ljava/lang/Integer;

    .line 879
    .line 880
    iget-object v13, v2, Luf1;->e:Ljava/util/Map;

    .line 881
    .line 882
    aget-object v6, v12, v6

    .line 883
    .line 884
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v6

    .line 888
    invoke-static {v13, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v6

    .line 892
    check-cast v6, Ljava/lang/Boolean;

    .line 893
    .line 894
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 895
    .line 896
    .line 897
    move-result v6

    .line 898
    aget-object v5, v12, v5

    .line 899
    .line 900
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v5

    .line 904
    invoke-static {v3, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    move-object/from16 v19, v3

    .line 909
    .line 910
    check-cast v19, Ljava/util/List;

    .line 911
    .line 912
    iget-object v2, v2, Luf1;->f:Lhk2;

    .line 913
    .line 914
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v2

    .line 918
    move-object/from16 v20, v2

    .line 919
    .line 920
    check-cast v20, Ljava/util/List;

    .line 921
    .line 922
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    if-eqz v6, :cond_27

    .line 926
    .line 927
    new-instance v2, Lwc0;

    .line 928
    .line 929
    sget-object v3, Lyh;->c0:Lyh;

    .line 930
    .line 931
    const/16 v5, 0x10

    .line 932
    .line 933
    invoke-direct {v2, v5, v10}, Lwc0;-><init>(IZ)V

    .line 934
    .line 935
    .line 936
    new-instance v5, Lac1;

    .line 937
    .line 938
    new-instance v6, Ljava/util/Date;

    .line 939
    .line 940
    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 941
    .line 942
    .line 943
    invoke-direct {v5, v9}, Lac1;-><init>(I)V

    .line 944
    .line 945
    .line 946
    iput-object v14, v5, Lac1;->b:Ljava/lang/Object;

    .line 947
    .line 948
    iput-object v6, v5, Lac1;->c:Ljava/lang/Object;

    .line 949
    .line 950
    iput-object v8, v5, Lac1;->d:Ljava/lang/Object;

    .line 951
    .line 952
    iput-object v5, v2, Lwc0;->b:Ljava/lang/Object;

    .line 953
    .line 954
    new-instance v6, Ltf1;

    .line 955
    .line 956
    invoke-direct {v6, v5, v3}, Ltf1;-><init>(Lac1;Lkotlin/jvm/functions/Function0;)V

    .line 957
    .line 958
    .line 959
    iput-object v6, v2, Lwc0;->c:Ljava/lang/Object;

    .line 960
    .line 961
    move-object/from16 v17, v2

    .line 962
    .line 963
    goto :goto_e

    .line 964
    :cond_27
    move-object/from16 v17, v11

    .line 965
    .line 966
    :goto_e
    if-eqz v4, :cond_28

    .line 967
    .line 968
    new-instance v2, Lef1;

    .line 969
    .line 970
    invoke-direct {v2, v8, v7}, Lef1;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 971
    .line 972
    .line 973
    move-object/from16 v18, v2

    .line 974
    .line 975
    goto :goto_f

    .line 976
    :cond_28
    move-object/from16 v18, v11

    .line 977
    .line 978
    :goto_f
    new-instance v13, Lvf1;

    .line 979
    .line 980
    iget-object v2, v0, Lsq3;->a:Ljava/lang/Object;

    .line 981
    .line 982
    check-cast v2, Lqa2;

    .line 983
    .line 984
    iget-object v3, v2, Lqa2;->f:Lht1;

    .line 985
    .line 986
    if-nez v3, :cond_29

    .line 987
    .line 988
    new-instance v3, Lht1;

    .line 989
    .line 990
    invoke-direct {v3, v2}, Lsq3;-><init>(Lqa2;)V

    .line 991
    .line 992
    .line 993
    iput-object v3, v2, Lqa2;->f:Lht1;

    .line 994
    .line 995
    :cond_29
    move-object v15, v3

    .line 996
    invoke-direct/range {v13 .. v20}, Lvf1;-><init>(Ljava/lang/String;Lht1;Lif1;Lwc0;Lef1;Ljava/util/List;Ljava/util/List;)V

    .line 997
    .line 998
    .line 999
    iget-object v0, v0, Lve1;->b:Ljava/util/LinkedHashMap;

    .line 1000
    .line 1001
    invoke-interface {v0, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    :cond_2a
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 1005
    .line 1006
    .line 1007
    return-void

    .line 1008
    :sswitch_9
    const-string v3, "trackTiming"

    .line 1009
    .line 1010
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v2

    .line 1014
    if-nez v2, :cond_2b

    .line 1015
    .line 1016
    goto/16 :goto_2a

    .line 1017
    .line 1018
    :cond_2b
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 1019
    .line 1020
    instance-of v2, v0, Ljava/util/Map;

    .line 1021
    .line 1022
    if-eqz v2, :cond_2c

    .line 1023
    .line 1024
    check-cast v0, Ljava/util/Map;

    .line 1025
    .line 1026
    goto :goto_10

    .line 1027
    :cond_2c
    move-object v0, v11

    .line 1028
    :goto_10
    if-eqz v0, :cond_2e

    .line 1029
    .line 1030
    new-instance v2, Lgf0;

    .line 1031
    .line 1032
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 1033
    .line 1034
    .line 1035
    new-instance v0, Lso2;

    .line 1036
    .line 1037
    invoke-virtual {v2}, Lgf0;->b()Ljava/util/Map;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v3

    .line 1041
    invoke-direct {v0, v3}, Lso2;-><init>(Ljava/util/Map;)V

    .line 1042
    .line 1043
    .line 1044
    new-instance v4, Lro2;

    .line 1045
    .line 1046
    sget-object v5, Lso2;->b:[Lu21;

    .line 1047
    .line 1048
    aget-object v6, v5, v10

    .line 1049
    .line 1050
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v6

    .line 1054
    invoke-static {v3, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v6

    .line 1058
    check-cast v6, Ljava/lang/String;

    .line 1059
    .line 1060
    aget-object v9, v5, v9

    .line 1061
    .line 1062
    invoke-interface {v9}, Ln21;->getName()Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v9

    .line 1066
    invoke-static {v3, v9}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v9

    .line 1070
    check-cast v9, Ljava/lang/String;

    .line 1071
    .line 1072
    aget-object v8, v5, v8

    .line 1073
    .line 1074
    invoke-interface {v8}, Ln21;->getName()Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v8

    .line 1078
    invoke-static {v3, v8}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v3

    .line 1082
    check-cast v3, Ljava/lang/Number;

    .line 1083
    .line 1084
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1085
    .line 1086
    .line 1087
    move-result v3

    .line 1088
    invoke-direct {v4, v3, v6, v9}, Lro2;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    iget-object v0, v0, Lso2;->a:Ljava/util/Map;

    .line 1092
    .line 1093
    aget-object v3, v5, v7

    .line 1094
    .line 1095
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v3

    .line 1099
    invoke-static {v0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    check-cast v0, Ljava/lang/String;

    .line 1104
    .line 1105
    if-eqz v0, :cond_2d

    .line 1106
    .line 1107
    iput-object v0, v4, Lro2;->e:Ljava/lang/String;

    .line 1108
    .line 1109
    :cond_2d
    invoke-virtual {v2, v4}, Lgf0;->a(Lk;)V

    .line 1110
    .line 1111
    .line 1112
    invoke-static {v4, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 1113
    .line 1114
    .line 1115
    :cond_2e
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 1116
    .line 1117
    .line 1118
    return-void

    .line 1119
    :sswitch_a
    const-string v3, "createTracker"

    .line 1120
    .line 1121
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v2

    .line 1125
    if-nez v2, :cond_2f

    .line 1126
    .line 1127
    goto/16 :goto_2a

    .line 1128
    .line 1129
    :cond_2f
    move-object/from16 v2, p0

    .line 1130
    .line 1131
    iget-object v2, v2, Lof2;->b:Landroid/content/Context;

    .line 1132
    .line 1133
    if-eqz v2, :cond_62

    .line 1134
    .line 1135
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 1136
    .line 1137
    instance-of v3, v0, Ljava/util/Map;

    .line 1138
    .line 1139
    if-eqz v3, :cond_30

    .line 1140
    .line 1141
    check-cast v0, Ljava/util/Map;

    .line 1142
    .line 1143
    goto :goto_11

    .line 1144
    :cond_30
    move-object v0, v11

    .line 1145
    :goto_11
    if-eqz v0, :cond_62

    .line 1146
    .line 1147
    new-instance v3, Lj20;

    .line 1148
    .line 1149
    invoke-direct {v3, v0}, Lj20;-><init>(Ljava/util/Map;)V

    .line 1150
    .line 1151
    .line 1152
    new-instance v12, Ljava/util/ArrayList;

    .line 1153
    .line 1154
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1155
    .line 1156
    .line 1157
    iget-object v13, v3, Lj20;->b:Lhk2;

    .line 1158
    .line 1159
    invoke-virtual {v13}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v13

    .line 1163
    check-cast v13, Ltm1;

    .line 1164
    .line 1165
    iget-object v14, v13, Ltm1;->a:Ljava/util/Map;

    .line 1166
    .line 1167
    sget-object v15, Ltm1;->c:[Lu21;

    .line 1168
    .line 1169
    aget-object v16, v15, v9

    .line 1170
    .line 1171
    const/16 v17, 0x6

    .line 1172
    .line 1173
    invoke-interface/range {v16 .. v16}, Ln21;->getName()Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v4

    .line 1177
    invoke-static {v14, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v4

    .line 1181
    check-cast v4, Ljava/lang/String;

    .line 1182
    .line 1183
    move/from16 v16, v5

    .line 1184
    .line 1185
    iget-object v5, v13, Ltm1;->b:Ljava/util/Map;

    .line 1186
    .line 1187
    if-eqz v4, :cond_32

    .line 1188
    .line 1189
    new-instance v4, Lsm1;

    .line 1190
    .line 1191
    aget-object v18, v15, v10

    .line 1192
    .line 1193
    move/from16 v19, v6

    .line 1194
    .line 1195
    invoke-interface/range {v18 .. v18}, Ln21;->getName()Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v6

    .line 1199
    invoke-static {v5, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v5

    .line 1203
    check-cast v5, Ljava/lang/String;

    .line 1204
    .line 1205
    const-string v6, "get"

    .line 1206
    .line 1207
    iget-object v13, v13, Ltm1;->a:Ljava/util/Map;

    .line 1208
    .line 1209
    aget-object v18, v15, v9

    .line 1210
    .line 1211
    move/from16 v20, v7

    .line 1212
    .line 1213
    invoke-interface/range {v18 .. v18}, Ln21;->getName()Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v7

    .line 1217
    invoke-static {v13, v7}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v7

    .line 1221
    check-cast v7, Ljava/lang/String;

    .line 1222
    .line 1223
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v6

    .line 1227
    if-eqz v6, :cond_31

    .line 1228
    .line 1229
    move v6, v9

    .line 1230
    goto :goto_12

    .line 1231
    :cond_31
    move v6, v8

    .line 1232
    :goto_12
    invoke-direct {v4, v5, v6}, Lsm1;-><init>(Ljava/lang/String;I)V

    .line 1233
    .line 1234
    .line 1235
    goto :goto_13

    .line 1236
    :cond_32
    move/from16 v19, v6

    .line 1237
    .line 1238
    move/from16 v20, v7

    .line 1239
    .line 1240
    new-instance v4, Lsm1;

    .line 1241
    .line 1242
    aget-object v6, v15, v10

    .line 1243
    .line 1244
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v6

    .line 1248
    invoke-static {v5, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v5

    .line 1252
    check-cast v5, Ljava/lang/String;

    .line 1253
    .line 1254
    invoke-direct {v4, v5, v8}, Lsm1;-><init>(Ljava/lang/String;I)V

    .line 1255
    .line 1256
    .line 1257
    :goto_13
    aget-object v5, v15, v8

    .line 1258
    .line 1259
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v5

    .line 1263
    invoke-static {v14, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v5

    .line 1267
    check-cast v5, Ljava/lang/String;

    .line 1268
    .line 1269
    if-eqz v5, :cond_33

    .line 1270
    .line 1271
    iput-object v5, v4, Lsm1;->e:Ljava/lang/String;

    .line 1272
    .line 1273
    :cond_33
    aget-object v5, v15, v20

    .line 1274
    .line 1275
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v5

    .line 1279
    invoke-static {v14, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v5

    .line 1283
    check-cast v5, Ljava/util/Map;

    .line 1284
    .line 1285
    if-eqz v5, :cond_34

    .line 1286
    .line 1287
    iput-object v5, v4, Lsm1;->f:Ljava/util/Map;

    .line 1288
    .line 1289
    :cond_34
    iget-object v5, v3, Lj20;->c:Lhk2;

    .line 1290
    .line 1291
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v5

    .line 1295
    check-cast v5, Lwq2;

    .line 1296
    .line 1297
    if-nez v5, :cond_35

    .line 1298
    .line 1299
    new-instance v5, Lvq2;

    .line 1300
    .line 1301
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v7

    .line 1305
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1306
    .line 1307
    .line 1308
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1309
    .line 1310
    .line 1311
    iput-object v7, v5, Lvq2;->a:Ljava/lang/String;

    .line 1312
    .line 1313
    const-string v7, "flutter-0.7.1"

    .line 1314
    .line 1315
    iput-object v7, v5, Lvq2;->b0:Ljava/lang/String;

    .line 1316
    .line 1317
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1318
    .line 1319
    iput-object v7, v5, Lvq2;->U:Ljava/lang/Boolean;

    .line 1320
    .line 1321
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1322
    .line 1323
    iput-object v13, v5, Lvq2;->W:Ljava/lang/Boolean;

    .line 1324
    .line 1325
    iput-object v13, v5, Lvq2;->V:Ljava/lang/Boolean;

    .line 1326
    .line 1327
    iput-object v7, v5, Lvq2;->X:Ljava/lang/Boolean;

    .line 1328
    .line 1329
    iput-object v7, v5, Lvq2;->Y:Ljava/lang/Boolean;

    .line 1330
    .line 1331
    iput-object v7, v5, Lvq2;->Z:Ljava/lang/Boolean;

    .line 1332
    .line 1333
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1334
    .line 1335
    .line 1336
    move/from16 v21, v8

    .line 1337
    .line 1338
    const/16 p0, 0x9

    .line 1339
    .line 1340
    goto/16 :goto_17

    .line 1341
    .line 1342
    :cond_35
    iget-object v7, v5, Lwq2;->a:Ljava/util/Map;

    .line 1343
    .line 1344
    sget-object v13, Lwq2;->c:[Lu21;

    .line 1345
    .line 1346
    aget-object v14, v13, v10

    .line 1347
    .line 1348
    invoke-interface {v14}, Ln21;->getName()Ljava/lang/String;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v14

    .line 1352
    invoke-static {v7, v14}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v14

    .line 1356
    check-cast v14, Ljava/lang/String;

    .line 1357
    .line 1358
    new-instance v15, Lvq2;

    .line 1359
    .line 1360
    if-nez v14, :cond_36

    .line 1361
    .line 1362
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v14

    .line 1366
    :cond_36
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 1370
    .line 1371
    .line 1372
    iput-object v14, v15, Lvq2;->a:Ljava/lang/String;

    .line 1373
    .line 1374
    const-string v14, "flutter-0.7.1"

    .line 1375
    .line 1376
    iput-object v14, v15, Lvq2;->b0:Ljava/lang/String;

    .line 1377
    .line 1378
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1379
    .line 1380
    iput-object v14, v15, Lvq2;->U:Ljava/lang/Boolean;

    .line 1381
    .line 1382
    const/16 p0, 0x9

    .line 1383
    .line 1384
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1385
    .line 1386
    iput-object v6, v15, Lvq2;->W:Ljava/lang/Boolean;

    .line 1387
    .line 1388
    iput-object v6, v15, Lvq2;->V:Ljava/lang/Boolean;

    .line 1389
    .line 1390
    iput-object v14, v15, Lvq2;->X:Ljava/lang/Boolean;

    .line 1391
    .line 1392
    iput-object v14, v15, Lvq2;->Y:Ljava/lang/Boolean;

    .line 1393
    .line 1394
    iput-object v14, v15, Lvq2;->Z:Ljava/lang/Boolean;

    .line 1395
    .line 1396
    aget-object v6, v13, v9

    .line 1397
    .line 1398
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v6

    .line 1402
    invoke-static {v7, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v6

    .line 1406
    check-cast v6, Ljava/lang/String;

    .line 1407
    .line 1408
    const/16 v14, 0x8

    .line 1409
    .line 1410
    const/16 v18, 0x7

    .line 1411
    .line 1412
    if-eqz v6, :cond_3e

    .line 1413
    .line 1414
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 1415
    .line 1416
    .line 1417
    move-result v21

    .line 1418
    sparse-switch v21, :sswitch_data_1

    .line 1419
    .line 1420
    .line 1421
    move/from16 v21, v8

    .line 1422
    .line 1423
    goto/16 :goto_14

    .line 1424
    .line 1425
    :sswitch_b
    move/from16 v21, v8

    .line 1426
    .line 1427
    const-string v8, "cnsl"

    .line 1428
    .line 1429
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1430
    .line 1431
    .line 1432
    move-result v6

    .line 1433
    if-nez v6, :cond_37

    .line 1434
    .line 1435
    goto :goto_14

    .line 1436
    :cond_37
    move/from16 v6, v18

    .line 1437
    .line 1438
    goto/16 :goto_15

    .line 1439
    .line 1440
    :sswitch_c
    move/from16 v21, v8

    .line 1441
    .line 1442
    const-string v8, "web"

    .line 1443
    .line 1444
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1445
    .line 1446
    .line 1447
    move-result v6

    .line 1448
    if-nez v6, :cond_38

    .line 1449
    .line 1450
    goto :goto_14

    .line 1451
    :cond_38
    move v6, v9

    .line 1452
    goto :goto_15

    .line 1453
    :sswitch_d
    move/from16 v21, v8

    .line 1454
    .line 1455
    const-string v8, "srv"

    .line 1456
    .line 1457
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1458
    .line 1459
    .line 1460
    move-result v6

    .line 1461
    if-nez v6, :cond_39

    .line 1462
    .line 1463
    goto :goto_14

    .line 1464
    :cond_39
    move/from16 v6, v19

    .line 1465
    .line 1466
    goto :goto_15

    .line 1467
    :sswitch_e
    move/from16 v21, v8

    .line 1468
    .line 1469
    const-string v8, "iot"

    .line 1470
    .line 1471
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1472
    .line 1473
    .line 1474
    move-result v6

    .line 1475
    if-nez v6, :cond_3a

    .line 1476
    .line 1477
    goto :goto_14

    .line 1478
    :cond_3a
    move v6, v14

    .line 1479
    goto :goto_15

    .line 1480
    :sswitch_f
    move/from16 v21, v8

    .line 1481
    .line 1482
    const-string v8, "app"

    .line 1483
    .line 1484
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1485
    .line 1486
    .line 1487
    move-result v6

    .line 1488
    if-nez v6, :cond_3b

    .line 1489
    .line 1490
    goto :goto_14

    .line 1491
    :cond_3b
    move/from16 v6, v16

    .line 1492
    .line 1493
    goto :goto_15

    .line 1494
    :sswitch_10
    move/from16 v21, v8

    .line 1495
    .line 1496
    const-string v8, "tv"

    .line 1497
    .line 1498
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1499
    .line 1500
    .line 1501
    move-result v6

    .line 1502
    if-nez v6, :cond_3c

    .line 1503
    .line 1504
    goto :goto_14

    .line 1505
    :cond_3c
    move/from16 v6, v17

    .line 1506
    .line 1507
    goto :goto_15

    .line 1508
    :sswitch_11
    move/from16 v21, v8

    .line 1509
    .line 1510
    const-string v8, "pc"

    .line 1511
    .line 1512
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1513
    .line 1514
    .line 1515
    move-result v6

    .line 1516
    if-nez v6, :cond_3d

    .line 1517
    .line 1518
    :goto_14
    invoke-virtual {v15}, Lvq2;->e()I

    .line 1519
    .line 1520
    .line 1521
    move-result v6

    .line 1522
    goto :goto_15

    .line 1523
    :cond_3d
    move/from16 v6, v20

    .line 1524
    .line 1525
    :goto_15
    iput v6, v15, Lvq2;->c:I

    .line 1526
    .line 1527
    goto :goto_16

    .line 1528
    :cond_3e
    move/from16 v21, v8

    .line 1529
    .line 1530
    :goto_16
    aget-object v6, v13, v21

    .line 1531
    .line 1532
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v6

    .line 1536
    invoke-static {v7, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v6

    .line 1540
    check-cast v6, Ljava/lang/Boolean;

    .line 1541
    .line 1542
    if-eqz v6, :cond_3f

    .line 1543
    .line 1544
    iput-object v6, v15, Lvq2;->d:Ljava/lang/Boolean;

    .line 1545
    .line 1546
    :cond_3f
    aget-object v6, v13, v20

    .line 1547
    .line 1548
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v6

    .line 1552
    invoke-static {v7, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v6

    .line 1556
    check-cast v6, Ljava/lang/Boolean;

    .line 1557
    .line 1558
    if-eqz v6, :cond_40

    .line 1559
    .line 1560
    iput-object v6, v15, Lvq2;->i:Ljava/lang/Boolean;

    .line 1561
    .line 1562
    :cond_40
    aget-object v6, v13, v19

    .line 1563
    .line 1564
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v6

    .line 1568
    invoke-static {v7, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v6

    .line 1572
    check-cast v6, Ljava/lang/Boolean;

    .line 1573
    .line 1574
    if-eqz v6, :cond_41

    .line 1575
    .line 1576
    iput-object v6, v15, Lvq2;->v:Ljava/lang/Boolean;

    .line 1577
    .line 1578
    :cond_41
    aget-object v6, v13, v16

    .line 1579
    .line 1580
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v6

    .line 1584
    invoke-static {v7, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v6

    .line 1588
    check-cast v6, Ljava/lang/Boolean;

    .line 1589
    .line 1590
    if-eqz v6, :cond_42

    .line 1591
    .line 1592
    iput-object v6, v15, Lvq2;->e:Ljava/lang/Boolean;

    .line 1593
    .line 1594
    :cond_42
    aget-object v6, v13, v17

    .line 1595
    .line 1596
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v6

    .line 1600
    invoke-static {v7, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v6

    .line 1604
    check-cast v6, Ljava/lang/Boolean;

    .line 1605
    .line 1606
    if-eqz v6, :cond_43

    .line 1607
    .line 1608
    iput-object v6, v15, Lvq2;->a0:Ljava/lang/Boolean;

    .line 1609
    .line 1610
    :cond_43
    aget-object v6, v13, v18

    .line 1611
    .line 1612
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v6

    .line 1616
    invoke-static {v7, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v6

    .line 1620
    check-cast v6, Ljava/lang/Boolean;

    .line 1621
    .line 1622
    if-eqz v6, :cond_44

    .line 1623
    .line 1624
    iput-object v6, v15, Lvq2;->w:Ljava/lang/Boolean;

    .line 1625
    .line 1626
    :cond_44
    aget-object v6, v13, v14

    .line 1627
    .line 1628
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v6

    .line 1632
    invoke-static {v7, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v6

    .line 1636
    check-cast v6, Ljava/lang/Boolean;

    .line 1637
    .line 1638
    if-eqz v6, :cond_45

    .line 1639
    .line 1640
    iput-object v6, v15, Lvq2;->f:Ljava/lang/Boolean;

    .line 1641
    .line 1642
    :cond_45
    aget-object v6, v13, p0

    .line 1643
    .line 1644
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v6

    .line 1648
    invoke-static {v7, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v6

    .line 1652
    check-cast v6, Ljava/lang/Boolean;

    .line 1653
    .line 1654
    if-eqz v6, :cond_46

    .line 1655
    .line 1656
    iput-object v6, v15, Lvq2;->W:Ljava/lang/Boolean;

    .line 1657
    .line 1658
    :cond_46
    const/16 v6, 0xa

    .line 1659
    .line 1660
    aget-object v6, v13, v6

    .line 1661
    .line 1662
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v6

    .line 1666
    invoke-static {v7, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v6

    .line 1670
    check-cast v6, Ljava/lang/Boolean;

    .line 1671
    .line 1672
    if-eqz v6, :cond_47

    .line 1673
    .line 1674
    iput-object v6, v15, Lvq2;->V:Ljava/lang/Boolean;

    .line 1675
    .line 1676
    :cond_47
    iget-object v5, v5, Lwq2;->b:Lhk2;

    .line 1677
    .line 1678
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v5

    .line 1682
    check-cast v5, Lns1;

    .line 1683
    .line 1684
    if-eqz v5, :cond_48

    .line 1685
    .line 1686
    iput-object v5, v15, Lvq2;->c0:Lns1;

    .line 1687
    .line 1688
    :cond_48
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1689
    .line 1690
    .line 1691
    :goto_17
    iget-object v5, v3, Lj20;->d:Lhk2;

    .line 1692
    .line 1693
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v5

    .line 1697
    check-cast v5, Lki2;

    .line 1698
    .line 1699
    if-eqz v5, :cond_53

    .line 1700
    .line 1701
    new-instance v6, Lii2;

    .line 1702
    .line 1703
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1704
    .line 1705
    .line 1706
    iget-object v7, v5, Lki2;->a:Ljava/util/Map;

    .line 1707
    .line 1708
    sget-object v8, Lki2;->d:[Lu21;

    .line 1709
    .line 1710
    aget-object v13, v8, v10

    .line 1711
    .line 1712
    invoke-interface {v13}, Ln21;->getName()Ljava/lang/String;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v13

    .line 1716
    invoke-static {v7, v13}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v13

    .line 1720
    check-cast v13, Ljava/lang/String;

    .line 1721
    .line 1722
    if-eqz v13, :cond_49

    .line 1723
    .line 1724
    iput-object v13, v6, Lii2;->b:Ljava/lang/String;

    .line 1725
    .line 1726
    :cond_49
    aget-object v13, v8, v9

    .line 1727
    .line 1728
    invoke-interface {v13}, Ln21;->getName()Ljava/lang/String;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v13

    .line 1732
    invoke-static {v7, v13}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v13

    .line 1736
    check-cast v13, Ljava/lang/String;

    .line 1737
    .line 1738
    if-eqz v13, :cond_4a

    .line 1739
    .line 1740
    iput-object v13, v6, Lii2;->c:Ljava/lang/String;

    .line 1741
    .line 1742
    :cond_4a
    aget-object v13, v8, v21

    .line 1743
    .line 1744
    invoke-interface {v13}, Ln21;->getName()Ljava/lang/String;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v13

    .line 1748
    invoke-static {v7, v13}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v13

    .line 1752
    check-cast v13, Ljava/lang/String;

    .line 1753
    .line 1754
    if-eqz v13, :cond_4b

    .line 1755
    .line 1756
    iput-object v13, v6, Lii2;->d:Ljava/lang/String;

    .line 1757
    .line 1758
    :cond_4b
    aget-object v13, v8, v20

    .line 1759
    .line 1760
    invoke-interface {v13}, Ln21;->getName()Ljava/lang/String;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v13

    .line 1764
    invoke-static {v7, v13}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v13

    .line 1768
    check-cast v13, Ljava/lang/String;

    .line 1769
    .line 1770
    if-eqz v13, :cond_4c

    .line 1771
    .line 1772
    iput-object v13, v6, Lii2;->e:Ljava/lang/String;

    .line 1773
    .line 1774
    :cond_4c
    aget-object v13, v8, v19

    .line 1775
    .line 1776
    invoke-interface {v13}, Ln21;->getName()Ljava/lang/String;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v13

    .line 1780
    invoke-static {v7, v13}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v13

    .line 1784
    check-cast v13, Ljava/lang/String;

    .line 1785
    .line 1786
    if-eqz v13, :cond_4d

    .line 1787
    .line 1788
    iput-object v13, v6, Lii2;->f:Ljava/lang/String;

    .line 1789
    .line 1790
    :cond_4d
    aget-object v13, v8, v16

    .line 1791
    .line 1792
    invoke-interface {v13}, Ln21;->getName()Ljava/lang/String;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v13

    .line 1796
    invoke-static {v7, v13}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v13

    .line 1800
    check-cast v13, Ljava/lang/String;

    .line 1801
    .line 1802
    if-eqz v13, :cond_4e

    .line 1803
    .line 1804
    iput-object v13, v6, Lii2;->i:Ljava/lang/String;

    .line 1805
    .line 1806
    :cond_4e
    aget-object v13, v8, v17

    .line 1807
    .line 1808
    invoke-interface {v13}, Ln21;->getName()Ljava/lang/String;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v13

    .line 1812
    invoke-static {v7, v13}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v13

    .line 1816
    check-cast v13, Ljava/lang/String;

    .line 1817
    .line 1818
    if-eqz v13, :cond_4f

    .line 1819
    .line 1820
    iput-object v13, v6, Lii2;->v:Ljava/lang/String;

    .line 1821
    .line 1822
    :cond_4f
    iget-object v13, v5, Lki2;->b:Lhk2;

    .line 1823
    .line 1824
    invoke-virtual {v13}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v13

    .line 1828
    check-cast v13, Lte2;

    .line 1829
    .line 1830
    if-eqz v13, :cond_50

    .line 1831
    .line 1832
    iput-object v13, v6, Lii2;->w:Lte2;

    .line 1833
    .line 1834
    :cond_50
    iget-object v5, v5, Lki2;->c:Lhk2;

    .line 1835
    .line 1836
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v5

    .line 1840
    check-cast v5, Lte2;

    .line 1841
    .line 1842
    if-eqz v5, :cond_51

    .line 1843
    .line 1844
    iput-object v5, v6, Lii2;->U:Lte2;

    .line 1845
    .line 1846
    :cond_51
    aget-object v5, v8, p0

    .line 1847
    .line 1848
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v5

    .line 1852
    invoke-static {v7, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v5

    .line 1856
    check-cast v5, Ljava/lang/Double;

    .line 1857
    .line 1858
    if-eqz v5, :cond_52

    .line 1859
    .line 1860
    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    .line 1861
    .line 1862
    .line 1863
    move-result-wide v7

    .line 1864
    double-to-int v5, v7

    .line 1865
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v5

    .line 1869
    iput-object v5, v6, Lii2;->V:Ljava/lang/Integer;

    .line 1870
    .line 1871
    :cond_52
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1872
    .line 1873
    .line 1874
    :cond_53
    iget-object v5, v3, Lj20;->e:Lhk2;

    .line 1875
    .line 1876
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v5

    .line 1880
    check-cast v5, Ljq0;

    .line 1881
    .line 1882
    if-eqz v5, :cond_59

    .line 1883
    .line 1884
    iget-object v5, v5, Ljq0;->a:Ljava/util/Map;

    .line 1885
    .line 1886
    sget-object v6, Ljq0;->b:[Lu21;

    .line 1887
    .line 1888
    aget-object v7, v6, v10

    .line 1889
    .line 1890
    invoke-interface {v7}, Ln21;->getName()Ljava/lang/String;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v7

    .line 1894
    invoke-static {v5, v7}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v7

    .line 1898
    check-cast v7, Ljava/lang/String;

    .line 1899
    .line 1900
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 1901
    .line 1902
    .line 1903
    move-result v8

    .line 1904
    sparse-switch v8, :sswitch_data_2

    .line 1905
    .line 1906
    .line 1907
    goto :goto_18

    .line 1908
    :sswitch_12
    const-string v8, "legal_obligation"

    .line 1909
    .line 1910
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1911
    .line 1912
    .line 1913
    move-result v7

    .line 1914
    if-nez v7, :cond_54

    .line 1915
    .line 1916
    goto :goto_18

    .line 1917
    :cond_54
    move/from16 v7, v20

    .line 1918
    .line 1919
    goto :goto_19

    .line 1920
    :sswitch_13
    const-string v8, "contract"

    .line 1921
    .line 1922
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1923
    .line 1924
    .line 1925
    move-result v7

    .line 1926
    if-nez v7, :cond_55

    .line 1927
    .line 1928
    goto :goto_18

    .line 1929
    :cond_55
    move/from16 v7, v21

    .line 1930
    .line 1931
    goto :goto_19

    .line 1932
    :sswitch_14
    const-string v8, "public_task"

    .line 1933
    .line 1934
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1935
    .line 1936
    .line 1937
    move-result v7

    .line 1938
    if-nez v7, :cond_56

    .line 1939
    .line 1940
    goto :goto_18

    .line 1941
    :cond_56
    move/from16 v7, v16

    .line 1942
    .line 1943
    goto :goto_19

    .line 1944
    :sswitch_15
    const-string v8, "legitimate_interests"

    .line 1945
    .line 1946
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1947
    .line 1948
    .line 1949
    move-result v7

    .line 1950
    if-nez v7, :cond_57

    .line 1951
    .line 1952
    goto :goto_18

    .line 1953
    :cond_57
    move/from16 v7, v17

    .line 1954
    .line 1955
    goto :goto_19

    .line 1956
    :sswitch_16
    const-string v8, "vital_interests"

    .line 1957
    .line 1958
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1959
    .line 1960
    .line 1961
    move-result v7

    .line 1962
    if-nez v7, :cond_58

    .line 1963
    .line 1964
    :goto_18
    move v7, v9

    .line 1965
    goto :goto_19

    .line 1966
    :cond_58
    move/from16 v7, v19

    .line 1967
    .line 1968
    :goto_19
    new-instance v8, Liq0;

    .line 1969
    .line 1970
    aget-object v9, v6, v9

    .line 1971
    .line 1972
    invoke-interface {v9}, Ln21;->getName()Ljava/lang/String;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v9

    .line 1976
    invoke-static {v5, v9}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v9

    .line 1980
    check-cast v9, Ljava/lang/String;

    .line 1981
    .line 1982
    aget-object v13, v6, v21

    .line 1983
    .line 1984
    invoke-interface {v13}, Ln21;->getName()Ljava/lang/String;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v13

    .line 1988
    invoke-static {v5, v13}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v13

    .line 1992
    check-cast v13, Ljava/lang/String;

    .line 1993
    .line 1994
    aget-object v6, v6, v20

    .line 1995
    .line 1996
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v6

    .line 2000
    invoke-static {v5, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v5

    .line 2004
    check-cast v5, Ljava/lang/String;

    .line 2005
    .line 2006
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 2007
    .line 2008
    .line 2009
    iput v7, v8, Liq0;->b:I

    .line 2010
    .line 2011
    iput-object v9, v8, Liq0;->c:Ljava/lang/String;

    .line 2012
    .line 2013
    iput-object v13, v8, Liq0;->d:Ljava/lang/String;

    .line 2014
    .line 2015
    iput-object v5, v8, Liq0;->e:Ljava/lang/String;

    .line 2016
    .line 2017
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2018
    .line 2019
    .line 2020
    :cond_59
    iget-object v3, v3, Lj20;->f:Lhk2;

    .line 2021
    .line 2022
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v3

    .line 2026
    check-cast v3, Llc0;

    .line 2027
    .line 2028
    if-eqz v3, :cond_5b

    .line 2029
    .line 2030
    new-instance v5, Lkc0;

    .line 2031
    .line 2032
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 2033
    .line 2034
    .line 2035
    iget-object v3, v3, Llc0;->a:Ljava/util/Map;

    .line 2036
    .line 2037
    sget-object v6, Llc0;->b:[Lu21;

    .line 2038
    .line 2039
    aget-object v6, v6, v10

    .line 2040
    .line 2041
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v6

    .line 2045
    invoke-static {v3, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v3

    .line 2049
    check-cast v3, Ljava/lang/Boolean;

    .line 2050
    .line 2051
    if-eqz v3, :cond_5a

    .line 2052
    .line 2053
    iput-object v3, v5, Lkc0;->b:Ljava/lang/Boolean;

    .line 2054
    .line 2055
    :cond_5a
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2056
    .line 2057
    .line 2058
    :cond_5b
    sget-object v3, Lj20;->g:[Lu21;

    .line 2059
    .line 2060
    aget-object v3, v3, v10

    .line 2061
    .line 2062
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v3

    .line 2066
    invoke-static {v0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v0

    .line 2070
    check-cast v0, Ljava/lang/String;

    .line 2071
    .line 2072
    new-array v3, v10, [Luy;

    .line 2073
    .line 2074
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v3

    .line 2078
    check-cast v3, [Luy;

    .line 2079
    .line 2080
    array-length v5, v3

    .line 2081
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v3

    .line 2085
    check-cast v3, [Luy;

    .line 2086
    .line 2087
    sget-object v5, Lnf2;->a:Lqa2;

    .line 2088
    .line 2089
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2090
    .line 2091
    .line 2092
    sget-object v5, Lnf2;->b:Ljava/util/HashMap;

    .line 2093
    .line 2094
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2095
    .line 2096
    .line 2097
    move-result-object v6

    .line 2098
    check-cast v6, Lqa2;

    .line 2099
    .line 2100
    if-eqz v6, :cond_60

    .line 2101
    .line 2102
    new-instance v0, Ljava/util/ArrayList;

    .line 2103
    .line 2104
    array-length v2, v3

    .line 2105
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v2

    .line 2109
    invoke-static {v2}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v2

    .line 2113
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2114
    .line 2115
    .line 2116
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2117
    .line 2118
    .line 2119
    iget-object v2, v6, Lqa2;->c:Luq2;

    .line 2120
    .line 2121
    if-eqz v2, :cond_5c

    .line 2122
    .line 2123
    iget-object v3, v2, Luq2;->F:Ltq2;

    .line 2124
    .line 2125
    invoke-static {v3}, Lxn1;->c(Ltq2;)V

    .line 2126
    .line 2127
    .line 2128
    iget-object v3, v2, Luq2;->D:Ltq2;

    .line 2129
    .line 2130
    invoke-static {v3}, Lxn1;->c(Ltq2;)V

    .line 2131
    .line 2132
    .line 2133
    iget-object v3, v2, Luq2;->C:Ltq2;

    .line 2134
    .line 2135
    invoke-static {v3}, Lxn1;->c(Ltq2;)V

    .line 2136
    .line 2137
    .line 2138
    iget-object v3, v2, Luq2;->E:Ltq2;

    .line 2139
    .line 2140
    invoke-static {v3}, Lxn1;->c(Ltq2;)V

    .line 2141
    .line 2142
    .line 2143
    iget-object v3, v2, Luq2;->G:Ltq2;

    .line 2144
    .line 2145
    invoke-static {v3}, Lxn1;->c(Ltq2;)V

    .line 2146
    .line 2147
    .line 2148
    invoke-virtual {v2}, Luq2;->b()V

    .line 2149
    .line 2150
    .line 2151
    iget-object v2, v2, Luq2;->i:Ljc0;

    .line 2152
    .line 2153
    invoke-virtual {v2}, Ljc0;->e()V

    .line 2154
    .line 2155
    .line 2156
    :cond_5c
    iget-object v2, v6, Lqa2;->d:Ljc0;

    .line 2157
    .line 2158
    if-eqz v2, :cond_5d

    .line 2159
    .line 2160
    invoke-virtual {v2}, Ljc0;->e()V

    .line 2161
    .line 2162
    .line 2163
    :cond_5d
    invoke-virtual {v6}, Lqa2;->f()Lvq2;

    .line 2164
    .line 2165
    .line 2166
    move-result-object v2

    .line 2167
    iput-object v11, v2, Lvq2;->b:Lvq2;

    .line 2168
    .line 2169
    iget-object v2, v6, Lqa2;->l:Lii2;

    .line 2170
    .line 2171
    if-eqz v2, :cond_5f

    .line 2172
    .line 2173
    iput-object v11, v2, Lii2;->a:Lii2;

    .line 2174
    .line 2175
    invoke-virtual {v6}, Lqa2;->a()Lkc0;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v2

    .line 2179
    iput-object v11, v2, Lkc0;->a:Lkc0;

    .line 2180
    .line 2181
    invoke-virtual {v6}, Lqa2;->e()Lgb2;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v2

    .line 2185
    iput-object v11, v2, Lgb2;->a:Lgb2;

    .line 2186
    .line 2187
    iget-object v2, v6, Lqa2;->o:Liq0;

    .line 2188
    .line 2189
    if-eqz v2, :cond_5e

    .line 2190
    .line 2191
    iput-object v11, v2, Liq0;->a:Liq0;

    .line 2192
    .line 2193
    invoke-virtual {v6, v0}, Lqa2;->g(Ljava/util/List;)V

    .line 2194
    .line 2195
    .line 2196
    iput-object v11, v6, Lqa2;->d:Ljc0;

    .line 2197
    .line 2198
    iput-object v11, v6, Lqa2;->e:Ld31;

    .line 2199
    .line 2200
    iput-object v11, v6, Lqa2;->c:Luq2;

    .line 2201
    .line 2202
    invoke-virtual {v6}, Lqa2;->d()Luq2;

    .line 2203
    .line 2204
    .line 2205
    goto :goto_1b

    .line 2206
    :cond_5e
    const-string v0, "gdprConfiguration"

    .line 2207
    .line 2208
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 2209
    .line 2210
    .line 2211
    throw v11

    .line 2212
    :cond_5f
    const-string v0, "subjectConfiguration"

    .line 2213
    .line 2214
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 2215
    .line 2216
    .line 2217
    throw v11

    .line 2218
    :cond_60
    new-instance v6, Lqa2;

    .line 2219
    .line 2220
    array-length v7, v3

    .line 2221
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v3

    .line 2225
    invoke-static {v3}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v3

    .line 2229
    invoke-direct {v6, v2, v0, v4, v3}, Lqa2;-><init>(Landroid/content/Context;Ljava/lang/String;Lsm1;Ljava/util/List;)V

    .line 2230
    .line 2231
    .line 2232
    const-class v2, Lnf2;

    .line 2233
    .line 2234
    monitor-enter v2

    .line 2235
    :try_start_0
    invoke-virtual {v5, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2236
    .line 2237
    .line 2238
    sget-object v0, Lnf2;->a:Lqa2;

    .line 2239
    .line 2240
    if-nez v0, :cond_61

    .line 2241
    .line 2242
    sput-object v6, Lnf2;->a:Lqa2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2243
    .line 2244
    goto :goto_1a

    .line 2245
    :catchall_0
    move-exception v0

    .line 2246
    goto :goto_1c

    .line 2247
    :cond_61
    :goto_1a
    monitor-exit v2

    .line 2248
    :goto_1b
    iget-object v0, v6, Lqa2;->f:Lht1;

    .line 2249
    .line 2250
    if-nez v0, :cond_62

    .line 2251
    .line 2252
    new-instance v0, Lht1;

    .line 2253
    .line 2254
    invoke-direct {v0, v6}, Lsq3;-><init>(Lqa2;)V

    .line 2255
    .line 2256
    .line 2257
    iput-object v0, v6, Lqa2;->f:Lht1;

    .line 2258
    .line 2259
    goto :goto_1d

    .line 2260
    :goto_1c
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2261
    throw v0

    .line 2262
    :cond_62
    :goto_1d
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 2263
    .line 2264
    .line 2265
    return-void

    .line 2266
    :sswitch_17
    const-string v3, "trackSelfDescribing"

    .line 2267
    .line 2268
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2269
    .line 2270
    .line 2271
    move-result v2

    .line 2272
    if-nez v2, :cond_63

    .line 2273
    .line 2274
    goto/16 :goto_2a

    .line 2275
    .line 2276
    :cond_63
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2277
    .line 2278
    instance-of v2, v0, Ljava/util/Map;

    .line 2279
    .line 2280
    if-eqz v2, :cond_64

    .line 2281
    .line 2282
    check-cast v0, Ljava/util/Map;

    .line 2283
    .line 2284
    goto :goto_1e

    .line 2285
    :cond_64
    move-object v0, v11

    .line 2286
    :goto_1e
    if-eqz v0, :cond_65

    .line 2287
    .line 2288
    new-instance v2, Lgf0;

    .line 2289
    .line 2290
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 2291
    .line 2292
    .line 2293
    new-instance v0, Lc92;

    .line 2294
    .line 2295
    invoke-virtual {v2}, Lgf0;->b()Ljava/util/Map;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v3

    .line 2299
    invoke-direct {v0, v3}, Lc92;-><init>(Ljava/util/Map;)V

    .line 2300
    .line 2301
    .line 2302
    new-instance v3, La92;

    .line 2303
    .line 2304
    invoke-virtual {v0}, Lc92;->a()Lb92;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v0

    .line 2308
    invoke-direct {v3, v0}, La92;-><init>(Lb92;)V

    .line 2309
    .line 2310
    .line 2311
    invoke-virtual {v2, v3}, Lgf0;->a(Lk;)V

    .line 2312
    .line 2313
    .line 2314
    invoke-static {v3, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 2315
    .line 2316
    .line 2317
    :cond_65
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 2318
    .line 2319
    .line 2320
    return-void

    .line 2321
    :sswitch_18
    const-string v3, "trackMediaAdResumeEvent"

    .line 2322
    .line 2323
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2324
    .line 2325
    .line 2326
    move-result v2

    .line 2327
    if-nez v2, :cond_66

    .line 2328
    .line 2329
    goto/16 :goto_2a

    .line 2330
    .line 2331
    :cond_66
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2332
    .line 2333
    instance-of v2, v0, Ljava/util/Map;

    .line 2334
    .line 2335
    if-eqz v2, :cond_67

    .line 2336
    .line 2337
    check-cast v0, Ljava/util/Map;

    .line 2338
    .line 2339
    goto :goto_1f

    .line 2340
    :cond_67
    move-object v0, v11

    .line 2341
    :goto_1f
    if-eqz v0, :cond_68

    .line 2342
    .line 2343
    new-instance v2, Lgf0;

    .line 2344
    .line 2345
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 2346
    .line 2347
    .line 2348
    new-instance v0, Lbe1;

    .line 2349
    .line 2350
    invoke-virtual {v2}, Lgf0;->b()Ljava/util/Map;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v3

    .line 2354
    invoke-direct {v0, v3}, Lbe1;-><init>(Ljava/util/Map;)V

    .line 2355
    .line 2356
    .line 2357
    new-instance v3, Lfe1;

    .line 2358
    .line 2359
    invoke-virtual {v0}, Lbe1;->a()Ljava/lang/Integer;

    .line 2360
    .line 2361
    .line 2362
    move-result-object v0

    .line 2363
    invoke-direct {v3}, Lk;-><init>()V

    .line 2364
    .line 2365
    .line 2366
    iput-object v0, v3, Lfe1;->b:Ljava/lang/Integer;

    .line 2367
    .line 2368
    invoke-virtual {v2, v3}, Lgf0;->a(Lk;)V

    .line 2369
    .line 2370
    .line 2371
    invoke-static {v3, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 2372
    .line 2373
    .line 2374
    :cond_68
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 2375
    .line 2376
    .line 2377
    return-void

    .line 2378
    :sswitch_19
    move/from16 v16, v5

    .line 2379
    .line 2380
    move/from16 v19, v6

    .line 2381
    .line 2382
    move/from16 v20, v7

    .line 2383
    .line 2384
    move/from16 v21, v8

    .line 2385
    .line 2386
    const/16 v17, 0x6

    .line 2387
    .line 2388
    const-string v3, "trackScreenView"

    .line 2389
    .line 2390
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2391
    .line 2392
    .line 2393
    move-result v2

    .line 2394
    if-nez v2, :cond_69

    .line 2395
    .line 2396
    goto/16 :goto_2a

    .line 2397
    .line 2398
    :cond_69
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2399
    .line 2400
    instance-of v2, v0, Ljava/util/Map;

    .line 2401
    .line 2402
    if-eqz v2, :cond_6a

    .line 2403
    .line 2404
    check-cast v0, Ljava/util/Map;

    .line 2405
    .line 2406
    goto :goto_20

    .line 2407
    :cond_6a
    move-object v0, v11

    .line 2408
    :goto_20
    if-eqz v0, :cond_70

    .line 2409
    .line 2410
    new-instance v2, Lgf0;

    .line 2411
    .line 2412
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 2413
    .line 2414
    .line 2415
    new-instance v0, Lw72;

    .line 2416
    .line 2417
    invoke-virtual {v2}, Lgf0;->b()Ljava/util/Map;

    .line 2418
    .line 2419
    .line 2420
    move-result-object v3

    .line 2421
    invoke-direct {v0, v3}, Lw72;-><init>(Ljava/util/Map;)V

    .line 2422
    .line 2423
    .line 2424
    new-instance v4, Lv72;

    .line 2425
    .line 2426
    sget-object v5, Lw72;->c:[Lu21;

    .line 2427
    .line 2428
    aget-object v6, v5, v10

    .line 2429
    .line 2430
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 2431
    .line 2432
    .line 2433
    move-result-object v6

    .line 2434
    invoke-static {v3, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v3

    .line 2438
    check-cast v3, Ljava/lang/String;

    .line 2439
    .line 2440
    iget-object v6, v0, Lw72;->b:Lhk2;

    .line 2441
    .line 2442
    invoke-virtual {v6}, Lhk2;->getValue()Ljava/lang/Object;

    .line 2443
    .line 2444
    .line 2445
    move-result-object v6

    .line 2446
    check-cast v6, Ljava/util/UUID;

    .line 2447
    .line 2448
    invoke-direct {v4, v3, v6}, Lv72;-><init>(Ljava/lang/String;Ljava/util/UUID;)V

    .line 2449
    .line 2450
    .line 2451
    iget-object v0, v0, Lw72;->a:Ljava/util/Map;

    .line 2452
    .line 2453
    aget-object v3, v5, v21

    .line 2454
    .line 2455
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 2456
    .line 2457
    .line 2458
    move-result-object v3

    .line 2459
    invoke-static {v0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2460
    .line 2461
    .line 2462
    move-result-object v3

    .line 2463
    check-cast v3, Ljava/lang/String;

    .line 2464
    .line 2465
    if-eqz v3, :cond_6b

    .line 2466
    .line 2467
    iput-object v3, v4, Lv72;->d:Ljava/lang/String;

    .line 2468
    .line 2469
    :cond_6b
    aget-object v3, v5, v20

    .line 2470
    .line 2471
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 2472
    .line 2473
    .line 2474
    move-result-object v3

    .line 2475
    invoke-static {v0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2476
    .line 2477
    .line 2478
    move-result-object v3

    .line 2479
    check-cast v3, Ljava/lang/String;

    .line 2480
    .line 2481
    if-eqz v3, :cond_6c

    .line 2482
    .line 2483
    iput-object v3, v4, Lv72;->e:Ljava/lang/String;

    .line 2484
    .line 2485
    :cond_6c
    aget-object v3, v5, v19

    .line 2486
    .line 2487
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 2488
    .line 2489
    .line 2490
    move-result-object v3

    .line 2491
    invoke-static {v0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2492
    .line 2493
    .line 2494
    move-result-object v3

    .line 2495
    check-cast v3, Ljava/lang/String;

    .line 2496
    .line 2497
    if-eqz v3, :cond_6d

    .line 2498
    .line 2499
    iput-object v3, v4, Lv72;->g:Ljava/lang/String;

    .line 2500
    .line 2501
    :cond_6d
    aget-object v3, v5, v16

    .line 2502
    .line 2503
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 2504
    .line 2505
    .line 2506
    move-result-object v3

    .line 2507
    invoke-static {v0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2508
    .line 2509
    .line 2510
    move-result-object v3

    .line 2511
    check-cast v3, Ljava/lang/String;

    .line 2512
    .line 2513
    if-eqz v3, :cond_6e

    .line 2514
    .line 2515
    iput-object v3, v4, Lv72;->f:Ljava/lang/String;

    .line 2516
    .line 2517
    :cond_6e
    aget-object v3, v5, v17

    .line 2518
    .line 2519
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 2520
    .line 2521
    .line 2522
    move-result-object v3

    .line 2523
    invoke-static {v0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2524
    .line 2525
    .line 2526
    move-result-object v0

    .line 2527
    check-cast v0, Ljava/lang/String;

    .line 2528
    .line 2529
    if-eqz v0, :cond_6f

    .line 2530
    .line 2531
    iput-object v0, v4, Lv72;->h:Ljava/lang/String;

    .line 2532
    .line 2533
    :cond_6f
    invoke-virtual {v2, v4}, Lgf0;->a(Lk;)V

    .line 2534
    .line 2535
    .line 2536
    invoke-static {v4, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 2537
    .line 2538
    .line 2539
    :cond_70
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 2540
    .line 2541
    .line 2542
    return-void

    .line 2543
    :sswitch_1a
    move/from16 v21, v8

    .line 2544
    .line 2545
    const-string v3, "trackMediaErrorEvent"

    .line 2546
    .line 2547
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2548
    .line 2549
    .line 2550
    move-result v2

    .line 2551
    if-nez v2, :cond_71

    .line 2552
    .line 2553
    goto/16 :goto_2a

    .line 2554
    .line 2555
    :cond_71
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2556
    .line 2557
    instance-of v2, v0, Ljava/util/Map;

    .line 2558
    .line 2559
    if-eqz v2, :cond_72

    .line 2560
    .line 2561
    check-cast v0, Ljava/util/Map;

    .line 2562
    .line 2563
    goto :goto_21

    .line 2564
    :cond_72
    move-object v0, v11

    .line 2565
    :goto_21
    if-eqz v0, :cond_73

    .line 2566
    .line 2567
    new-instance v2, Lgf0;

    .line 2568
    .line 2569
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 2570
    .line 2571
    .line 2572
    new-instance v0, Lye1;

    .line 2573
    .line 2574
    invoke-virtual {v2}, Lgf0;->b()Ljava/util/Map;

    .line 2575
    .line 2576
    .line 2577
    move-result-object v3

    .line 2578
    invoke-direct {v0, v3}, Lye1;-><init>(Ljava/util/Map;)V

    .line 2579
    .line 2580
    .line 2581
    new-instance v3, Lxe1;

    .line 2582
    .line 2583
    iget-object v0, v0, Lye1;->a:Ljava/util/Map;

    .line 2584
    .line 2585
    sget-object v4, Lye1;->b:[Lu21;

    .line 2586
    .line 2587
    aget-object v5, v4, v10

    .line 2588
    .line 2589
    invoke-interface {v5}, Ln21;->getName()Ljava/lang/String;

    .line 2590
    .line 2591
    .line 2592
    move-result-object v5

    .line 2593
    invoke-static {v0, v5}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2594
    .line 2595
    .line 2596
    move-result-object v5

    .line 2597
    check-cast v5, Ljava/lang/String;

    .line 2598
    .line 2599
    aget-object v6, v4, v9

    .line 2600
    .line 2601
    invoke-interface {v6}, Ln21;->getName()Ljava/lang/String;

    .line 2602
    .line 2603
    .line 2604
    move-result-object v6

    .line 2605
    invoke-static {v0, v6}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2606
    .line 2607
    .line 2608
    move-result-object v6

    .line 2609
    check-cast v6, Ljava/lang/String;

    .line 2610
    .line 2611
    aget-object v4, v4, v21

    .line 2612
    .line 2613
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 2614
    .line 2615
    .line 2616
    move-result-object v4

    .line 2617
    invoke-static {v0, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2618
    .line 2619
    .line 2620
    move-result-object v0

    .line 2621
    check-cast v0, Ljava/lang/String;

    .line 2622
    .line 2623
    invoke-direct {v3}, Lk;-><init>()V

    .line 2624
    .line 2625
    .line 2626
    iput-object v5, v3, Lxe1;->b:Ljava/lang/String;

    .line 2627
    .line 2628
    iput-object v6, v3, Lxe1;->c:Ljava/lang/String;

    .line 2629
    .line 2630
    iput-object v0, v3, Lxe1;->d:Ljava/lang/String;

    .line 2631
    .line 2632
    invoke-virtual {v2, v3}, Lgf0;->a(Lk;)V

    .line 2633
    .line 2634
    .line 2635
    invoke-static {v3, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 2636
    .line 2637
    .line 2638
    :cond_73
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 2639
    .line 2640
    .line 2641
    return-void

    .line 2642
    :sswitch_1b
    const-string v3, "getSessionIndex"

    .line 2643
    .line 2644
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2645
    .line 2646
    .line 2647
    move-result v2

    .line 2648
    if-nez v2, :cond_74

    .line 2649
    .line 2650
    goto/16 :goto_2a

    .line 2651
    .line 2652
    :cond_74
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2653
    .line 2654
    instance-of v2, v0, Ljava/util/Map;

    .line 2655
    .line 2656
    if-eqz v2, :cond_75

    .line 2657
    .line 2658
    check-cast v0, Ljava/util/Map;

    .line 2659
    .line 2660
    goto :goto_22

    .line 2661
    :cond_75
    move-object v0, v11

    .line 2662
    :goto_22
    if-eqz v0, :cond_77

    .line 2663
    .line 2664
    new-instance v2, Lyq0;

    .line 2665
    .line 2666
    sget-object v2, Lyq0;->a:[Lu21;

    .line 2667
    .line 2668
    aget-object v2, v2, v10

    .line 2669
    .line 2670
    invoke-interface {v2}, Ln21;->getName()Ljava/lang/String;

    .line 2671
    .line 2672
    .line 2673
    move-result-object v2

    .line 2674
    invoke-static {v0, v2}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2675
    .line 2676
    .line 2677
    move-result-object v0

    .line 2678
    check-cast v0, Ljava/lang/String;

    .line 2679
    .line 2680
    invoke-static {v0}, Lnf2;->a(Ljava/lang/String;)Lht1;

    .line 2681
    .line 2682
    .line 2683
    move-result-object v0

    .line 2684
    if-eqz v0, :cond_77

    .line 2685
    .line 2686
    invoke-virtual {v0}, Lht1;->A()Llb2;

    .line 2687
    .line 2688
    .line 2689
    move-result-object v0

    .line 2690
    if-eqz v0, :cond_77

    .line 2691
    .line 2692
    iget-object v2, v0, Lsq3;->a:Ljava/lang/Object;

    .line 2693
    .line 2694
    check-cast v2, Lqa2;

    .line 2695
    .line 2696
    invoke-virtual {v2}, Lqa2;->d()Luq2;

    .line 2697
    .line 2698
    .line 2699
    move-result-object v2

    .line 2700
    iget-object v2, v2, Luq2;->k:Lza2;

    .line 2701
    .line 2702
    if-nez v2, :cond_76

    .line 2703
    .line 2704
    iget-object v0, v0, Llb2;->b:Ljava/lang/String;

    .line 2705
    .line 2706
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2707
    .line 2708
    .line 2709
    const-string v2, "Attempt to access SessionController fields when disabled"

    .line 2710
    .line 2711
    new-array v3, v10, [Ljava/lang/Object;

    .line 2712
    .line 2713
    invoke-static {v0, v2, v3}, Lk50;->K(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2714
    .line 2715
    .line 2716
    const/4 v0, -0x1

    .line 2717
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2718
    .line 2719
    .line 2720
    move-result-object v11

    .line 2721
    goto :goto_23

    .line 2722
    :cond_76
    iget-object v0, v2, Lza2;->e:Lkn;

    .line 2723
    .line 2724
    if-eqz v0, :cond_77

    .line 2725
    .line 2726
    iget v0, v0, Lkn;->b:I

    .line 2727
    .line 2728
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2729
    .line 2730
    .line 2731
    move-result-object v11

    .line 2732
    :cond_77
    :goto_23
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 2733
    .line 2734
    .line 2735
    return-void

    .line 2736
    :sswitch_1c
    const-string v3, "trackMediaAdThirdQuartileEvent"

    .line 2737
    .line 2738
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2739
    .line 2740
    .line 2741
    move-result v2

    .line 2742
    if-nez v2, :cond_78

    .line 2743
    .line 2744
    goto/16 :goto_2a

    .line 2745
    .line 2746
    :cond_78
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2747
    .line 2748
    instance-of v2, v0, Ljava/util/Map;

    .line 2749
    .line 2750
    if-eqz v2, :cond_79

    .line 2751
    .line 2752
    check-cast v0, Ljava/util/Map;

    .line 2753
    .line 2754
    goto :goto_24

    .line 2755
    :cond_79
    move-object v0, v11

    .line 2756
    :goto_24
    if-eqz v0, :cond_7a

    .line 2757
    .line 2758
    new-instance v2, Lgf0;

    .line 2759
    .line 2760
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 2761
    .line 2762
    .line 2763
    new-instance v0, Lie1;

    .line 2764
    .line 2765
    invoke-direct {v0}, Lk;-><init>()V

    .line 2766
    .line 2767
    .line 2768
    invoke-virtual {v2, v0}, Lgf0;->a(Lk;)V

    .line 2769
    .line 2770
    .line 2771
    invoke-static {v0, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 2772
    .line 2773
    .line 2774
    :cond_7a
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 2775
    .line 2776
    .line 2777
    return-void

    .line 2778
    :sswitch_1d
    const-string v3, "setUserId"

    .line 2779
    .line 2780
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2781
    .line 2782
    .line 2783
    move-result v2

    .line 2784
    if-nez v2, :cond_7b

    .line 2785
    .line 2786
    goto/16 :goto_2a

    .line 2787
    .line 2788
    :cond_7b
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2789
    .line 2790
    instance-of v2, v0, Ljava/util/Map;

    .line 2791
    .line 2792
    if-eqz v2, :cond_7c

    .line 2793
    .line 2794
    check-cast v0, Ljava/util/Map;

    .line 2795
    .line 2796
    goto :goto_25

    .line 2797
    :cond_7c
    move-object v0, v11

    .line 2798
    :goto_25
    if-eqz v0, :cond_7f

    .line 2799
    .line 2800
    new-instance v2, Lsb2;

    .line 2801
    .line 2802
    invoke-direct {v2, v0}, Lsb2;-><init>(Ljava/util/Map;)V

    .line 2803
    .line 2804
    .line 2805
    sget-object v3, Lsb2;->b:[Lu21;

    .line 2806
    .line 2807
    aget-object v4, v3, v10

    .line 2808
    .line 2809
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 2810
    .line 2811
    .line 2812
    move-result-object v4

    .line 2813
    invoke-static {v0, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2814
    .line 2815
    .line 2816
    move-result-object v0

    .line 2817
    check-cast v0, Ljava/lang/String;

    .line 2818
    .line 2819
    invoke-static {v0}, Lnf2;->a(Ljava/lang/String;)Lht1;

    .line 2820
    .line 2821
    .line 2822
    move-result-object v0

    .line 2823
    if-eqz v0, :cond_7f

    .line 2824
    .line 2825
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 2826
    .line 2827
    check-cast v0, Lqa2;

    .line 2828
    .line 2829
    iget-object v4, v0, Lqa2;->g:Lht1;

    .line 2830
    .line 2831
    if-nez v4, :cond_7d

    .line 2832
    .line 2833
    new-instance v4, Lht1;

    .line 2834
    .line 2835
    invoke-direct {v4, v0}, Lsq3;-><init>(Lqa2;)V

    .line 2836
    .line 2837
    .line 2838
    iput-object v4, v0, Lqa2;->g:Lht1;

    .line 2839
    .line 2840
    :cond_7d
    iget-object v0, v2, Lsb2;->a:Ljava/util/Map;

    .line 2841
    .line 2842
    aget-object v2, v3, v9

    .line 2843
    .line 2844
    invoke-interface {v2}, Ln21;->getName()Ljava/lang/String;

    .line 2845
    .line 2846
    .line 2847
    move-result-object v2

    .line 2848
    invoke-static {v0, v2}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2849
    .line 2850
    .line 2851
    move-result-object v0

    .line 2852
    check-cast v0, Ljava/lang/String;

    .line 2853
    .line 2854
    iget-object v2, v4, Lsq3;->a:Ljava/lang/Object;

    .line 2855
    .line 2856
    check-cast v2, Lqa2;

    .line 2857
    .line 2858
    iget-object v3, v2, Lqa2;->l:Lii2;

    .line 2859
    .line 2860
    if-eqz v3, :cond_7e

    .line 2861
    .line 2862
    iput-object v0, v3, Lii2;->b:Ljava/lang/String;

    .line 2863
    .line 2864
    invoke-virtual {v2}, Lqa2;->c()Ld31;

    .line 2865
    .line 2866
    .line 2867
    move-result-object v2

    .line 2868
    iget-object v2, v2, Ld31;->a:Ljava/util/HashMap;

    .line 2869
    .line 2870
    const-string v3, "uid"

    .line 2871
    .line 2872
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2873
    .line 2874
    .line 2875
    goto :goto_26

    .line 2876
    :cond_7e
    const-string v0, "subjectConfiguration"

    .line 2877
    .line 2878
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 2879
    .line 2880
    .line 2881
    throw v11

    .line 2882
    :cond_7f
    :goto_26
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 2883
    .line 2884
    .line 2885
    return-void

    .line 2886
    :sswitch_1e
    const-string v3, "getSessionId"

    .line 2887
    .line 2888
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2889
    .line 2890
    .line 2891
    move-result v2

    .line 2892
    if-nez v2, :cond_80

    .line 2893
    .line 2894
    goto/16 :goto_2a

    .line 2895
    .line 2896
    :cond_80
    invoke-static/range {p1 .. p2}, Lof2;->a(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 2897
    .line 2898
    .line 2899
    return-void

    .line 2900
    :sswitch_1f
    const-string v3, "trackMediaAdFirstQuartileEvent"

    .line 2901
    .line 2902
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2903
    .line 2904
    .line 2905
    move-result v2

    .line 2906
    if-nez v2, :cond_81

    .line 2907
    .line 2908
    goto/16 :goto_2a

    .line 2909
    .line 2910
    :cond_81
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2911
    .line 2912
    instance-of v2, v0, Ljava/util/Map;

    .line 2913
    .line 2914
    if-eqz v2, :cond_82

    .line 2915
    .line 2916
    check-cast v0, Ljava/util/Map;

    .line 2917
    .line 2918
    goto :goto_27

    .line 2919
    :cond_82
    move-object v0, v11

    .line 2920
    :goto_27
    if-eqz v0, :cond_83

    .line 2921
    .line 2922
    new-instance v2, Lgf0;

    .line 2923
    .line 2924
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 2925
    .line 2926
    .line 2927
    new-instance v0, Lce1;

    .line 2928
    .line 2929
    invoke-direct {v0}, Lk;-><init>()V

    .line 2930
    .line 2931
    .line 2932
    invoke-virtual {v2, v0}, Lgf0;->a(Lk;)V

    .line 2933
    .line 2934
    .line 2935
    invoke-static {v0, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 2936
    .line 2937
    .line 2938
    :cond_83
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 2939
    .line 2940
    .line 2941
    return-void

    .line 2942
    :sswitch_20
    const-string v3, "trackConsentWithdrawn"

    .line 2943
    .line 2944
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2945
    .line 2946
    .line 2947
    move-result v2

    .line 2948
    if-nez v2, :cond_84

    .line 2949
    .line 2950
    goto/16 :goto_2a

    .line 2951
    .line 2952
    :cond_84
    invoke-static/range {p1 .. p2}, Lof2;->c(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 2953
    .line 2954
    .line 2955
    return-void

    .line 2956
    :sswitch_21
    const-string v3, "trackScrollChanged"

    .line 2957
    .line 2958
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2959
    .line 2960
    .line 2961
    move-result v2

    .line 2962
    if-nez v2, :cond_85

    .line 2963
    .line 2964
    goto/16 :goto_2a

    .line 2965
    .line 2966
    :cond_85
    invoke-static/range {p1 .. p2}, Lof2;->t(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 2967
    .line 2968
    .line 2969
    return-void

    .line 2970
    :sswitch_22
    const-string v3, "trackMediaSeekStartEvent"

    .line 2971
    .line 2972
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2973
    .line 2974
    .line 2975
    move-result v2

    .line 2976
    if-nez v2, :cond_86

    .line 2977
    .line 2978
    goto/16 :goto_2a

    .line 2979
    .line 2980
    :cond_86
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 2981
    .line 2982
    instance-of v2, v0, Ljava/util/Map;

    .line 2983
    .line 2984
    if-eqz v2, :cond_87

    .line 2985
    .line 2986
    check-cast v0, Ljava/util/Map;

    .line 2987
    .line 2988
    goto :goto_28

    .line 2989
    :cond_87
    move-object v0, v11

    .line 2990
    :goto_28
    if-eqz v0, :cond_88

    .line 2991
    .line 2992
    new-instance v2, Lgf0;

    .line 2993
    .line 2994
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 2995
    .line 2996
    .line 2997
    new-instance v0, Lof1;

    .line 2998
    .line 2999
    invoke-direct {v0}, Lk;-><init>()V

    .line 3000
    .line 3001
    .line 3002
    invoke-virtual {v2, v0}, Lgf0;->a(Lk;)V

    .line 3003
    .line 3004
    .line 3005
    invoke-static {v0, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 3006
    .line 3007
    .line 3008
    :cond_88
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 3009
    .line 3010
    .line 3011
    return-void

    .line 3012
    :sswitch_23
    const-string v3, "trackMediaFullscreenChangeEvent"

    .line 3013
    .line 3014
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3015
    .line 3016
    .line 3017
    move-result v2

    .line 3018
    if-nez v2, :cond_89

    .line 3019
    .line 3020
    goto/16 :goto_2a

    .line 3021
    .line 3022
    :cond_89
    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 3023
    .line 3024
    instance-of v2, v0, Ljava/util/Map;

    .line 3025
    .line 3026
    if-eqz v2, :cond_8a

    .line 3027
    .line 3028
    check-cast v0, Ljava/util/Map;

    .line 3029
    .line 3030
    goto :goto_29

    .line 3031
    :cond_8a
    move-object v0, v11

    .line 3032
    :goto_29
    if-eqz v0, :cond_8b

    .line 3033
    .line 3034
    new-instance v2, Lgf0;

    .line 3035
    .line 3036
    invoke-direct {v2, v0}, Lgf0;-><init>(Ljava/util/Map;)V

    .line 3037
    .line 3038
    .line 3039
    new-instance v0, Laf1;

    .line 3040
    .line 3041
    invoke-virtual {v2}, Lgf0;->b()Ljava/util/Map;

    .line 3042
    .line 3043
    .line 3044
    move-result-object v0

    .line 3045
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3046
    .line 3047
    .line 3048
    new-instance v3, Lze1;

    .line 3049
    .line 3050
    sget-object v4, Laf1;->a:[Lu21;

    .line 3051
    .line 3052
    aget-object v4, v4, v10

    .line 3053
    .line 3054
    invoke-interface {v4}, Ln21;->getName()Ljava/lang/String;

    .line 3055
    .line 3056
    .line 3057
    move-result-object v4

    .line 3058
    invoke-static {v0, v4}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3059
    .line 3060
    .line 3061
    move-result-object v0

    .line 3062
    check-cast v0, Ljava/lang/Boolean;

    .line 3063
    .line 3064
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3065
    .line 3066
    .line 3067
    move-result v0

    .line 3068
    invoke-direct {v3, v10}, Lze1;-><init>(I)V

    .line 3069
    .line 3070
    .line 3071
    iput-boolean v0, v3, Lze1;->c:Z

    .line 3072
    .line 3073
    invoke-virtual {v2, v3}, Lgf0;->a(Lk;)V

    .line 3074
    .line 3075
    .line 3076
    invoke-static {v3, v2}, Lhe3;->v(Lk;Lgf0;)V

    .line 3077
    .line 3078
    .line 3079
    :cond_8b
    invoke-interface {v1, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 3080
    .line 3081
    .line 3082
    return-void

    .line 3083
    :sswitch_24
    const-string v3, "trackMediaAdMidpointEvent"

    .line 3084
    .line 3085
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3086
    .line 3087
    .line 3088
    move-result v2

    .line 3089
    if-nez v2, :cond_8c

    .line 3090
    .line 3091
    goto/16 :goto_2a

    .line 3092
    .line 3093
    :cond_8c
    invoke-static/range {p1 .. p2}, Lof2;->h(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3094
    .line 3095
    .line 3096
    return-void

    .line 3097
    :sswitch_25
    const-string v3, "trackMediaReadyEvent"

    .line 3098
    .line 3099
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3100
    .line 3101
    .line 3102
    move-result v2

    .line 3103
    if-nez v2, :cond_8d

    .line 3104
    .line 3105
    goto/16 :goto_2a

    .line 3106
    .line 3107
    :cond_8d
    invoke-static/range {p1 .. p2}, Lof2;->r(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3108
    .line 3109
    .line 3110
    return-void

    .line 3111
    :sswitch_26
    const-string v3, "trackMediaAdSkipEvent"

    .line 3112
    .line 3113
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3114
    .line 3115
    .line 3116
    move-result v2

    .line 3117
    if-nez v2, :cond_8e

    .line 3118
    .line 3119
    goto/16 :goto_2a

    .line 3120
    .line 3121
    :cond_8e
    invoke-static/range {p1 .. p2}, Lof2;->j(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3122
    .line 3123
    .line 3124
    return-void

    .line 3125
    :sswitch_27
    const-string v3, "trackMediaAdPauseEvent"

    .line 3126
    .line 3127
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3128
    .line 3129
    .line 3130
    move-result v2

    .line 3131
    if-nez v2, :cond_8f

    .line 3132
    .line 3133
    goto/16 :goto_2a

    .line 3134
    .line 3135
    :cond_8f
    invoke-static/range {p1 .. p2}, Lof2;->i(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3136
    .line 3137
    .line 3138
    return-void

    .line 3139
    :sswitch_28
    const-string v3, "trackMediaPlaybackRateChangeEvent"

    .line 3140
    .line 3141
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3142
    .line 3143
    .line 3144
    move-result v2

    .line 3145
    if-nez v2, :cond_90

    .line 3146
    .line 3147
    goto/16 :goto_2a

    .line 3148
    .line 3149
    :cond_90
    invoke-static/range {p1 .. p2}, Lof2;->p(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3150
    .line 3151
    .line 3152
    return-void

    .line 3153
    :sswitch_29
    const-string v3, "trackMediaAdCompleteEvent"

    .line 3154
    .line 3155
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3156
    .line 3157
    .line 3158
    move-result v2

    .line 3159
    if-nez v2, :cond_91

    .line 3160
    .line 3161
    goto/16 :goto_2a

    .line 3162
    .line 3163
    :cond_91
    invoke-static/range {p1 .. p2}, Lof2;->g(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3164
    .line 3165
    .line 3166
    return-void

    .line 3167
    :sswitch_2a
    const-string v3, "trackMediaQualityChangeEvent"

    .line 3168
    .line 3169
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3170
    .line 3171
    .line 3172
    move-result v2

    .line 3173
    if-nez v2, :cond_92

    .line 3174
    .line 3175
    goto/16 :goto_2a

    .line 3176
    .line 3177
    :cond_92
    invoke-static/range {p1 .. p2}, Lof2;->q(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3178
    .line 3179
    .line 3180
    return-void

    .line 3181
    :sswitch_2b
    const-string v3, "trackMediaPauseEvent"

    .line 3182
    .line 3183
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3184
    .line 3185
    .line 3186
    move-result v2

    .line 3187
    if-nez v2, :cond_93

    .line 3188
    .line 3189
    goto/16 :goto_2a

    .line 3190
    .line 3191
    :cond_93
    invoke-static/range {p1 .. p2}, Lof2;->m(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3192
    .line 3193
    .line 3194
    return-void

    .line 3195
    :sswitch_2c
    const-string v3, "trackMediaBufferEndEvent"

    .line 3196
    .line 3197
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3198
    .line 3199
    .line 3200
    move-result v2

    .line 3201
    if-nez v2, :cond_94

    .line 3202
    .line 3203
    goto/16 :goto_2a

    .line 3204
    .line 3205
    :cond_94
    invoke-static/range {p1 .. p2}, Lof2;->l(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3206
    .line 3207
    .line 3208
    return-void

    .line 3209
    :sswitch_2d
    const-string v3, "trackMediaAdClickEvent"

    .line 3210
    .line 3211
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3212
    .line 3213
    .line 3214
    move-result v2

    .line 3215
    if-nez v2, :cond_95

    .line 3216
    .line 3217
    goto :goto_2a

    .line 3218
    :cond_95
    invoke-static/range {p1 .. p2}, Lof2;->f(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3219
    .line 3220
    .line 3221
    return-void

    .line 3222
    :sswitch_2e
    const-string v3, "trackMediaAdBreakStartEvent"

    .line 3223
    .line 3224
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3225
    .line 3226
    .line 3227
    move-result v2

    .line 3228
    if-nez v2, :cond_96

    .line 3229
    .line 3230
    goto :goto_2a

    .line 3231
    :cond_96
    invoke-static/range {p1 .. p2}, Lof2;->e(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3232
    .line 3233
    .line 3234
    return-void

    .line 3235
    :sswitch_2f
    const-string v3, "trackMediaPlayEvent"

    .line 3236
    .line 3237
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3238
    .line 3239
    .line 3240
    move-result v2

    .line 3241
    if-nez v2, :cond_97

    .line 3242
    .line 3243
    goto :goto_2a

    .line 3244
    :cond_97
    invoke-static/range {p1 .. p2}, Lof2;->o(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3245
    .line 3246
    .line 3247
    return-void

    .line 3248
    :sswitch_30
    const-string v3, "trackMediaVolumeChangeEvent"

    .line 3249
    .line 3250
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3251
    .line 3252
    .line 3253
    move-result v2

    .line 3254
    if-nez v2, :cond_98

    .line 3255
    .line 3256
    goto :goto_2a

    .line 3257
    :cond_98
    invoke-static/range {p1 .. p2}, Lof2;->s(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3258
    .line 3259
    .line 3260
    return-void

    .line 3261
    :sswitch_31
    const-string v3, "getSessionUserId"

    .line 3262
    .line 3263
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3264
    .line 3265
    .line 3266
    move-result v2

    .line 3267
    if-nez v2, :cond_99

    .line 3268
    .line 3269
    goto :goto_2a

    .line 3270
    :cond_99
    invoke-static/range {p1 .. p2}, Lof2;->b(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3271
    .line 3272
    .line 3273
    return-void

    .line 3274
    :sswitch_32
    const-string v3, "trackMediaPictureInPictureChangeEvent"

    .line 3275
    .line 3276
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3277
    .line 3278
    .line 3279
    move-result v2

    .line 3280
    if-nez v2, :cond_9a

    .line 3281
    .line 3282
    goto :goto_2a

    .line 3283
    :cond_9a
    invoke-static/range {p1 .. p2}, Lof2;->n(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3284
    .line 3285
    .line 3286
    return-void

    .line 3287
    :sswitch_33
    const-string v3, "trackListItemView"

    .line 3288
    .line 3289
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3290
    .line 3291
    .line 3292
    move-result v2

    .line 3293
    if-nez v2, :cond_9b

    .line 3294
    .line 3295
    goto :goto_2a

    .line 3296
    :cond_9b
    invoke-static/range {p1 .. p2}, Lof2;->d(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3297
    .line 3298
    .line 3299
    return-void

    .line 3300
    :sswitch_34
    const-string v3, "trackMediaAdStartEvent"

    .line 3301
    .line 3302
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3303
    .line 3304
    .line 3305
    move-result v2

    .line 3306
    if-nez v2, :cond_9c

    .line 3307
    .line 3308
    goto :goto_2a

    .line 3309
    :cond_9c
    invoke-static/range {p1 .. p2}, Lof2;->k(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 3310
    .line 3311
    .line 3312
    return-void

    .line 3313
    :cond_9d
    :goto_2a
    invoke-interface {v1}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 3314
    .line 3315
    .line 3316
    return-void

    .line 3317
    :sswitch_data_0
    .sparse-switch
        -0x6512c02c -> :sswitch_34
        -0x59d153ff -> :sswitch_33
        -0x5567600a -> :sswitch_32
        -0x47c26f3a -> :sswitch_31
        -0x466bbf09 -> :sswitch_30
        -0x38d0b993 -> :sswitch_2f
        -0x383f3945 -> :sswitch_2e
        -0x359cf992 -> :sswitch_2d
        -0x2ded5b68 -> :sswitch_2c
        -0x2c14f383 -> :sswitch_2b
        -0x2bd7047c -> :sswitch_2a
        -0xf96091b -> :sswitch_29
        -0xd916d6a -> :sswitch_28
        -0xa1e4540 -> :sswitch_27
        -0x8e55fa1 -> :sswitch_26
        -0x7646310 -> :sswitch_25
        0xfd95d36 -> :sswitch_24
        0xff20236 -> :sswitch_23
        0x1148c1a9 -> :sswitch_22
        0x1491339c -> :sswitch_21
        0x18937315 -> :sswitch_20
        0x209f4e83 -> :sswitch_1f
        0x23a7af9b -> :sswitch_1e
        0x26778548 -> :sswitch_1d
        0x2a16fd2c -> :sswitch_1c
        0x36d27652 -> :sswitch_1b
        0x38411bab -> :sswitch_1a
        0x3f1144dc -> :sswitch_19
        0x43a04971 -> :sswitch_18
        0x4581675f -> :sswitch_17
        0x4647fa9c -> :sswitch_a
        0x4be46975 -> :sswitch_9
        0x4e71e979 -> :sswitch_8
        0x520462a2 -> :sswitch_7
        0x56baeaf8 -> :sswitch_6
        0x62f96cfc -> :sswitch_5
        0x658a4110 -> :sswitch_4
        0x69ea7b6c -> :sswitch_3
        0x6cb51472 -> :sswitch_2
        0x74edf1a0 -> :sswitch_1
        0x7d466331 -> :sswitch_0
    .end sparse-switch

    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    :sswitch_data_1
    .sparse-switch
        0xdf3 -> :sswitch_11
        0xe82 -> :sswitch_10
        0x17a21 -> :sswitch_f
        0x1980e -> :sswitch_e
        0x1bdf7 -> :sswitch_d
        0x1cb54 -> :sswitch_c
        0x2eac04 -> :sswitch_b
    .end sparse-switch

    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    :sswitch_data_2
    .sparse-switch
        -0x5d8515ea -> :sswitch_16
        -0x5b07da61 -> :sswitch_15
        -0x4060aa65 -> :sswitch_14
        -0x21caeeee -> :sswitch_13
        0x45945ec4 -> :sswitch_12
    .end sparse-switch
.end method
