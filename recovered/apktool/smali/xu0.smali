.class public final Lxu0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lg8;

.field public final b:Lnl1;

.field public final c:Lx80;


# direct methods
.method public constructor <init>(Lg8;Lnl1;Lx80;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lxu0;->a:Lg8;

    .line 14
    .line 15
    iput-object p2, p0, Lxu0;->b:Lnl1;

    .line 16
    .line 17
    iput-object p3, p0, Lxu0;->c:Lx80;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Ljava/util/LinkedHashMap;
    .locals 9

    .line 1
    iget-object p0, p0, Lxu0;->b:Lnl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnl1;->a()Le13;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-boolean v0, p0, Le13;->g:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "M"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v0, ""

    .line 15
    .line 16
    :goto_0
    iget-object v1, p0, Le13;->a:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Le13;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v3, p0, Le13;->c:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v4, p0, Le13;->d:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v5, p0, Le13;->e:Ljava/lang/String;

    .line 25
    .line 26
    iget-object p0, p0, Le13;->f:Ljava/lang/String;

    .line 27
    .line 28
    const-string v6, "Mobile/"

    .line 29
    .line 30
    const-string v7, "/2.24.4/"

    .line 31
    .line 32
    const-string v8, "/"

    .line 33
    .line 34
    invoke-static {v6, v1, v8, v2, v7}, Len;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1, v3, v8, v4, v8}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v5, v8, p0, v8}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance v0, Lkotlin/Pair;

    .line 52
    .line 53
    const-string v1, "User-Agent"

    .line 54
    .line 55
    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Loc1;->f([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/util/Map$Entry;

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lzu0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljb1;->h()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lxu0;->a(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p0, p0, Lxu0;->a:Lg8;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Lg8;->a(Ljava/lang/String;Ljava/util/LinkedHashMap;)Ljava/net/HttpURLConnection;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "GET"

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lg8;->d(Ljava/net/HttpURLConnection;)Lzu0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final c(Ljava/lang/String;Ljava/util/Map;Ld10;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ljb1;->h()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lu80;

    .line 5
    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    move-object v1, p0

    .line 9
    move-object v2, p1

    .line 10
    move-object v3, p2

    .line 11
    invoke-direct/range {v0 .. v5}, Lu80;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Lc10;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p3}, Lk50;->c(Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Ljb1;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p3}, Lxu0;->a(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    iget-object p0, p0, Lxu0;->a:Lg8;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p3}, Lg8;->a(Ljava/lang/String;Ljava/util/LinkedHashMap;)Ljava/net/HttpURLConnection;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 p3, 0x1

    .line 18
    invoke-virtual {p1, p3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 19
    .line 20
    .line 21
    const-string p3, "POST"

    .line 22
    .line 23
    invoke-virtual {p1, p3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p3, "Content-Type"

    .line 27
    .line 28
    iget-object v0, p0, Lg8;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, p3, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    new-instance v0, Ljava/io/BufferedOutputStream;

    .line 38
    .line 39
    invoke-direct {v0, p3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lg8;->c:Ljava/nio/charset/Charset;

    .line 43
    .line 44
    invoke-virtual {p2, p0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 58
    .line 59
    .line 60
    if-eqz p3, :cond_0

    .line 61
    .line 62
    invoke-virtual {p3}, Ljava/io/OutputStream;->close()V

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-static {p1}, Lg8;->d(Ljava/net/HttpURLConnection;)Lzu0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iget-object p0, p0, Lzu0;->b:Ljava/lang/String;

    .line 70
    .line 71
    return-object p0
.end method
