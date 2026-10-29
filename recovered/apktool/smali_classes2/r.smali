.class public Lr;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/Iterator;
.implements Lr21;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p2, p0, Lr;->a:I

    iput-object p1, p0, Lr;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlinx/serialization/internal/EnumDescriptor;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lr;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lr;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget p1, p1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->c:I

    .line 10
    .line 11
    iput p1, p0, Lr;->b:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lu13;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lr;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lr;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 17
    iput p1, p0, Lr;->b:I

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lr;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    .line 1
    iget v0, p0, Lr;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lr;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget p0, p0, Lr;->b:I

    .line 11
    .line 12
    check-cast v1, Lu13;

    .line 13
    .line 14
    iget v0, v1, Lu13;->b:I

    .line 15
    .line 16
    if-gt p0, v0, :cond_0

    .line 17
    .line 18
    move v2, v3

    .line 19
    :cond_0
    return v2

    .line 20
    :pswitch_0
    iget p0, p0, Lr;->b:I

    .line 21
    .line 22
    check-cast v1, [S

    .line 23
    .line 24
    array-length v0, v1

    .line 25
    if-ge p0, v0, :cond_1

    .line 26
    .line 27
    move v2, v3

    .line 28
    :cond_1
    return v2

    .line 29
    :pswitch_1
    iget p0, p0, Lr;->b:I

    .line 30
    .line 31
    check-cast v1, [J

    .line 32
    .line 33
    array-length v0, v1

    .line 34
    if-ge p0, v0, :cond_2

    .line 35
    .line 36
    move v2, v3

    .line 37
    :cond_2
    return v2

    .line 38
    :pswitch_2
    iget p0, p0, Lr;->b:I

    .line 39
    .line 40
    check-cast v1, [I

    .line 41
    .line 42
    array-length v0, v1

    .line 43
    if-ge p0, v0, :cond_3

    .line 44
    .line 45
    move v2, v3

    .line 46
    :cond_3
    return v2

    .line 47
    :pswitch_3
    iget p0, p0, Lr;->b:I

    .line 48
    .line 49
    check-cast v1, [B

    .line 50
    .line 51
    array-length v0, v1

    .line 52
    if-ge p0, v0, :cond_4

    .line 53
    .line 54
    move v2, v3

    .line 55
    :cond_4
    return v2

    .line 56
    :pswitch_4
    iget p0, p0, Lr;->b:I

    .line 57
    .line 58
    if-lez p0, :cond_5

    .line 59
    .line 60
    move v2, v3

    .line 61
    :cond_5
    return v2

    .line 62
    :pswitch_5
    iget p0, p0, Lr;->b:I

    .line 63
    .line 64
    check-cast v1, [Ljava/lang/Object;

    .line 65
    .line 66
    array-length v0, v1

    .line 67
    if-ge p0, v0, :cond_6

    .line 68
    .line 69
    move v2, v3

    .line 70
    :cond_6
    return v2

    .line 71
    :pswitch_6
    iget p0, p0, Lr;->b:I

    .line 72
    .line 73
    check-cast v1, Lu;

    .line 74
    .line 75
    invoke-virtual {v1}, Lg;->size()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-ge p0, v0, :cond_7

    .line 80
    .line 81
    move v2, v3

    .line 82
    :cond_7
    return v2

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lr;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lr;->c:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lr;->b:I

    .line 9
    .line 10
    add-int/lit8 v2, v0, 0x1

    .line 11
    .line 12
    iput v2, p0, Lr;->b:I

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast v1, Lu13;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lu13;->a(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lkotlin/Pair;

    .line 29
    .line 30
    invoke-direct {v1, p0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    iget v0, p0, Lr;->b:I

    .line 35
    .line 36
    check-cast v1, [S

    .line 37
    .line 38
    array-length v2, v1

    .line 39
    if-ge v0, v2, :cond_0

    .line 40
    .line 41
    add-int/lit8 v2, v0, 0x1

    .line 42
    .line 43
    iput v2, p0, Lr;->b:I

    .line 44
    .line 45
    aget-short p0, v1, v0

    .line 46
    .line 47
    new-instance v0, Lax2;

    .line 48
    .line 49
    invoke-direct {v0, p0}, Lax2;-><init>(S)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 54
    .line 55
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :pswitch_1
    iget v0, p0, Lr;->b:I

    .line 64
    .line 65
    check-cast v1, [J

    .line 66
    .line 67
    array-length v2, v1

    .line 68
    if-ge v0, v2, :cond_1

    .line 69
    .line 70
    add-int/lit8 v2, v0, 0x1

    .line 71
    .line 72
    iput v2, p0, Lr;->b:I

    .line 73
    .line 74
    aget-wide v0, v1, v0

    .line 75
    .line 76
    new-instance p0, Lsw2;

    .line 77
    .line 78
    invoke-direct {p0, v0, v1}, Lsw2;-><init>(J)V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p0

    .line 92
    :pswitch_2
    iget v0, p0, Lr;->b:I

    .line 93
    .line 94
    check-cast v1, [I

    .line 95
    .line 96
    array-length v2, v1

    .line 97
    if-ge v0, v2, :cond_2

    .line 98
    .line 99
    add-int/lit8 v2, v0, 0x1

    .line 100
    .line 101
    iput v2, p0, Lr;->b:I

    .line 102
    .line 103
    aget p0, v1, v0

    .line 104
    .line 105
    new-instance v0, Lmw2;

    .line 106
    .line 107
    invoke-direct {v0, p0}, Lmw2;-><init>(I)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 112
    .line 113
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :pswitch_3
    iget v0, p0, Lr;->b:I

    .line 122
    .line 123
    check-cast v1, [B

    .line 124
    .line 125
    array-length v2, v1

    .line 126
    if-ge v0, v2, :cond_3

    .line 127
    .line 128
    add-int/lit8 v2, v0, 0x1

    .line 129
    .line 130
    iput v2, p0, Lr;->b:I

    .line 131
    .line 132
    aget-byte p0, v1, v0

    .line 133
    .line 134
    new-instance v0, Lts2;

    .line 135
    .line 136
    invoke-direct {v0, p0}, Lts2;-><init>(B)V

    .line 137
    .line 138
    .line 139
    return-object v0

    .line 140
    :cond_3
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 141
    .line 142
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p0

    .line 150
    :pswitch_4
    check-cast v1, Lkotlinx/serialization/internal/EnumDescriptor;

    .line 151
    .line 152
    iget v0, v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->c:I

    .line 153
    .line 154
    iget v2, p0, Lr;->b:I

    .line 155
    .line 156
    add-int/lit8 v3, v2, -0x1

    .line 157
    .line 158
    iput v3, p0, Lr;->b:I

    .line 159
    .line 160
    sub-int/2addr v0, v2

    .line 161
    iget-object p0, v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->e:[Ljava/lang/String;

    .line 162
    .line 163
    aget-object p0, p0, v0

    .line 164
    .line 165
    return-object p0

    .line 166
    :pswitch_5
    :try_start_0
    check-cast v1, [Ljava/lang/Object;

    .line 167
    .line 168
    iget v0, p0, Lr;->b:I

    .line 169
    .line 170
    add-int/lit8 v2, v0, 0x1

    .line 171
    .line 172
    iput v2, p0, Lr;->b:I

    .line 173
    .line 174
    aget-object p0, v1, v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .line 176
    return-object p0

    .line 177
    :catch_0
    move-exception v0

    .line 178
    iget v1, p0, Lr;->b:I

    .line 179
    .line 180
    add-int/lit8 v1, v1, -0x1

    .line 181
    .line 182
    iput v1, p0, Lr;->b:I

    .line 183
    .line 184
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p0

    .line 194
    :pswitch_6
    invoke-virtual {p0}, Lr;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_4

    .line 199
    .line 200
    check-cast v1, Lu;

    .line 201
    .line 202
    iget v0, p0, Lr;->b:I

    .line 203
    .line 204
    add-int/lit8 v2, v0, 0x1

    .line 205
    .line 206
    iput v2, p0, Lr;->b:I

    .line 207
    .line 208
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    goto :goto_0

    .line 213
    :cond_4
    invoke-static {}, Ln4;->o()V

    .line 214
    .line 215
    .line 216
    const/4 p0, 0x0

    .line 217
    :goto_0
    return-object p0

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget p0, p0, Lr;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v0, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v0, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :pswitch_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string v0, "Operation is not supported for read-only collection"

    .line 25
    .line 26
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :pswitch_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 31
    .line 32
    const-string v0, "Operation is not supported for read-only collection"

    .line 33
    .line 34
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p0

    .line 38
    :pswitch_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 39
    .line 40
    const-string v0, "Operation is not supported for read-only collection"

    .line 41
    .line 42
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0

    .line 46
    :pswitch_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 47
    .line 48
    const-string v0, "Operation is not supported for read-only collection"

    .line 49
    .line 50
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :pswitch_5
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 55
    .line 56
    const-string v0, "Operation is not supported for read-only collection"

    .line 57
    .line 58
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :pswitch_6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 63
    .line 64
    const-string v0, "Operation is not supported for read-only collection"

    .line 65
    .line 66
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
