.class public final Lcom/usercentrics/sdk/ui/components/UCImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B%\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lcom/usercentrics/sdk/ui/components/UCImageView;",
        "Landroidx/appcompat/widget/AppCompatImageView;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "",
        "imageUrl",
        "",
        "setImageUrl",
        "(Ljava/lang/String;)V",
        "Lyz2;",
        "image",
        "setImage",
        "(Lyz2;)V",
        "Lfv2;",
        "a",
        "Lp51;",
        "getRemoteImageService",
        "()Lfv2;",
        "remoteImageService",
        "Li03;",
        "b",
        "getLogger",
        "()Li03;",
        "logger",
        "Lxu2;",
        "cornerSettings",
        "Lxu2;",
        "getCornerSettings",
        "()Lxu2;",
        "setCornerSettings",
        "(Lxu2;)V",
        "usercentrics-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lhk2;

.field public final b:Lhk2;

.field public c:Lig2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, p2, v0}, Lcom/usercentrics/sdk/ui/components/UCImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    sget-object p1, Lyh;->j0:Lyh;

    .line 8
    .line 9
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lcom/usercentrics/sdk/ui/components/UCImageView;->a:Lhk2;

    .line 14
    .line 15
    sget-object p1, Lyh;->i0:Lyh;

    .line 16
    .line 17
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/usercentrics/sdk/ui/components/UCImageView;->b:Lhk2;

    .line 22
    .line 23
    return-void
.end method

