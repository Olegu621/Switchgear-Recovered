.class public final Lio/sentry/o3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/g2;


# instance fields
.field public U:D

.field public final V:Ljava/io/File;

.field public W:Ljava/lang/String;

.field public X:Lio/sentry/protocol/profiling/a;

.field public Y:Ljava/util/concurrent/ConcurrentHashMap;

.field public a:Lio/sentry/protocol/f;

.field public b:Lio/sentry/protocol/w;

.field public c:Lio/sentry/protocol/w;

.field public d:Lio/sentry/protocol/u;

.field public final e:Ljava/util/Map;

.field public f:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public v:Ljava/lang/String;

.field public w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/sentry/protocol/w;Lio/sentry/protocol/w;Ljava/io/File;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/String;Lio/sentry/m6;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lio/sentry/o3;->W:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p1, p0, Lio/sentry/o3;->b:Lio/sentry/protocol/w;

    .line 8
    .line 9
    iput-object p2, p0, Lio/sentry/o3;->c:Lio/sentry/protocol/w;

    .line 10
    .line 11
    iput-object p3, p0, Lio/sentry/o3;->V:Ljava/io/File;

    .line 12
    .line 13
    iput-object p4, p0, Lio/sentry/o3;->e:Ljava/util/Map;

    .line 14
    .line 15
    iput-object v0, p0, Lio/sentry/o3;->a:Lio/sentry/protocol/f;

    .line 16
    .line 17
    invoke-virtual {p7}, Lio/sentry/m6;->getSdkVersion()Lio/sentry/protocol/u;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lio/sentry/o3;->d:Lio/sentry/protocol/u;

    .line 22
    .line 23
    invoke-virtual {p7}, Lio/sentry/m6;->getRelease()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p7}, Lio/sentry/m6;->getRelease()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string p1, ""

    .line 35
    .line 36
    :goto_0
    iput-object p1, p0, Lio/sentry/o3;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p7}, Lio/sentry/m6;->getEnvironment()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lio/sentry/o3;->v:Ljava/lang/String;

    .line 43
    .line 44
    iput-object p6, p0, Lio/sentry/o3;->f:Ljava/lang/String;

    .line 45
    .line 46
    const-string p1, "2"

    .line 47
    .line 48
    iput-object p1, p0, Lio/sentry/o3;->w:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p5}, Ljava/lang/Double;->doubleValue()D

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    iput-wide p1, p0, Lio/sentry/o3;->U:D

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lio/sentry/o3;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lio/sentry/o3;

    .line 12
    .line 13
    iget-object v0, p0, Lio/sentry/o3;->a:Lio/sentry/protocol/f;

    .line 14
    .line 15
    iget-object v1, p1, Lio/sentry/o3;->a:Lio/sentry/protocol/f;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    iget-object v0, p0, Lio/sentry/o3;->b:Lio/sentry/protocol/w;

    .line 21
    .line 22
    iget-object v1, p1, Lio/sentry/o3;->b:Lio/sentry/protocol/w;

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    iget-object v0, p0, Lio/sentry/o3;->c:Lio/sentry/protocol/w;

    .line 31
    .line 32
    iget-object v1, p1, Lio/sentry/o3;->c:Lio/sentry/protocol/w;

    .line 33
    .line 34
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    iget-object v0, p0, Lio/sentry/o3;->d:Lio/sentry/protocol/u;

    .line 41
    .line 42
    iget-object v1, p1, Lio/sentry/o3;->d:Lio/sentry/protocol/u;

    .line 43
    .line 44
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    iget-object v0, p0, Lio/sentry/o3;->e:Ljava/util/Map;

    .line 51
    .line 52
    iget-object v1, p1, Lio/sentry/o3;->e:Ljava/util/Map;

    .line 53
    .line 54
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object v0, p0, Lio/sentry/o3;->f:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v1, p1, Lio/sentry/o3;->f:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    iget-object v0, p0, Lio/sentry/o3;->i:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v1, p1, Lio/sentry/o3;->i:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object v0, p0, Lio/sentry/o3;->v:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v1, p1, Lio/sentry/o3;->v:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    iget-object v0, p0, Lio/sentry/o3;->w:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v1, p1, Lio/sentry/o3;->w:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    iget-object v0, p0, Lio/sentry/o3;->W:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v1, p1, Lio/sentry/o3;->W:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    iget-object v0, p0, Lio/sentry/o3;->Y:Ljava/util/concurrent/ConcurrentHashMap;

    .line 111
    .line 112
    iget-object v1, p1, Lio/sentry/o3;->Y:Ljava/util/concurrent/ConcurrentHashMap;

    .line 113
    .line 114
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_4

    .line 119
    .line 120
    iget-object p0, p0, Lio/sentry/o3;->X:Lio/sentry/protocol/profiling/a;

    .line 121
    .line 122
    iget-object p1, p1, Lio/sentry/o3;->X:Lio/sentry/protocol/profiling/a;

    .line 123
    .line 124
    if-eq p0, p1, :cond_3

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 128
    return p0

    .line 129
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 130
    return p0
