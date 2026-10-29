.class public final Ln7;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lq1;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 182
    iput p1, p0, Ln7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 177
    iput p2, p0, Ln7;->a:I

    iput p1, p0, Ln7;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;I)V
    .locals 0

    .line 178
    iput p3, p0, Ln7;->a:I

    iput p1, p0, Ln7;->b:I

    iput-object p2, p0, Ln7;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ln7;->a:I

    .line 183
    invoke-static {p1, v0}, Lo7;->e(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Ln7;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Ln7;->a:I

    .line 184
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 185
    new-instance v0, Lj7;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 186
    invoke-static {p1, p2}, Lo7;->e(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Lj7;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v0, p0, Ln7;->c:Ljava/lang/Object;

    .line 187
    iput p2, p0, Ln7;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 5

    .line 1
    const/4 v0, 0x7

    .line 2
    iput v0, p0, Ln7;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Ln7;->b:I

    .line 9
    .line 10
    new-instance v0, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ln7;->c:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance v0, Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Landroidx/constraintlayout/widget/R$styleable;->StateSet:[I

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v2, 0x0

    .line 37
    :goto_0
    if-ge v2, v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    sget v4, Landroidx/constraintlayout/widget/R$styleable;->StateSet_defaultState:I

    .line 44
    .line 45
    if-ne v3, v4, :cond_0

    .line 46
    .line 47
    iget v4, p0, Ln7;->b:I

    .line 48
    .line 49
    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iput v3, p0, Ln7;->b:I

    .line 54
    .line 55
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 59
    .line 60
    .line 61
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 62
    .line 63
    .line 64
    move-result v0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    const/4 v1, 0x0

    .line 66
    :goto_1
    const/4 v2, 0x1

    .line 67
    if-eq v0, v2, :cond_6

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    const-string v3, "StateSet"

    .line 73
    .line 74
    if-eq v0, v2, :cond_3

    .line 75
    .line 76
    const/4 v2, 0x3

    .line 77
    if-eq v0, v2, :cond_2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    :try_start_1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    sparse-switch v2, :sswitch_data_0

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :sswitch_0
    const-string v2, "Variant"

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    new-instance v0, Lxg2;

    .line 112
    .line 113
    invoke-direct {v0, p1, p2}, Lxg2;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 114
    .line 115
    .line 116
    if-eqz v1, :cond_5

    .line 117
    .line 118
    iget-object v2, v1, Lwg2;->b:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :sswitch_1
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    goto :goto_2

    .line 129
    :sswitch_2
    const-string v2, "LayoutDescription"

    .line 130
    .line 131
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    goto :goto_2

    .line 136
    :sswitch_3
    const-string v2, "State"

    .line 137
    .line 138
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_5

    .line 143
    .line 144
    new-instance v1, Lwg2;

    .line 145
    .line 146
    invoke-direct {v1, p1, p2}, Lwg2;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Ln7;->c:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Landroid/util/SparseArray;

    .line 152
    .line 153
    iget v2, v1, Lwg2;->a:I

    .line 154
    .line 155
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    :cond_5
    :goto_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 163
    .line 164
    .line 165
    move-result v0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 166
    goto :goto_1

    .line 167
    :catch_0
    move-exception p0

    .line 168
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :catch_1
    move-exception p0

    .line 173
    invoke-virtual {p0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    .line 174
    .line 175
    .line 176
    :cond_6
    :goto_3
    return-void

    .line 177
    :sswitch_data_0
    .sparse-switch
        0x4c7d471 -> :sswitch_3
        0x4d92b252 -> :sswitch_2
        0x526c4e31 -> :sswitch_1
        0x7155a865 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 179
    iput p3, p0, Ln7;->a:I

    iput-object p1, p0, Ln7;->c:Ljava/lang/Object;

    iput p2, p0, Ln7;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lwl0;Lkn;)V
    .locals 0

    const/4 p1, 0x6

    iput p1, p0, Ln7;->a:I

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    iput-object p2, p0, Ln7;->c:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Ln7;Ls50;Lbi;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Ln7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkn;

    .line 4
    .line 5
    instance-of v1, p2, Lj21;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p2

    .line 10
    check-cast v1, Lj21;

    .line 11
    .line 12
    iget v2, v1, Lj21;->i:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Lj21;->i:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lj21;

    .line 25
    .line 26
    invoke-direct {v1, p0, p2}, Lj21;-><init>(Ln7;Lbi;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p2, v1, Lj21;->e:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, Lz10;->a:Lz10;

    .line 32
    .line 33
    iget v3, v1, Lj21;->i:I

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x7

    .line 38
    const/4 v7, 0x6

    .line 39
    const/4 v8, 0x1

    .line 40
    const/4 v9, 0x4

    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    if-ne v3, v8, :cond_3

    .line 44
    .line 45
    iget-object p0, v1, Lj21;->d:Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, v1, Lj21;->c:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    iget-object v0, v1, Lj21;->b:Ln7;

    .line 50
    .line 51
    iget-object v3, v1, Lj21;->a:Ls50;

    .line 52
    .line 53
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast p2, Lkotlinx/serialization/json/b;

    .line 57
    .line 58
    invoke-interface {p1, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget-object p0, v0, Ln7;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Lkn;

    .line 64
    .line 65
    invoke-virtual {p0}, Lkn;->e()B

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eq p0, v9, :cond_2

    .line 70
    .line 71
    if-ne p0, v6, :cond_1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_1
    iget-object p0, v0, Ln7;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Lkn;

    .line 77
    .line 78
    const-string p1, "Expected end of the object or comma"

    .line 79
    .line 80
    invoke-static {p0, p1, v5, v7}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 81
    .line 82
    .line 83
    throw v4

    .line 84
    :cond_2
    move p2, p0

    .line 85
    move-object p0, v0

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v4

    .line 93
    :cond_4
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v7}, Lkn;->f(B)B

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-virtual {v0}, Lkn;->q()B

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eq v3, v9, :cond_8

    .line 105
    .line 106
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 107
    .line 108
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 109
    .line 110
    .line 111
    move-object v3, p1

    .line 112
    move-object p1, v0

    .line 113
    :goto_1
    iget-object v0, p0, Ln7;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lkn;

    .line 116
    .line 117
    invoke-virtual {v0}, Lkn;->b()Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-eqz v10, :cond_5

    .line 122
    .line 123
    invoke-virtual {v0}, Lkn;->i()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    const/4 v4, 0x5

    .line 128
    invoke-virtual {v0, v4}, Lkn;->f(B)B

    .line 129
    .line 130
    .line 131
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    iput-object v3, v1, Lj21;->a:Ls50;

    .line 134
    .line 135
    iput-object p0, v1, Lj21;->b:Ln7;

    .line 136
    .line 137
    iput-object p1, v1, Lj21;->c:Ljava/util/LinkedHashMap;

    .line 138
    .line 139
    iput-object p2, v1, Lj21;->d:Ljava/lang/String;

    .line 140
    .line 141
    iput v8, v1, Lj21;->i:I

    .line 142
    .line 143
    check-cast v3, Lt50;

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iput-object v1, v3, Lt50;->c:Lc10;

    .line 149
    .line 150
    iput-object v0, v3, Lt50;->b:Lkotlin/Unit;

    .line 151
    .line 152
    return-object v2

    .line 153
    :cond_5
    move-object v0, p0

    .line 154
    move p0, p2

    .line 155
    :goto_2
    iget-object p2, v0, Ln7;->c:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p2, Lkn;

    .line 158
    .line 159
    if-ne p0, v7, :cond_6

    .line 160
    .line 161
    invoke-virtual {p2, v6}, Lkn;->f(B)B

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_6
    if-eq p0, v9, :cond_7

    .line 166
    .line 167
    :goto_3
    new-instance p0, Lkotlinx/serialization/json/c;

    .line 168
    .line 169
    invoke-direct {p0, p1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    .line 170
    .line 171
    .line 172
    return-object p0

    .line 173
    :cond_7
    const-string p0, "Unexpected trailing comma"

    .line 174
    .line 175
    invoke-static {p2, p0, v5, v7}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 176
    .line 177
    .line 178
    throw v4

    .line 179
    :cond_8
    const-string p0, "Unexpected leading comma"

    .line 180
    .line 181
    invoke-static {v0, p0, v5, v7}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 182
    .line 183
    .line 184
    throw v4
.end method


# virtual methods
.method public b()Lo7;
    .locals 10

    .line 1
    new-instance v0, Lo7;

    .line 2
    .line 3
    iget-object v1, p0, Ln7;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lj7;

    .line 6
    .line 7
    iget-object v2, v1, Lj7;->a:Landroid/view/ContextThemeWrapper;

    .line 8
    .line 9
    iget p0, p0, Ln7;->b:I

    .line 10
    .line 11
    invoke-direct {v0, v2, p0}, Lo7;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 12
    .line 13
    .line 14
    iget-object p0, v1, Lj7;->e:Landroid/view/View;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object v3, v0, Lo7;->f:Lm7;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    iput-object p0, v3, Lm7;->w:Landroid/view/View;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p0, v1, Lj7;->d:Ljava/lang/CharSequence;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    iput-object p0, v3, Lm7;->d:Ljava/lang/CharSequence;

    .line 29
    .line 30
    iget-object v4, v3, Lm7;->u:Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object p0, v1, Lj7;->c:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    iput-object p0, v3, Lm7;->s:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    iget-object v4, v3, Lm7;->t:Landroid/widget/ImageView;

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v4, v3, Lm7;->t:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v4, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    iget-object p0, v1, Lj7;->f:Ljava/lang/String;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    iput-object p0, v3, Lm7;->e:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v4, v3, Lm7;->v:Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    invoke-virtual {v4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    iget-object p0, v1, Lj7;->g:Ljava/lang/CharSequence;

    .line 69
    .line 70
    if-nez p0, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const/4 v4, -0x1

    .line 74
    iget-object v5, v1, Lj7;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 75
    .line 76
    invoke-virtual {v3, v4, p0, v5}, Lm7;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-object p0, v1, Lj7;->i:Ljava/lang/CharSequence;

    .line 80
    .line 81
    if-nez p0, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    const/4 v4, -0x2

    .line 85
    iget-object v5, v1, Lj7;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 86
    .line 87
    invoke-virtual {v3, v4, p0, v5}, Lm7;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    iget-object p0, v1, Lj7;->o:Landroid/widget/ListAdapter;

    .line 91
    .line 92
    const/4 v4, 0x1

    .line 93
    if-eqz p0, :cond_a

    .line 94
    .line 95
    iget-object p0, v1, Lj7;->b:Landroid/view/LayoutInflater;

    .line 96
    .line 97
    iget v5, v3, Lm7;->A:I

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    invoke-virtual {p0, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 105
    .line 106
    iget-boolean v5, v1, Lj7;->r:Z

    .line 107
    .line 108
    if-eqz v5, :cond_6

    .line 109
    .line 110
    iget v5, v3, Lm7;->B:I

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    iget v5, v3, Lm7;->C:I

    .line 114
    .line 115
    :goto_3
    iget-object v7, v1, Lj7;->o:Landroid/widget/ListAdapter;

    .line 116
    .line 117
    if-eqz v7, :cond_7

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    new-instance v7, Ll7;

    .line 121
    .line 122
    iget-object v8, v1, Lj7;->a:Landroid/view/ContextThemeWrapper;

    .line 123
    .line 124
    const v9, 0x1020014

    .line 125
    .line 126
    .line 127
    invoke-direct {v7, v8, v5, v9, v6}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :goto_4
    iput-object v7, v3, Lm7;->x:Landroid/widget/ListAdapter;

    .line 131
    .line 132
    iget v5, v1, Lj7;->s:I

    .line 133
    .line 134
    iput v5, v3, Lm7;->y:I

    .line 135
    .line 136
    iget-object v5, v1, Lj7;->p:Landroid/content/DialogInterface$OnClickListener;

    .line 137
    .line 138
    if-eqz v5, :cond_8

    .line 139
    .line 140
    new-instance v5, Li7;

    .line 141
    .line 142
    invoke-direct {v5, v1, v3}, Li7;-><init>(Lj7;Lm7;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v5}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 146
    .line 147
    .line 148
    :cond_8
    iget-boolean v5, v1, Lj7;->r:Z

    .line 149
    .line 150
    if-eqz v5, :cond_9

    .line 151
    .line 152
    invoke-virtual {p0, v4}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 153
    .line 154
    .line 155
    :cond_9
    iput-object p0, v3, Lm7;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 156
    .line 157
    :cond_a
    iget-object p0, v1, Lj7;->q:Landroid/view/View;

    .line 158
    .line 159
    if-eqz p0, :cond_b

    .line 160
    .line 161
    iput-object p0, v3, Lm7;->g:Landroid/view/View;

    .line 162
    .line 163
    iput-boolean v2, v3, Lm7;->h:Z

    .line 164
    .line 165
    :cond_b
    iget-boolean p0, v1, Lj7;->k:Z

    .line 166
    .line 167
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 168
    .line 169
    .line 170
    iget-boolean p0, v1, Lj7;->k:Z

    .line 171
    .line 172
    if-eqz p0, :cond_c

    .line 173
    .line 174
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 175
    .line 176
    .line 177
    :cond_c
    iget-object p0, v1, Lj7;->l:Landroid/content/DialogInterface$OnCancelListener;

    .line 178
    .line 179
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 180
    .line 181
    .line 182
    iget-object p0, v1, Lj7;->m:Lvt1;

    .line 183
    .line 184
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 185
    .line 186
    .line 187
    iget-object p0, v1, Lj7;->n:Lkg1;

    .line 188
    .line 189
    if-eqz p0, :cond_d

    .line 190
    .line 191
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 192
    .line 193
    .line 194
    :cond_d
    return-object v0
.end method

.method public c(II)V
    .locals 2

    .line 1
    add-int/2addr p2, p1

    .line 2
    iget-object v0, p0, Ln7;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, [C

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    if-gt v1, p2, :cond_1

    .line 8
    .line 9
    mul-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    if-ge p2, p1, :cond_0

    .line 12
    .line 13
    move p2, p1

    .line 14
    :cond_0
    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Ln7;->c:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public d(Ljava/util/Map;Lio/sentry/ILogger;)Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {p0, p2, v3}, Ln7;->i(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-object v0
.end method

.method public e()Lkotlinx/serialization/json/b;
    .locals 9

    .line 1
    iget-object v0, p0, Ln7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkn;

    .line 4
    .line 5
    invoke-virtual {v0}, Lkn;->q()B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Ln7;->g(Z)Lkotlinx/serialization/json/d;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Ln7;->g(Z)Lkotlinx/serialization/json/d;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 v4, 0x6

    .line 26
    const/4 v5, 0x0

    .line 27
    if-ne v1, v4, :cond_e

    .line 28
    .line 29
    iget v1, p0, Ln7;->b:I

    .line 30
    .line 31
    add-int/2addr v1, v2

    .line 32
    iput v1, p0, Ln7;->b:I

    .line 33
    .line 34
    const/16 v2, 0xc8

    .line 35
    .line 36
    if-ne v1, v2, :cond_7

    .line 37
    .line 38
    new-instance v0, Li21;

    .line 39
    .line 40
    invoke-direct {v0, p0, v5}, Li21;-><init>(Ln7;Lc10;)V

    .line 41
    .line 42
    .line 43
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    sget-object v2, Lr50;->a:Lz10;

    .line 46
    .line 47
    new-instance v2, Lt50;

    .line 48
    .line 49
    invoke-direct {v2, v5}, Ls50;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, v2, Lt50;->a:Li21;

    .line 53
    .line 54
    iput-object v1, v2, Lt50;->b:Lkotlin/Unit;

    .line 55
    .line 56
    iput-object v2, v2, Lt50;->c:Lc10;

    .line 57
    .line 58
    sget-object v1, Lr50;->a:Lz10;

    .line 59
    .line 60
    iput-object v1, v2, Lt50;->d:Ljava/lang/Object;

    .line 61
    .line 62
    :cond_2
    :goto_0
    iget-object v0, v2, Lt50;->d:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v3, v2, Lt50;->c:Lc10;

    .line 65
    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    invoke-static {v0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    check-cast v0, Lkotlinx/serialization/json/b;

    .line 72
    .line 73
    goto/16 :goto_5

    .line 74
    .line 75
    :cond_3
    sget-object v4, Lo42;->b:Lm42;

    .line 76
    .line 77
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_6

    .line 82
    .line 83
    :try_start_0
    iget-object v0, v2, Lt50;->a:Li21;

    .line 84
    .line 85
    iget-object v4, v2, Lt50;->b:Lkotlin/Unit;

    .line 86
    .line 87
    const/4 v5, 0x3

    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-interface {v3}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    sget-object v7, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 98
    .line 99
    if-ne v6, v7, :cond_4

    .line 100
    .line 101
    new-instance v6, Lkz0;

    .line 102
    .line 103
    invoke-direct {v6, v3}, Li42;-><init>(Lc10;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    new-instance v7, Llz0;

    .line 108
    .line 109
    invoke-direct {v7, v3, v6}, Ld10;-><init>(Lc10;Lkotlin/coroutines/CoroutineContext;)V

    .line 110
    .line 111
    .line 112
    move-object v6, v7

    .line 113
    :goto_1
    invoke-static {v5, v0}, Lgs2;->b(ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v2, v4, v6}, Li21;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-static {v5, v0}, Lgs2;->b(ILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v2, v4, v3}, Li21;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    :goto_2
    sget-object v4, Lz10;->a:Lz10;

    .line 129
    .line 130
    if-eq v0, v4, :cond_2

    .line 131
    .line 132
    invoke-interface {v3, v0}, Lc10;->resumeWith(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :catchall_0
    move-exception v0

    .line 137
    sget-object v4, Lo42;->b:Lm42;

    .line 138
    .line 139
    new-instance v4, Ln42;

    .line 140
    .line 141
    invoke-direct {v4, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v3, v4}, Lc10;->resumeWith(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_6
    iput-object v1, v2, Lt50;->d:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-interface {v3, v0}, Lc10;->resumeWith(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_7
    invoke-virtual {v0, v4}, Lkn;->f(B)B

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    invoke-virtual {v0}, Lkn;->q()B

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    const/4 v6, 0x4

    .line 163
    if-eq v2, v6, :cond_d

    .line 164
    .line 165
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 166
    .line 167
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 168
    .line 169
    .line 170
    :cond_8
    invoke-virtual {v0}, Lkn;->b()Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    const/4 v8, 0x7

    .line 175
    if-eqz v7, :cond_a

    .line 176
    .line 177
    invoke-virtual {v0}, Lkn;->i()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const/4 v7, 0x5

    .line 182
    invoke-virtual {v0, v7}, Lkn;->f(B)B

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Ln7;->e()Lkotlinx/serialization/json/b;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    invoke-interface {v2, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Lkn;->e()B

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eq v1, v6, :cond_8

    .line 197
    .line 198
    if-ne v1, v8, :cond_9

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_9
    const-string p0, "Expected end of the object or comma"

    .line 202
    .line 203
    invoke-static {v0, p0, v3, v4}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 204
    .line 205
    .line 206
    throw v5

    .line 207
    :cond_a
    :goto_3
    if-ne v1, v4, :cond_b

    .line 208
    .line 209
    invoke-virtual {v0, v8}, Lkn;->f(B)B

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_b
    if-eq v1, v6, :cond_c

    .line 214
    .line 215
    :goto_4
    new-instance v0, Lkotlinx/serialization/json/c;

    .line 216
    .line 217
    invoke-direct {v0, v2}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    .line 218
    .line 219
    .line 220
    :goto_5
    iget v1, p0, Ln7;->b:I

    .line 221
    .line 222
    add-int/lit8 v1, v1, -0x1

    .line 223
    .line 224
    iput v1, p0, Ln7;->b:I

    .line 225
    .line 226
    return-object v0

    .line 227
    :cond_c
    const-string p0, "Unexpected trailing comma"

    .line 228
    .line 229
    invoke-static {v0, p0, v3, v4}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 230
    .line 231
    .line 232
    throw v5

    .line 233
    :cond_d
    const-string p0, "Unexpected leading comma"

    .line 234
    .line 235
    invoke-static {v0, p0, v3, v4}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 236
    .line 237
    .line 238
    throw v5

    .line 239
    :cond_e
    const/16 v2, 0x8

    .line 240
    .line 241
    if-ne v1, v2, :cond_f

    .line 242
    .line 243
    invoke-virtual {p0}, Ln7;->f()Lkotlinx/serialization/json/a;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    return-object p0

    .line 248
    :cond_f
    new-instance p0, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    const-string v2, "Cannot begin reading element, unexpected token: "

    .line 251
    .line 252
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-static {v0, p0, v3, v4}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 263
    .line 264
    .line 265
    throw v5
.end method

.method public f()Lkotlinx/serialization/json/a;
    .locals 9

    .line 1
    iget-object v0, p0, Ln7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkn;

    .line 4
    .line 5
    invoke-virtual {v0}, Lkn;->e()B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Lkn;->q()B

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x6

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x4

    .line 17
    if-eq v2, v6, :cond_6

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lkn;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    const/16 v8, 0x9

    .line 29
    .line 30
    if-eqz v7, :cond_3

    .line 31
    .line 32
    invoke-virtual {p0}, Ln7;->e()Lkotlinx/serialization/json/b;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lkn;->e()B

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eq v1, v6, :cond_0

    .line 44
    .line 45
    if-ne v1, v8, :cond_1

    .line 46
    .line 47
    const/4 v7, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v7, v5

    .line 50
    :goto_1
    iget v8, v0, Lkn;->b:I

    .line 51
    .line 52
    if-eqz v7, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const-string p0, "Expected end of the array or comma"

    .line 56
    .line 57
    invoke-static {v0, p0, v8, v6}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 58
    .line 59
    .line 60
    throw v4

    .line 61
    :cond_3
    const/16 p0, 0x8

    .line 62
    .line 63
    if-ne v1, p0, :cond_4

    .line 64
    .line 65
    invoke-virtual {v0, v8}, Lkn;->f(B)B

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    if-eq v1, v6, :cond_5

    .line 70
    .line 71
    :goto_2
    new-instance p0, Lkotlinx/serialization/json/a;

    .line 72
    .line 73
    invoke-direct {p0, v2}, Lkotlinx/serialization/json/a;-><init>(Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_5
    const-string p0, "Unexpected trailing comma"

    .line 78
    .line 79
    invoke-static {v0, p0, v5, v3}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 80
    .line 81
    .line 82
    throw v4

    .line 83
    :cond_6
    const-string p0, "Unexpected leading comma"

    .line 84
    .line 85
    invoke-static {v0, p0, v5, v3}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 86
    .line 87
    .line 88
    throw v4
.end method

.method public g(Z)Lkotlinx/serialization/json/d;
    .locals 1

    .line 1
    iget-object p0, p0, Ln7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkn;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lkn;->j()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lkn;->i()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    const-string v0, "null"

    .line 19
    .line 20
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-object p0, Lkotlinx/serialization/json/JsonNull;->a:Lkotlinx/serialization/json/JsonNull;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    new-instance v0, Ls11;

    .line 30
    .line 31
    invoke-direct {v0, p0, p1}, Ls11;-><init>(Ljava/lang/Object;Z)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public h()V
    .locals 4

    .line 1
    sget-object v0, Lht;->a:Lht;

    .line 2
    .line 3
    iget-object p0, p0, Ln7;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget v1, Lht;->c:I

    .line 12
    .line 13
    array-length v2, p0

    .line 14
    add-int/2addr v2, v1

    .line 15
    sget v3, Lht;->d:I

    .line 16
    .line 17
    if-ge v2, v3, :cond_0

    .line 18
    .line 19
    array-length v2, p0

    .line 20
    add-int/2addr v1, v2

    .line 21
    sput v1, Lht;->c:I

    .line 22
    .line 23
    sget-object v1, Lht;->b:Ldd;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ldd;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_1
    monitor-exit v0

    .line 34
    throw p0
.end method

.method public i(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p2, Ljava/lang/Character;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_1
    instance-of v1, p2, Ljava/lang/Number;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    return-object p2

    .line 19
    :cond_2
    instance-of v1, p2, Ljava/lang/Boolean;

    .line 20
    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_3
    instance-of v1, p2, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v1, :cond_4

    .line 27
    .line 28
    return-object p2

    .line 29
    :cond_4
    instance-of v1, p2, Ljava/util/Locale;

    .line 30
    .line 31
    if-eqz v1, :cond_5

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_5
    instance-of v1, p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v1, :cond_7

    .line 42
    .line 43
    check-cast p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 44
    .line 45
    sget-object p0, Lio/sentry/util/e;->a:Ljava/nio/charset/Charset;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    new-instance p1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    :goto_0
    if-ge v2, p0, :cond_6

    .line 57
    .line 58
    invoke-virtual {p2, v2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_6
    return-object p1

    .line 73
    :cond_7
    instance-of v1, p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 74
    .line 75
    if-eqz v1, :cond_8

    .line 76
    .line 77
    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_8
    instance-of v1, p2, Ljava/net/URI;

    .line 89
    .line 90
    if-eqz v1, :cond_9

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_9
    instance-of v1, p2, Ljava/net/InetAddress;

    .line 98
    .line 99
    if-eqz v1, :cond_a

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_a
    instance-of v1, p2, Ljava/util/UUID;

    .line 107
    .line 108
    if-eqz v1, :cond_b

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_b
    instance-of v1, p2, Ljava/util/Currency;

    .line 116
    .line 117
    if-eqz v1, :cond_c

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :cond_c
    instance-of v1, p2, Ljava/util/Calendar;

    .line 125
    .line 126
    if-eqz v1, :cond_d

    .line 127
    .line 128
    check-cast p2, Ljava/util/Calendar;

    .line 129
    .line 130
    invoke-static {p2}, Lio/sentry/util/e;->b(Ljava/util/Calendar;)Ljava/util/HashMap;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :cond_d
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_e

    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :cond_e
    iget-object v1, p0, Ln7;->c:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Ljava/util/HashSet;

    .line 153
    .line 154
    if-nez v1, :cond_f

    .line 155
    .line 156
    new-instance v1, Ljava/util/HashSet;

    .line 157
    .line 158
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-object v1, p0, Ln7;->c:Ljava/lang/Object;

    .line 162
    .line 163
    :cond_f
    iget-object v1, p0, Ln7;->c:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v1, Ljava/util/HashSet;

    .line 166
    .line 167
    invoke-virtual {v1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_10

    .line 172
    .line 173
    sget-object p0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 174
    .line 175
    const-string v0, "Cyclic reference detected. Calling toString() on object."

    .line 176
    .line 177
    new-array v1, v2, [Ljava/lang/Object;

    .line 178
    .line 179
    invoke-interface {p1, p0, v0, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0

    .line 187
    :cond_10
    invoke-interface {v1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    iget v4, p0, Ln7;->b:I

    .line 195
    .line 196
    if-le v3, v4, :cond_11

    .line 197
    .line 198
    invoke-interface {v1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    sget-object p0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 202
    .line 203
    const-string v0, "Max depth exceeded. Calling toString() on object."

    .line 204
    .line 205
    new-array v1, v2, [Ljava/lang/Object;

    .line 206
    .line 207
    invoke-interface {p1, p0, v0, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    return-object p0

    .line 215
    :cond_11
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_12

    .line 224
    .line 225
    move-object v3, p2

    .line 226
    check-cast v3, [Ljava/lang/Object;

    .line 227
    .line 228
    new-instance v4, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 231
    .line 232
    .line 233
    array-length v5, v3

    .line 234
    :goto_1
    if-ge v2, v5, :cond_15

    .line 235
    .line 236
    aget-object v6, v3, v2

    .line 237
    .line 238
    invoke-virtual {p0, p1, v6}, Ln7;->i(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    add-int/lit8 v2, v2, 0x1

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :catchall_0
    move-exception p0

    .line 249
    goto :goto_5

    .line 250
    :catch_0
    move-exception p0

    .line 251
    goto :goto_4

    .line 252
    :cond_12
    instance-of v2, p2, Ljava/util/Collection;

    .line 253
    .line 254
    if-eqz v2, :cond_13

    .line 255
    .line 256
    move-object v2, p2

    .line 257
    check-cast v2, Ljava/util/Collection;

    .line 258
    .line 259
    new-instance v4, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    if-eqz v3, :cond_15

    .line 273
    .line 274
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-virtual {p0, p1, v3}, Ln7;->i(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_13
    instance-of v2, p2, Ljava/util/Map;

    .line 287
    .line 288
    if-eqz v2, :cond_14

    .line 289
    .line 290
    move-object v2, p2

    .line 291
    check-cast v2, Ljava/util/Map;

    .line 292
    .line 293
    invoke-virtual {p0, v2, p1}, Ln7;->d(Ljava/util/Map;Lio/sentry/ILogger;)Ljava/util/HashMap;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    goto :goto_3

    .line 298
    :cond_14
    invoke-virtual {p0, p1, p2}, Ln7;->n(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/util/HashMap;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    if-eqz p0, :cond_15

    .line 307
    .line 308
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 312
    :cond_15
    :goto_3
    invoke-interface {v1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    return-object v4

    .line 316
    :goto_4
    :try_start_1
    sget-object v2, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 317
    .line 318
    const-string v3, "Not serializing object due to throwing sub-path."

    .line 319
    .line 320
    invoke-interface {p1, v2, v3, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 321
    .line 322
    .line 323
    invoke-interface {v1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    return-object v0

    .line 327
    :goto_5
    invoke-interface {v1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    throw p0
.end method

.method public j(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Ln7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    .line 5
    iget p0, p0, Ln7;->b:I

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0
.end method

.method public k(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->h()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v1, p3, Ljava/lang/Character;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast p3, Ljava/lang/Character;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Character;->charValue()C

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of v1, p3, Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    check-cast p3, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, p3}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    instance-of v1, p3, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    check-cast p3, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->z(Z)Lio/sentry/internal/debugmeta/c;

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    instance-of v1, p3, Ljava/lang/Number;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    check-cast p3, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {p1, p3}, Lio/sentry/internal/debugmeta/c;->x(Ljava/lang/Number;)Lio/sentry/internal/debugmeta/c;

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_4
    instance-of v1, p3, Ljava/util/Date;

    .line 64
    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    check-cast p3, Ljava/util/Date;

    .line 68
    .line 69
    :try_start_0
    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    invoke-static {v1, v2}, Lio/sentry/config/a;->q(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    goto/16 :goto_9

    .line 81
    .line 82
    :catch_0
    move-exception p0

    .line 83
    sget-object p1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 84
    .line 85
    const-string p3, "Error when serializing Date"

    .line 86
    .line 87
    invoke-interface {p2, p1, p3, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->h()V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_9

    .line 94
    .line 95
    :cond_5
    instance-of v1, p3, Ljava/util/TimeZone;

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    check-cast p3, Ljava/util/TimeZone;

    .line 100
    .line 101
    :try_start_1
    invoke-virtual {p3}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 106
    .line 107
    .line 108
    goto/16 :goto_9

    .line 109
    .line 110
    :catch_1
    move-exception p0

    .line 111
    sget-object p1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 112
    .line 113
    const-string p3, "Error when serializing TimeZone"

    .line 114
    .line 115
    invoke-interface {p2, p1, p3, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->h()V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_9

    .line 122
    .line 123
    :cond_6
    instance-of v0, p3, Lio/sentry/g2;

    .line 124
    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    check-cast p3, Lio/sentry/g2;

    .line 128
    .line 129
    invoke-interface {p3, p1, p2}, Lio/sentry/g2;->serialize(Lio/sentry/j3;Lio/sentry/ILogger;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_7
    instance-of v0, p3, Ljava/util/Collection;

    .line 134
    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    check-cast p3, Ljava/util/Collection;

    .line 138
    .line 139
    invoke-virtual {p0, p1, p2, p3}, Ln7;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_8
    instance-of v0, p3, [Z

    .line 144
    .line 145
    const/4 v1, 0x0

    .line 146
    if-eqz v0, :cond_a

    .line 147
    .line 148
    new-instance v0, Ljava/util/ArrayList;

    .line 149
    .line 150
    check-cast p3, [Z

    .line 151
    .line 152
    array-length v2, p3

    .line 153
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 154
    .line 155
    .line 156
    array-length v2, p3

    .line 157
    :goto_0
    if-ge v1, v2, :cond_9

    .line 158
    .line 159
    aget-boolean v3, p3, v1

    .line 160
    .line 161
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    add-int/lit8 v1, v1, 0x1

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_9
    invoke-virtual {p0, p1, p2, v0}, Ln7;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_a
    instance-of v0, p3, [B

    .line 176
    .line 177
    if-eqz v0, :cond_c

    .line 178
    .line 179
    new-instance v0, Ljava/util/ArrayList;

    .line 180
    .line 181
    check-cast p3, [B

    .line 182
    .line 183
    array-length v2, p3

    .line 184
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    array-length v2, p3

    .line 188
    :goto_1
    if-ge v1, v2, :cond_b

    .line 189
    .line 190
    aget-byte v3, p3, v1

    .line 191
    .line 192
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    add-int/lit8 v1, v1, 0x1

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_b
    invoke-virtual {p0, p1, p2, v0}, Ln7;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_c
    instance-of v0, p3, [S

    .line 207
    .line 208
    if-eqz v0, :cond_e

    .line 209
    .line 210
    new-instance v0, Ljava/util/ArrayList;

    .line 211
    .line 212
    check-cast p3, [S

    .line 213
    .line 214
    array-length v2, p3

    .line 215
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    .line 217
    .line 218
    array-length v2, p3

    .line 219
    :goto_2
    if-ge v1, v2, :cond_d

    .line 220
    .line 221
    aget-short v3, p3, v1

    .line 222
    .line 223
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    add-int/lit8 v1, v1, 0x1

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_d
    invoke-virtual {p0, p1, p2, v0}, Ln7;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :cond_e
    instance-of v0, p3, [C

    .line 238
    .line 239
    if-eqz v0, :cond_10

    .line 240
    .line 241
    new-instance v0, Ljava/util/ArrayList;

    .line 242
    .line 243
    check-cast p3, [C

    .line 244
    .line 245
    array-length v2, p3

    .line 246
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 247
    .line 248
    .line 249
    array-length v2, p3

    .line 250
    :goto_3
    if-ge v1, v2, :cond_f

    .line 251
    .line 252
    aget-char v3, p3, v1

    .line 253
    .line 254
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    add-int/lit8 v1, v1, 0x1

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_f
    invoke-virtual {p0, p1, p2, v0}, Ln7;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_10
    instance-of v0, p3, [I

    .line 269
    .line 270
    if-eqz v0, :cond_12

    .line 271
    .line 272
    new-instance v0, Ljava/util/ArrayList;

    .line 273
    .line 274
    check-cast p3, [I

    .line 275
    .line 276
    array-length v2, p3

    .line 277
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 278
    .line 279
    .line 280
    array-length v2, p3

    .line 281
    :goto_4
    if-ge v1, v2, :cond_11

    .line 282
    .line 283
    aget v3, p3, v1

    .line 284
    .line 285
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    add-int/lit8 v1, v1, 0x1

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_11
    invoke-virtual {p0, p1, p2, v0}, Ln7;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :cond_12
    instance-of v0, p3, [J

    .line 300
    .line 301
    if-eqz v0, :cond_14

    .line 302
    .line 303
    new-instance v0, Ljava/util/ArrayList;

    .line 304
    .line 305
    check-cast p3, [J

    .line 306
    .line 307
    array-length v2, p3

    .line 308
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 309
    .line 310
    .line 311
    array-length v2, p3

    .line 312
    :goto_5
    if-ge v1, v2, :cond_13

    .line 313
    .line 314
    aget-wide v3, p3, v1

    .line 315
    .line 316
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    add-int/lit8 v1, v1, 0x1

    .line 324
    .line 325
    goto :goto_5

    .line 326
    :cond_13
    invoke-virtual {p0, p1, p2, v0}, Ln7;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :cond_14
    instance-of v0, p3, [F

    .line 331
    .line 332
    if-eqz v0, :cond_16

    .line 333
    .line 334
    new-instance v0, Ljava/util/ArrayList;

    .line 335
    .line 336
    check-cast p3, [F

    .line 337
    .line 338
    array-length v2, p3

    .line 339
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 340
    .line 341
    .line 342
    array-length v2, p3

    .line 343
    :goto_6
    if-ge v1, v2, :cond_15

    .line 344
    .line 345
    aget v3, p3, v1

    .line 346
    .line 347
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    add-int/lit8 v1, v1, 0x1

    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_15
    invoke-virtual {p0, p1, p2, v0}, Ln7;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :cond_16
    instance-of v0, p3, [D

    .line 362
    .line 363
    if-eqz v0, :cond_18

    .line 364
    .line 365
    new-instance v0, Ljava/util/ArrayList;

    .line 366
    .line 367
    check-cast p3, [D

    .line 368
    .line 369
    array-length v2, p3

    .line 370
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 371
    .line 372
    .line 373
    array-length v2, p3

    .line 374
    :goto_7
    if-ge v1, v2, :cond_17

    .line 375
    .line 376
    aget-wide v3, p3, v1

    .line 377
    .line 378
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    add-int/lit8 v1, v1, 0x1

    .line 386
    .line 387
    goto :goto_7

    .line 388
    :cond_17
    invoke-virtual {p0, p1, p2, v0}, Ln7;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 389
    .line 390
    .line 391
    return-void

    .line 392
    :cond_18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_19

    .line 401
    .line 402
    check-cast p3, [Ljava/lang/Object;

    .line 403
    .line 404
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 405
    .line 406
    .line 407
    move-result-object p3

    .line 408
    invoke-virtual {p0, p1, p2, p3}, Ln7;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 409
    .line 410
    .line 411
    return-void

    .line 412
    :cond_19
    instance-of v0, p3, Ljava/util/Map;

    .line 413
    .line 414
    if-eqz v0, :cond_1a

    .line 415
    .line 416
    check-cast p3, Ljava/util/Map;

    .line 417
    .line 418
    invoke-virtual {p0, p1, p2, p3}, Ln7;->m(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Map;)V

    .line 419
    .line 420
    .line 421
    return-void

    .line 422
    :cond_1a
    instance-of v0, p3, Ljava/util/Locale;

    .line 423
    .line 424
    if-eqz v0, :cond_1b

    .line 425
    .line 426
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 431
    .line 432
    .line 433
    return-void

    .line 434
    :cond_1b
    instance-of v0, p3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 435
    .line 436
    if-eqz v0, :cond_1d

    .line 437
    .line 438
    check-cast p3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 439
    .line 440
    sget-object v0, Lio/sentry/util/e;->a:Ljava/nio/charset/Charset;

    .line 441
    .line 442
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    new-instance v2, Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 449
    .line 450
    .line 451
    :goto_8
    if-ge v1, v0, :cond_1c

    .line 452
    .line 453
    invoke-virtual {p3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    add-int/lit8 v1, v1, 0x1

    .line 465
    .line 466
    goto :goto_8

    .line 467
    :cond_1c
    invoke-virtual {p0, p1, p2, v2}, Ln7;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 468
    .line 469
    .line 470
    return-void

    .line 471
    :cond_1d
    instance-of v0, p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 472
    .line 473
    if-eqz v0, :cond_1e

    .line 474
    .line 475
    check-cast p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 476
    .line 477
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 478
    .line 479
    .line 480
    move-result p0

    .line 481
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->z(Z)Lio/sentry/internal/debugmeta/c;

    .line 482
    .line 483
    .line 484
    return-void

    .line 485
    :cond_1e
    instance-of v0, p3, Ljava/net/URI;

    .line 486
    .line 487
    if-eqz v0, :cond_1f

    .line 488
    .line 489
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object p0

    .line 493
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :cond_1f
    instance-of v0, p3, Ljava/net/InetAddress;

    .line 498
    .line 499
    if-eqz v0, :cond_20

    .line 500
    .line 501
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 506
    .line 507
    .line 508
    return-void

    .line 509
    :cond_20
    instance-of v0, p3, Ljava/util/UUID;

    .line 510
    .line 511
    if-eqz v0, :cond_21

    .line 512
    .line 513
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 518
    .line 519
    .line 520
    return-void

    .line 521
    :cond_21
    instance-of v0, p3, Ljava/util/Currency;

    .line 522
    .line 523
    if-eqz v0, :cond_22

    .line 524
    .line 525
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object p0

    .line 529
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 530
    .line 531
    .line 532
    return-void

    .line 533
    :cond_22
    instance-of v0, p3, Ljava/util/Calendar;

    .line 534
    .line 535
    if-eqz v0, :cond_23

    .line 536
    .line 537
    check-cast p3, Ljava/util/Calendar;

    .line 538
    .line 539
    invoke-static {p3}, Lio/sentry/util/e;->b(Ljava/util/Calendar;)Ljava/util/HashMap;

    .line 540
    .line 541
    .line 542
    move-result-object p3

    .line 543
    invoke-virtual {p0, p1, p2, p3}, Ln7;->m(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Map;)V

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :cond_23
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 552
    .line 553
    .line 554
    move-result v0

    .line 555
    if-eqz v0, :cond_24

    .line 556
    .line 557
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object p0

    .line 561
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 562
    .line 563
    .line 564
    return-void

    .line 565
    :cond_24
    :try_start_2
    iget-object v0, p0, Ln7;->c:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v0, Ln7;

    .line 568
    .line 569
    if-nez v0, :cond_25

    .line 570
    .line 571
    new-instance v0, Ln7;

    .line 572
    .line 573
    iget v1, p0, Ln7;->b:I

    .line 574
    .line 575
    const/16 v2, 0xa

    .line 576
    .line 577
    invoke-direct {v0, v1, v2}, Ln7;-><init>(II)V

    .line 578
    .line 579
    .line 580
    iput-object v0, p0, Ln7;->c:Ljava/lang/Object;

    .line 581
    .line 582
    :cond_25
    iget-object v0, p0, Ln7;->c:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v0, Ln7;

    .line 585
    .line 586
    invoke-virtual {v0, p2, p3}, Ln7;->i(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object p3

    .line 590
    invoke-virtual {p0, p1, p2, p3}, Ln7;->k(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 591
    .line 592
    .line 593
    return-void

    .line 594
    :catch_2
    move-exception p0

    .line 595
    sget-object p3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 596
    .line 597
    const-string v0, "Failed serializing unknown object."

    .line 598
    .line 599
    invoke-interface {p2, p3, v0, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 600
    .line 601
    .line 602
    const-string p0, "[OBJECT]"

    .line 603
    .line 604
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 605
    .line 606
    .line 607
    :goto_9
    return-void
.end method

.method public l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->l()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->c()V

    .line 9
    .line 10
    .line 11
    iget v1, v0, Lio/sentry/vendor/gson/stream/c;->c:I

    .line 12
    .line 13
    iget-object v2, v0, Lio/sentry/vendor/gson/stream/c;->b:[I

    .line 14
    .line 15
    array-length v3, v2

    .line 16
    const/4 v4, 0x2

    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    mul-int/2addr v1, v4

    .line 20
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, v0, Lio/sentry/vendor/gson/stream/c;->b:[I

    .line 25
    .line 26
    :cond_0
    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->b:[I

    .line 27
    .line 28
    iget v2, v0, Lio/sentry/vendor/gson/stream/c;->c:I

    .line 29
    .line 30
    add-int/lit8 v3, v2, 0x1

    .line 31
    .line 32
    iput v3, v0, Lio/sentry/vendor/gson/stream/c;->c:I

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    aput v3, v1, v2

    .line 36
    .line 37
    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->a:Ljava/io/Writer;

    .line 38
    .line 39
    const/16 v2, 0x5b

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p0, p1, p2, v1}, Ln7;->k(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/16 p0, 0x5d

    .line 63
    .line 64
    invoke-virtual {v0, v3, v4, p0}, Lio/sentry/vendor/gson/stream/c;->f(IIC)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public m(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Map;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->i()Lio/sentry/internal/debugmeta/c;

    .line 2
    .line 3
    .line 4
    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v2, v1, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 30
    .line 31
    .line 32
    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, p1, p2, v1}, Ln7;->k(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->l()Lio/sentry/internal/debugmeta/c;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public n(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    array-length v2, v0

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v4, v2, :cond_2

    .line 18
    .line 19
    aget-object v5, v0, v4

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    const/4 v7, 0x1

    .line 48
    :try_start_0
    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {p0, p1, v7}, Ln7;->i(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catch_0
    sget-object v5, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 67
    .line 68
    const-string v7, "Cannot access field "

    .line 69
    .line 70
    const-string v8, "."

    .line 71
    .line 72
    invoke-static {v7, v6, v8}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    new-array v7, v3, [Ljava/lang/Object;

    .line 77
    .line 78
    invoke-interface {p1, v5, v6, v7}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    return-object v1
.end method

.method public o(I)I
    .locals 4

    .line 1
    iget-object p0, p0, Ln7;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/util/SparseArray;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, -0x1

    .line 7
    const/high16 v2, -0x40800000    # -1.0f

    .line 8
    .line 9
    if-ne v1, p1, :cond_6

    .line 10
    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lwg2;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lwg2;

    .line 25
    .line 26
    :goto_0
    if-nez p0, :cond_1

    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_1
    iget-object p1, p0, Lwg2;->b:Ljava/util/ArrayList;

    .line 30
    .line 31
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ge v0, v3, :cond_3

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lxg2;

    .line 42
    .line 43
    invoke-virtual {v3, v2, v2}, Lxg2;->a(FF)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v0, v1

    .line 54
    :goto_2
    if-ne v1, v0, :cond_4

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    if-ne v0, v1, :cond_5

    .line 58
    .line 59
    iget p0, p0, Lwg2;->c:I

    .line 60
    .line 61
    return p0

    .line 62
    :cond_5
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Lxg2;

    .line 67
    .line 68
    iget p0, p0, Lxg2;->e:I

    .line 69
    .line 70
    return p0

    .line 71
    :cond_6
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Lwg2;

    .line 76
    .line 77
    if-nez p0, :cond_7

    .line 78
    .line 79
    :goto_3
    return v1

    .line 80
    :cond_7
    iget-object p1, p0, Lwg2;->b:Ljava/util/ArrayList;

    .line 81
    .line 82
    :goto_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-ge v0, v3, :cond_9

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Lxg2;

    .line 93
    .line 94
    invoke-virtual {v3, v2, v2}, Lxg2;->a(FF)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_8

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_9
    move v0, v1

    .line 105
    :goto_5
    if-ne v0, v1, :cond_a

    .line 106
    .line 107
    iget p0, p0, Lwg2;->c:I

    .line 108
    .line 109
    return p0

    .line 110
    :cond_a
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Lxg2;

    .line 115
    .line 116
    iget p0, p0, Lxg2;->e:I

    .line 117
    .line 118
    return p0
.end method

.method public p(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget v1, p0, Ln7;->b:I

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Ln7;->c(II)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ln7;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, [C

    .line 19
    .line 20
    iget v2, p0, Ln7;->b:I

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {p1, v3, v4, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 28
    .line 29
    .line 30
    iget p1, p0, Ln7;->b:I

    .line 31
    .line 32
    add-int/2addr p1, v0

    .line 33
    iput p1, p0, Ln7;->b:I

    .line 34
    .line 35
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Ln7;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Ln7;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, [C

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iget p0, p0, Ln7;->b:I

    .line 19
    .line 20
    invoke-direct {v0, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method