.method public static final synthetic c(Lcom/usercentrics/sdk/ui/components/UCImageView;)Lfv2;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCImageView;->getRemoteImageService()Lfv2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final d(Lcom/usercentrics/sdk/ui/components/UCImageView;Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lzu2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lzu2;

    .line 7
    .line 8
    iget v1, v0, Lzu2;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lzu2;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzu2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lzu2;-><init>(Lcom/usercentrics/sdk/ui/components/UCImageView;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lzu2;->e:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lzu2;->i:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v5, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, Lzu2;->d:Ljava/lang/Throwable;

    .line 44
    .line 45
    iget-object p1, v0, Lzu2;->c:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v1, v0, Lzu2;->b:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v0, v0, Lzu2;->a:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 50
    .line 51
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_7

    .line 55
    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v6

    .line 62
    :cond_2
    iget-object p1, v0, Lzu2;->b:Ljava/lang/String;

    .line 63
    .line 64
    iget-object p0, v0, Lzu2;->a:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 65
    .line 66
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :catchall_0
    move-exception p2

    .line 71
    goto :goto_5

    .line 72
    :cond_3
    iget-object p0, v0, Lzu2;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 75
    .line 76
    iget-object p1, v0, Lzu2;->b:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v2, v0, Lzu2;->a:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 79
    .line 80
    :try_start_1
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catchall_1
    move-exception p2

    .line 85
    :goto_1
    move-object p0, v2

    .line 86
    goto :goto_5

    .line 87
    :cond_4
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :try_start_2
    sget-object p2, Lo42;->b:Lm42;

    .line 91
    .line 92
    iput-object p0, v0, Lzu2;->a:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 93
    .line 94
    iput-object p1, v0, Lzu2;->b:Ljava/lang/String;

    .line 95
    .line 96
    iput-object p0, v0, Lzu2;->c:Ljava/lang/Object;

    .line 97
    .line 98
    iput v5, v0, Lzu2;->i:I

    .line 99
    .line 100
    invoke-static {v0}, Lw11;->Y(Ld10;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    if-ne p2, v1, :cond_5

    .line 105
    .line 106
    goto/16 :goto_8

    .line 107
    .line 108
    :cond_5
    move-object v2, p0

    .line 109
    :goto_2
    :try_start_3
    iput-object v2, v0, Lzu2;->a:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 110
    .line 111
    iput-object p1, v0, Lzu2;->b:Ljava/lang/String;

    .line 112
    .line 113
    iput-object v6, v0, Lzu2;->c:Ljava/lang/Object;

    .line 114
    .line 115
    iput v4, v0, Lzu2;->i:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 116
    .line 117
    :try_start_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    sget-object p2, Lz80;->c:Lc60;

    .line 121
    .line 122
    new-instance v4, Lqh;

    .line 123
    .line 124
    const/16 v5, 0xb

    .line 125
    .line 126
    invoke-direct {v4, p0, p1, v6, v5}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 127
    .line 128
    .line 129
    invoke-static {p2, v4, v0}, Li13;->D(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 133
    if-ne p2, v1, :cond_6

    .line 134
    .line 135
    goto :goto_8

    .line 136
    :cond_6
    move-object p0, v2

    .line 137
    :goto_3
    :try_start_5
    check-cast p2, Lev2;

    .line 138
    .line 139
    sget-object v2, Lo42;->b:Lm42;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 140
    .line 141
    move-object v7, p2

    .line 142
    move-object p2, p1

    .line 143
    move-object p1, v7

    .line 144
    goto :goto_6

    .line 145
    :goto_4
    move-object p2, p0

    .line 146
    goto :goto_1

    .line 147
    :catchall_2
    move-exception p0

    .line 148
    goto :goto_4

    .line 149
    :goto_5
    sget-object v2, Lo42;->b:Lm42;

    .line 150
    .line 151
    new-instance v2, Ln42;

    .line 152
    .line 153
    invoke-direct {v2, p2}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    move-object p2, p1

    .line 157
    move-object p1, v2

    .line 158
    :goto_6
    invoke-static {p1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    if-eqz v2, :cond_8

    .line 163
    .line 164
    iput-object p0, v0, Lzu2;->a:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 165
    .line 166
    iput-object p2, v0, Lzu2;->b:Ljava/lang/String;

    .line 167
    .line 168
    iput-object p1, v0, Lzu2;->c:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v2, v0, Lzu2;->d:Ljava/lang/Throwable;

    .line 171
    .line 172
    iput v3, v0, Lzu2;->i:I

    .line 173
    .line 174
    invoke-static {v0}, Lw11;->Y(Ld10;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-ne v0, v1, :cond_7

    .line 179
    .line 180
    goto :goto_8

    .line 181
    :cond_7
    move-object v0, p0

    .line 182
    move-object v1, p2

    .line 183
    move-object p0, v2

    .line 184
    :goto_7
    invoke-direct {v0}, Lcom/usercentrics/sdk/ui/components/UCImageView;->getLogger()Li03;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    if-eqz p2, :cond_8

    .line 189
    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v2, "Error when loading image with URL<"

    .line 193
    .line 194
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v1, ">, please make sure that you are proving a https:// URL in the Admin Interface"

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-interface {p2, v0, p0}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    :cond_8
    sget-object p0, Lo42;->b:Lm42;

    .line 213
    .line 214
    instance-of p0, p1, Ln42;

    .line 215
    .line 216
    if-eqz p0, :cond_9

    .line 217
    .line 218
    move-object v1, v6

    .line 219
    goto :goto_8

    .line 220
    :cond_9
    move-object v1, p1

    .line 221
    :goto_8
    return-object v1
.end method

.method public static final e(Lcom/usercentrics/sdk/ui/components/UCImageView;Ljava/lang/String;[BLd10;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lav2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lav2;

    .line 7
    .line 8
    iget v1, v0, Lav2;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lav2;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lav2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lav2;-><init>(Lcom/usercentrics/sdk/ui/components/UCImageView;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lav2;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lav2;->f:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lav2;->c:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 38
    .line 39
    iget-object p1, v0, Lav2;->b:Ljava/lang/String;

    .line 40
    .line 41
    iget-object p2, v0, Lav2;->a:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_3

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_2
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :try_start_1
    sget-object p3, Lo42;->b:Lm42;

    .line 59
    .line 60
    iput-object p0, v0, Lav2;->a:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 61
    .line 62
    iput-object p1, v0, Lav2;->b:Ljava/lang/String;

    .line 63
    .line 64
    iput-object p0, v0, Lav2;->c:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 65
    .line 66
    iput v4, v0, Lav2;->f:I

    .line 67
    .line 68
    sget-object p3, Lz80;->c:Lc60;

    .line 69
    .line 70
    new-instance v2, Lmj;

    .line 71
    .line 72
    const/16 v4, 0x8

    .line 73
    .line 74
    invoke-direct {v2, p2, v3, v4}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {p3, v2, v0}, Li13;->D(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    if-ne p3, v1, :cond_3

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_3
    move-object p2, p0

    .line 85
    :goto_1
    :try_start_2
    check-cast p3, Landroid/graphics/Bitmap;

    .line 86
    .line 87
    invoke-virtual {p0, p3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    sget-object p3, Lo42;->b:Lm42;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :goto_2
    move-object v5, p2

    .line 96
    move-object p2, p0

    .line 97
    move-object p0, v5

    .line 98
    goto :goto_3

    .line 99
    :catchall_1
    move-exception p2

    .line 100
    goto :goto_2

    .line 101
    :goto_3
    sget-object p3, Lo42;->b:Lm42;

    .line 102
    .line 103
    new-instance p3, Ln42;

    .line 104
    .line 105
    invoke-direct {p3, p0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    move-object p0, p3

    .line 109
    :goto_4
    invoke-static {p0}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    if-eqz p0, :cond_4

    .line 114
    .line 115
    invoke-direct {p2}, Lcom/usercentrics/sdk/ui/components/UCImageView;->getLogger()Li03;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    if-eqz p2, :cond_4

    .line 120
    .line 121
    new-instance p3, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v0, "Error when trying to use image with URL<"

    .line 124
    .line 125
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string p1, "> as a Bitmap"

    .line 132
    .line 133
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-interface {p2, p1, p0}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0
.end method

.method public static final f(Lcom/usercentrics/sdk/ui/components/UCImageView;Ljava/lang/String;[BLd10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lbv2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lbv2;

    .line 7
    .line 8
    iget v1, v0, Lbv2;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lbv2;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lbv2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lbv2;-><init>(Lcom/usercentrics/sdk/ui/components/UCImageView;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lbv2;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lbv2;->e:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, Lbv2;->b:Ljava/lang/String;

    .line 38
    .line 39
    iget-object p0, v0, Lbv2;->a:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :catchall_0
    move-exception p2

    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :try_start_1
    sget-object p3, Lo42;->b:Lm42;

    .line 57
    .line 58
    new-instance p3, Ljava/lang/String;

    .line 59
    .line 60
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 61
    .line 62
    invoke-direct {p3, p2, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 63
    .line 64
    .line 65
    iput-object p0, v0, Lbv2;->a:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 66
    .line 67
    iput-object p1, v0, Lbv2;->b:Ljava/lang/String;

    .line 68
    .line 69
    iput v4, v0, Lbv2;->e:I

    .line 70
    .line 71
    sget-object p2, Lz80;->c:Lc60;

    .line 72
    .line 73
    new-instance v2, Lyu2;

    .line 74
    .line 75
    invoke-direct {v2, p3, p0, v3}, Lyu2;-><init>(Ljava/lang/String;Lcom/usercentrics/sdk/ui/components/UCImageView;Lc10;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p2, v2, v0}, Li13;->D(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    if-ne p2, v1, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    :goto_1
    if-ne p2, v1, :cond_4

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_4
    :goto_2
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    sget-object p3, Lo42;->b:Lm42;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :goto_3
    sget-object p3, Lo42;->b:Lm42;

    .line 96
    .line 97
    new-instance p3, Ln42;

    .line 98
    .line 99
    invoke-direct {p3, p2}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    move-object p2, p3

    .line 103
    :goto_4
    invoke-static {p2}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    if-eqz p2, :cond_6

    .line 108
    .line 109
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCImageView;->getLogger()Li03;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    if-eqz p0, :cond_6

    .line 114
    .line 115
    instance-of p3, p2, Ljava/lang/NoClassDefFoundError;

    .line 116
    .line 117
    const-string v0, "Error when trying to use image with URL<"

    .line 118
    .line 119
    if-eqz p3, :cond_5

    .line 120
    .line 121
    new-instance p2, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p1, "> as a SVG because the optional SVG module is not present. Please add this module to your application: \'com.pixplicity.sharp\'"

    .line 130
    .line 131
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-interface {p0, p1, v3}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_5
    new-instance p3, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string p1, "> as a SVG"

    .line 151
    .line 152
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-interface {p0, p1, p2}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    :cond_6
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object p0
.end method

.method private final getLogger()Li03;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/UCImageView;->b:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Li03;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getRemoteImageService()Lfv2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/UCImageView;->a:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lfv2;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setImageUrl(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Ly00;

    .line 2
    .line 3
    new-instance v1, Lpi2;

    .line 4
    .line 5
    invoke-direct {v1}, Lk01;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lz80;->a:Lm60;

    .line 9
    .line 10
    sget-object v2, Lgb1;->a:Lkt0;

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ly00;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lzs;

    .line 20
    .line 21
    const/4 v2, 0x6

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v1, p0, p1, v3, v2}, Lzs;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x3

    .line 27
    invoke-static {v0, v3, v1, p1}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/usercentrics/sdk/ui/components/UCImageView;->c:Lig2;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final getCornerSettings()Lxu2;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setCornerSettings(Lxu2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setImage(Lyz2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lxz2;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, Lxz2;

    .line 9
    .line 10
    iget-object p1, p1, Lxz2;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {p0, p1}, Lcom/usercentrics/sdk/ui/components/UCImageView;->setImageUrl(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