.end method

.method public final hashCode()I
    .locals 12

    .line 1
    iget-object v0, p0, Lio/sentry/o3;->a:Lio/sentry/protocol/f;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/o3;->b:Lio/sentry/protocol/w;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/o3;->c:Lio/sentry/protocol/w;

    .line 6
    .line 7
    iget-object v3, p0, Lio/sentry/o3;->d:Lio/sentry/protocol/u;

    .line 8
    .line 9
    iget-object v5, p0, Lio/sentry/o3;->f:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, p0, Lio/sentry/o3;->i:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v7, p0, Lio/sentry/o3;->v:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v8, p0, Lio/sentry/o3;->w:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v9, p0, Lio/sentry/o3;->W:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v10, p0, Lio/sentry/o3;->X:Lio/sentry/protocol/profiling/a;

    .line 20
    .line 21
    iget-object v11, p0, Lio/sentry/o3;->Y:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    iget-object v4, p0, Lio/sentry/o3;->e:Ljava/util/Map;

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public final serialize(Lio/sentry/j3;Lio/sentry/ILogger;)V
    .locals 3

    .line 1
    check-cast p1, Lio/sentry/internal/debugmeta/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->i()Lio/sentry/internal/debugmeta/c;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/o3;->a:Lio/sentry/protocol/f;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "debug_meta"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lio/sentry/o3;->a:Lio/sentry/protocol/f;

    .line 16
    .line 17
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 18
    .line 19
    .line 20
    :cond_0
    const-string v0, "profiler_id"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lio/sentry/o3;->b:Lio/sentry/protocol/w;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 28
    .line 29
    .line 30
    const-string v0, "chunk_id"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lio/sentry/o3;->c:Lio/sentry/protocol/w;

    .line 36
    .line 37
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lio/sentry/o3;->d:Lio/sentry/protocol/u;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    const-string v0, "client_sdk"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lio/sentry/o3;->d:Lio/sentry/protocol/u;

    .line 50
    .line 51
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object v0, p0, Lio/sentry/o3;->e:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    iget-object v1, p1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lio/sentry/vendor/gson/stream/c;

    .line 65
    .line 66
    iget-object v1, v1, Lio/sentry/vendor/gson/stream/c;->d:Ljava/lang/String;

    .line 67
    .line 68
    const-string v2, ""

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Lio/sentry/internal/debugmeta/c;->s(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v2, "measurements"

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->s(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    const-string v0, "platform"

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lio/sentry/o3;->f:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 92
    .line 93
    .line 94
    const-string v0, "release"

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lio/sentry/o3;->i:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lio/sentry/o3;->v:Ljava/lang/String;

    .line 105
    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    const-string v0, "environment"

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lio/sentry/o3;->v:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 116
    .line 117
    .line 118
    :cond_3
    const-string v0, "version"

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lio/sentry/o3;->w:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lio/sentry/o3;->W:Ljava/lang/String;

    .line 129
    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    const-string v0, "sampled_profile"

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lio/sentry/o3;->W:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 140
    .line 141
    .line 142
    :cond_4
    const-string v0, "timestamp"

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 145
    .line 146
    .line 147
    iget-wide v0, p0, Lio/sentry/o3;->U:D

    .line 148
    .line 149
    invoke-static {v0, v1}, Lio/sentry/config/a;->g(D)Ljava/math/BigDecimal;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lio/sentry/o3;->X:Lio/sentry/protocol/profiling/a;

    .line 157
    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    const-string v0, "profile"

    .line 161
    .line 162
    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lio/sentry/o3;->X:Lio/sentry/protocol/profiling/a;

    .line 166
    .line 167
    invoke-virtual {p1, p2, v0}, Lio/sentry/internal/debugmeta/c;->v(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    .line 168
    .line 169
    .line 170
    :cond_5
    iget-object v0, p0, Lio/sentry/o3;->Y:Ljava/util/concurrent/ConcurrentHashMap;

    .line 171
    .line 172
    if-eqz v0, :cond_6

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_6

    .line 187
    .line 188
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, Ljava/lang/String;

    .line 193
    .line 194
    iget-object v2, p0, Lio/sentry/o3;->Y:Ljava/util/concurrent/ConcurrentHashMap;

    .line 195
    .line 196
    invoke-static {v2, v1, p1, v1, p2}, Lcom/appsflyer/internal/j;->d(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lio/sentry/internal/debugmeta/c;Ljava/lang/String;Lio/sentry/ILogger;)V

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_6
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->l()Lio/sentry/internal/debugmeta/c;

    .line 201
    .line 202
    .line 203
    return-void
.end method
