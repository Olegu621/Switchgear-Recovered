.class public final Lcom/quago/mobile/sdk/x;
.super Lcom/quago/mobile/sdk/j;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public b:J

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/quago/mobile/sdk/j;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Lcom/quago/mobile/sdk/j;
    .locals 1

    .line 57
    new-instance v0, Lcom/quago/mobile/sdk/x;

    invoke-direct {v0}, Lcom/quago/mobile/sdk/x;-><init>()V

    .line 58
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/x;->a(Lcom/quago/mobile/sdk/j;)V

    return-object v0
.end method

.method public final a(Lcom/quago/mobile/sdk/j;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/quago/mobile/sdk/x;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p1, Lcom/quago/mobile/sdk/x;

    .line 7
    .line 8
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 9
    .line 10
    iput-wide v0, p1, Lcom/quago/mobile/sdk/j;->a:J

    .line 11
    .line 12
    iget-wide v0, p0, Lcom/quago/mobile/sdk/x;->b:J

    .line 13
    .line 14
    iput-wide v0, p1, Lcom/quago/mobile/sdk/x;->b:J

    .line 15
    .line 16
    iget v0, p0, Lcom/quago/mobile/sdk/x;->h:I

    .line 17
    .line 18
    iput v0, p1, Lcom/quago/mobile/sdk/x;->h:I

    .line 19
    .line 20
    iget v0, p0, Lcom/quago/mobile/sdk/x;->c:F

    .line 21
    .line 22
    iput v0, p1, Lcom/quago/mobile/sdk/x;->c:F

    .line 23
    .line 24
    iget v0, p0, Lcom/quago/mobile/sdk/x;->d:F

    .line 25
    .line 26
    iput v0, p1, Lcom/quago/mobile/sdk/x;->d:F

    .line 27
    .line 28
    iget v0, p0, Lcom/quago/mobile/sdk/x;->e:F

    .line 29
    .line 30
    iput v0, p1, Lcom/quago/mobile/sdk/x;->e:F

    .line 31
    .line 32
    iget v0, p0, Lcom/quago/mobile/sdk/x;->f:F

    .line 33
    .line 34
    iput v0, p1, Lcom/quago/mobile/sdk/x;->f:F

    .line 35
    .line 36
    iget v0, p0, Lcom/quago/mobile/sdk/x;->g:F

    .line 37
    .line 38
    iput v0, p1, Lcom/quago/mobile/sdk/x;->g:F

    .line 39
    .line 40
    iget v0, p0, Lcom/quago/mobile/sdk/x;->i:I

    .line 41
    .line 42
    iput v0, p1, Lcom/quago/mobile/sdk/x;->i:I

    .line 43
    .line 44
    iget v0, p0, Lcom/quago/mobile/sdk/x;->j:I

    .line 45
    .line 46
    iput v0, p1, Lcom/quago/mobile/sdk/x;->j:I

    .line 47
    .line 48
    iget v0, p0, Lcom/quago/mobile/sdk/x;->k:I

    .line 49
    .line 50
    iput v0, p1, Lcom/quago/mobile/sdk/x;->k:I

    .line 51
    .line 52
    iget p0, p0, Lcom/quago/mobile/sdk/x;->l:I

    .line 53
    .line 54
    iput p0, p1, Lcom/quago/mobile/sdk/x;->l:I

    .line 55
    .line 56
    return-void
.end method

.method public final b(Lcom/quago/mobile/sdk/j;)Z
    .locals 6

    .line 132
    instance-of v0, p1, Lcom/quago/mobile/sdk/x;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 133
    :cond_0
    check-cast p1, Lcom/quago/mobile/sdk/x;

    .line 134
    iget v0, p0, Lcom/quago/mobile/sdk/x;->h:I

    iget v2, p1, Lcom/quago/mobile/sdk/x;->h:I

    if-ne v0, v2, :cond_1

    iget-wide v2, p0, Lcom/quago/mobile/sdk/x;->b:J

    iget-wide v4, p1, Lcom/quago/mobile/sdk/x;->b:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/x;->c:F

    iget v2, p1, Lcom/quago/mobile/sdk/x;->c:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/x;->d:F

    iget v2, p1, Lcom/quago/mobile/sdk/x;->d:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/x;->e:F

    iget v2, p1, Lcom/quago/mobile/sdk/x;->e:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/x;->f:F

    iget v2, p1, Lcom/quago/mobile/sdk/x;->f:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/x;->g:F

    iget v2, p1, Lcom/quago/mobile/sdk/x;->g:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/x;->i:I

    iget v2, p1, Lcom/quago/mobile/sdk/x;->i:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/x;->j:I

    iget v2, p1, Lcom/quago/mobile/sdk/x;->j:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/x;->k:I

    iget v2, p1, Lcom/quago/mobile/sdk/x;->k:I

    if-ne v0, v2, :cond_1

    iget p0, p0, Lcom/quago/mobile/sdk/x;->l:I

    iget p1, p1, Lcom/quago/mobile/sdk/x;->l:I

    if-ne p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method public final b()[Ljava/lang/Double;
    .locals 11

    .line 1
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Long;->doubleValue()D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-wide v0, p0, Lcom/quago/mobile/sdk/x;->b:J

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Long;->doubleValue()D

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget v0, p0, Lcom/quago/mobile/sdk/x;->h:I

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Integer;->doubleValue()D

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget v0, p0, Lcom/quago/mobile/sdk/x;->c:F

    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iget v0, p0, Lcom/quago/mobile/sdk/x;->d:F

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget v0, p0, Lcom/quago/mobile/sdk/x;->e:F

    .line 72
    .line 73
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    iget v0, p0, Lcom/quago/mobile/sdk/x;->f:F

    .line 86
    .line 87
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    iget v0, p0, Lcom/quago/mobile/sdk/x;->g:F

    .line 100
    .line 101
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    iget p0, p0, Lcom/quago/mobile/sdk/x;->i:I

    .line 114
    .line 115
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, Ljava/lang/Integer;->doubleValue()D

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    filled-new-array/range {v2 .. v10}, [Ljava/lang/Double;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/quago/mobile/sdk/x;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/quago/mobile/sdk/x;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/x;->a(Lcom/quago/mobile/sdk/j;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    .line 1
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/quago/mobile/sdk/x;->b:J

    .line 4
    .line 5
    iget v4, p0, Lcom/quago/mobile/sdk/x;->h:I

    .line 6
    .line 7
    sget-object v5, Lcom/quago/mobile/sdk/f;->e:Ljava/util/Map;

    .line 8
    .line 9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lcom/quago/mobile/sdk/f;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_4

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    if-eq v4, v5, :cond_3

    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    if-eq v4, v5, :cond_2

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    if-eq v4, v5, :cond_1

    .line 33
    .line 34
    const/4 v5, 0x4

    .line 35
    if-eq v4, v5, :cond_0

    .line 36
    .line 37
    const-string v4, "?"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string v4, "\u2191"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const-string v4, "\u2197"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const-string v4, "\u221e"

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    const-string v4, "\u2198"

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    const-string v4, "\u2193"

    .line 53
    .line 54
    :goto_0
    iget v5, p0, Lcom/quago/mobile/sdk/x;->c:F

    .line 55
    .line 56
    iget v6, p0, Lcom/quago/mobile/sdk/x;->d:F

    .line 57
    .line 58
    iget v7, p0, Lcom/quago/mobile/sdk/x;->e:F

    .line 59
    .line 60
    iget v8, p0, Lcom/quago/mobile/sdk/x;->f:F

    .line 61
    .line 62
    iget v9, p0, Lcom/quago/mobile/sdk/x;->g:F

    .line 63
    .line 64
    iget v10, p0, Lcom/quago/mobile/sdk/x;->i:I

    .line 65
    .line 66
    iget v11, p0, Lcom/quago/mobile/sdk/x;->j:I

    .line 67
    .line 68
    iget v12, p0, Lcom/quago/mobile/sdk/x;->k:I

    .line 69
    .line 70
    iget p0, p0, Lcom/quago/mobile/sdk/x;->l:I

    .line 71
    .line 72
    new-instance v13, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v14, "["

    .line 75
    .line 76
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v13, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v0, ", "

    .line 83
    .line 84
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v13, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v13, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string p0, "]"

    .line 151
    .line 152
    invoke-virtual {v13, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0
.end method
