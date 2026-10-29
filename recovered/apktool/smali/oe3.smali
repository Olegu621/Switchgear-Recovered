.class public final Loe3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:J

.field public final f:Lcom/google/android/gms/measurement/internal/zzbe;


# direct methods
.method public constructor <init>(Lij3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Lkb1;->k(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p4}, Lkb1;->k(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object p3, p0, Loe3;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p4, p0, Loe3;->b:Ljava/lang/String;

    .line 13
    .line 14
    const/4 p4, 0x1

    .line 15
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne p4, v0, :cond_0

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    :cond_0
    iput-object p2, p0, Loe3;->c:Ljava/lang/String;

    .line 23
    .line 24
    iput-wide p5, p0, Loe3;->d:J

    .line 25
    .line 26
    iput-wide p7, p0, Loe3;->e:J

    .line 27
    .line 28
    const-wide/16 v0, 0x0

    .line 29
    .line 30
    cmp-long p2, p7, v0

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    cmp-long p2, p7, p5

    .line 35
    .line 36
    if-lez p2, :cond_1

    .line 37
    .line 38
    iget-object p2, p1, Lij3;->f:Luh3;

    .line 39
    .line 40
    invoke-static {p2}, Lij3;->l(Lhk3;)V

    .line 41
    .line 42
    .line 43
    iget-object p2, p2, Luh3;->w:Lsh3;

    .line 44
    .line 45
    invoke-static {p3}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    const-string p4, "Event created with reverse previous/current timestamps. appId"

    .line 50
    .line 51
    invoke-virtual {p2, p3, p4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    if-eqz p9, :cond_5

    .line 55
    .line 56
    invoke-virtual {p9}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-nez p2, :cond_5

    .line 61
    .line 62
    new-instance p2, Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-direct {p2, p9}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result p4

    .line 79
    if-eqz p4, :cond_4

    .line 80
    .line 81
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    check-cast p4, Ljava/lang/String;

    .line 86
    .line 87
    if-nez p4, :cond_2

    .line 88
    .line 89
    iget-object p4, p1, Lij3;->f:Luh3;

    .line 90
    .line 91
    invoke-static {p4}, Lij3;->l(Lhk3;)V

    .line 92
    .line 93
    .line 94
    iget-object p4, p4, Luh3;->f:Lsh3;

    .line 95
    .line 96
    const-string p5, "Param name can\'t be null"

    .line 97
    .line 98
    invoke-virtual {p4, p5}, Lsh3;->a(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    iget-object p5, p1, Lij3;->w:Lup3;

    .line 106
    .line 107
    invoke-static {p5}, Lij3;->j(Lsq3;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, p4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p6

    .line 114
    invoke-virtual {p5, p6, p4}, Lup3;->G(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p5

    .line 118
    if-nez p5, :cond_3

    .line 119
    .line 120
    iget-object p5, p1, Lij3;->f:Luh3;

    .line 121
    .line 122
    invoke-static {p5}, Lij3;->l(Lhk3;)V

    .line 123
    .line 124
    .line 125
    iget-object p5, p5, Luh3;->w:Lsh3;

    .line 126
    .line 127
    iget-object p6, p1, Lij3;->U:Lmh3;

    .line 128
    .line 129
    invoke-virtual {p6, p4}, Lmh3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p4

    .line 133
    const-string p6, "Param value can\'t be null"

    .line 134
    .line 135
    invoke-virtual {p5, p4, p6}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_3
    iget-object p6, p1, Lij3;->w:Lup3;

    .line 143
    .line 144
    invoke-static {p6}, Lij3;->j(Lsq3;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p6, p5, p4, p2}, Lup3;->O(Ljava/lang/Object;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_4
    new-instance p1, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 152
    .line 153
    invoke-direct {p1, p2}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_5
    new-instance p1, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 158
    .line 159
    new-instance p2, Landroid/os/Bundle;

    .line 160
    .line 161
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-direct {p1, p2}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    .line 165
    .line 166
    .line 167
    :goto_1
    iput-object p1, p0, Loe3;->f:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 168
    .line 169
    return-void
.end method

.method public constructor <init>(Lij3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/google/android/gms/measurement/internal/zzbe;)V
    .locals 2

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, Lkb1;->k(Ljava/lang/String;)V

    .line 171
    invoke-static {p4}, Lkb1;->k(Ljava/lang/String;)V

    .line 172
    invoke-static {p9}, Lkb1;->n(Ljava/lang/Object;)V

    iput-object p3, p0, Loe3;->a:Ljava/lang/String;

    iput-object p4, p0, Loe3;->b:Ljava/lang/String;

    const/4 v0, 0x1

    .line 173
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, Loe3;->c:Ljava/lang/String;

    iput-wide p5, p0, Loe3;->d:J

    iput-wide p7, p0, Loe3;->e:J

    const-wide/16 v0, 0x0

    cmp-long p2, p7, v0

    if-eqz p2, :cond_1

    cmp-long p2, p7, p5

    if-lez p2, :cond_1

    .line 174
    iget-object p1, p1, Lij3;->f:Luh3;

    .line 175
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 176
    iget-object p1, p1, Luh3;->w:Lsh3;

    .line 177
    invoke-static {p3}, Luh3;->H(Ljava/lang/String;)Lth3;

    move-result-object p2

    invoke-static {p4}, Luh3;->H(Ljava/lang/String;)Lth3;

    move-result-object p3

    const-string p4, "Event created with reverse previous/current timestamps. appId, name"

    .line 178
    invoke-virtual {p1, p2, p4, p3}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    iput-object p9, p0, Loe3;->f:Lcom/google/android/gms/measurement/internal/zzbe;

    return-void
.end method


# virtual methods
.method public final a(Lij3;J)Loe3;
    .locals 10

    .line 1
    new-instance v0, Loe3;

    .line 2
    .line 3
    iget-object v2, p0, Loe3;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, Loe3;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, p0, Loe3;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-wide v5, p0, Loe3;->d:J

    .line 10
    .line 11
    iget-object v9, p0, Loe3;->f:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 12
    .line 13
    move-object v1, p1

    .line 14
    move-wide v7, p2

    .line 15
    invoke-direct/range {v0 .. v9}, Loe3;-><init>(Lij3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/google/android/gms/measurement/internal/zzbe;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Loe3;->f:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbe;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Loe3;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object p0, p0, Loe3;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    add-int/lit8 v2, v2, 0x16

    .line 32
    .line 33
    add-int/2addr v2, v3

    .line 34
    add-int/lit8 v2, v2, 0xa

    .line 35
    .line 36
    add-int/2addr v2, v4

    .line 37
    new-instance v3, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const-string v2, "Event{appId=\'"

    .line 45
    .line 46
    const-string v4, "\', name=\'"

    .line 47
    .line 48
    invoke-static {v3, v2, v1, v4, p0}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string p0, "\', params="

    .line 52
    .line 53
    const-string v1, "}"

    .line 54
    .line 55
    invoke-static {v3, p0, v0, v1}, Lfm0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method
