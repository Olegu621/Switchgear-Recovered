.class public final Lio/sentry/instrumentation/file/e;
.super Ljava/io/FileInputStream;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/io/FileInputStream;

.field public final b:Lio/sentry/instrumentation/file/b;


# direct methods
.method public constructor <init>(Lio/sentry/instrumentation/file/c;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lio/sentry/instrumentation/file/c;->d:Ljava/io/Closeable;

    .line 2
    .line 3
    check-cast v0, Ljava/io/FileInputStream;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 6
    .line 7
    .line 8
    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    invoke-direct {p0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lio/sentry/instrumentation/file/b;

    .line 13
    .line 14
    iget-object v2, p1, Lio/sentry/instrumentation/file/c;->b:Lio/sentry/k1;

    .line 15
    .line 16
    iget-object v3, p1, Lio/sentry/instrumentation/file/c;->a:Ljava/io/File;

    .line 17
    .line 18
    iget-object p1, p1, Lio/sentry/instrumentation/file/c;->c:Lio/sentry/m6;

    .line 19
    .line 20
    invoke-direct {v1, v2, v3, p1}, Lio/sentry/instrumentation/file/b;-><init>(Lio/sentry/k1;Ljava/io/File;Lio/sentry/m6;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lio/sentry/instrumentation/file/e;->b:Lio/sentry/instrumentation/file/b;

    .line 24
    .line 25
    iput-object v0, p0, Lio/sentry/instrumentation/file/e;->a:Ljava/io/FileInputStream;

    .line 26
    .line 27
    return-void

    .line 28
    :catch_0
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 29
    .line 30
    const-string p1, "No file descriptor"

    .line 31
    .line 32
    invoke-direct {p0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public constructor <init>(Lio/sentry/instrumentation/file/c;Ljava/io/FileDescriptor;)V
    .locals 3

    .line 36
    invoke-direct {p0, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 37
    new-instance p2, Lio/sentry/instrumentation/file/b;

    iget-object v0, p1, Lio/sentry/instrumentation/file/c;->b:Lio/sentry/k1;

    iget-object v1, p1, Lio/sentry/instrumentation/file/c;->a:Ljava/io/File;

    iget-object v2, p1, Lio/sentry/instrumentation/file/c;->c:Lio/sentry/m6;

    invoke-direct {p2, v0, v1, v2}, Lio/sentry/instrumentation/file/b;-><init>(Lio/sentry/k1;Ljava/io/File;Lio/sentry/m6;)V

    iput-object p2, p0, Lio/sentry/instrumentation/file/e;->b:Lio/sentry/instrumentation/file/b;

    .line 38
    iget-object p1, p1, Lio/sentry/instrumentation/file/c;->d:Ljava/io/Closeable;

    check-cast p1, Ljava/io/FileInputStream;

    iput-object p1, p0, Lio/sentry/instrumentation/file/e;->a:Ljava/io/FileInputStream;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const/4 v0, 0x0

    .line 39
    invoke-static {p1, v0}, Lio/sentry/instrumentation/file/e;->c(Ljava/io/File;Ljava/io/FileInputStream;)Lio/sentry/instrumentation/file/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/sentry/instrumentation/file/e;-><init>(Lio/sentry/instrumentation/file/c;)V

    return-void
.end method

.method public static c(Ljava/io/File;Ljava/io/FileInputStream;)Lio/sentry/instrumentation/file/c;
    .locals 3

    .line 1
    sget-boolean v0, Lio/sentry/util/k;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lio/sentry/c1;->m()Lio/sentry/m1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Lio/sentry/c1;->g()Lio/sentry/k1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-string v1, "file.read"

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lio/sentry/k1;->p(Ljava/lang/String;)Lio/sentry/k1;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    :goto_1
    if-nez p1, :cond_2

    .line 33
    .line 34
    new-instance p1, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    new-instance v1, Lio/sentry/instrumentation/file/c;

    .line 40
    .line 41
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-direct {v1, p0, v0, p1, v2}, Lio/sentry/instrumentation/file/c;-><init>(Ljava/io/File;Lio/sentry/k1;Ljava/io/Closeable;Lio/sentry/m6;)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/instrumentation/file/e;->b:Lio/sentry/instrumentation/file/b;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/instrumentation/file/e;->a:Ljava/io/FileInputStream;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lio/sentry/instrumentation/file/b;->a(Ljava/io/Closeable;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ljava/io/FileInputStream;->close()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final read()I
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lpn;

    .line 8
    .line 9
    const/16 v2, 0x1b

    .line 10
    .line 11
    invoke-direct {v1, v2, p0, v0}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lio/sentry/instrumentation/file/e;->b:Lio/sentry/instrumentation/file/b;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lio/sentry/instrumentation/file/b;->c(Lio/sentry/instrumentation/file/a;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public final read([B)I
    .locals 2

    .line 24
    new-instance v0, Lpn;

    const/16 v1, 0x1a

    invoke-direct {v0, v1, p0, p1}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p0, p0, Lio/sentry/instrumentation/file/e;->b:Lio/sentry/instrumentation/file/b;

    invoke-virtual {p0, v0}, Lio/sentry/instrumentation/file/b;->c(Lio/sentry/instrumentation/file/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public final read([BII)I
    .locals 6

    .line 25
    new-instance v0, Lio/sentry/instrumentation/file/d;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lio/sentry/instrumentation/file/d;-><init>(Ljava/io/Closeable;[BIII)V

    iget-object p0, v1, Lio/sentry/instrumentation/file/e;->b:Lio/sentry/instrumentation/file/b;

    invoke-virtual {p0, v0}, Lio/sentry/instrumentation/file/b;->c(Lio/sentry/instrumentation/file/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public final skip(J)J
    .locals 1

    .line 1
    new-instance v0, Lp52;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lp52;-><init>(Lio/sentry/instrumentation/file/e;J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lio/sentry/instrumentation/file/e;->b:Lio/sentry/instrumentation/file/b;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lio/sentry/instrumentation/file/b;->c(Lio/sentry/instrumentation/file/a;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/Long;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    return-wide p0
.end method
