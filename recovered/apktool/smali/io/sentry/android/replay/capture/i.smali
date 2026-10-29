.class public final Lio/sentry/android/replay/capture/i;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static a(Lio/sentry/c1;Lio/sentry/m6;JLjava/util/Date;Lio/sentry/protocol/w;IIILio/sentry/n6;Lio/sentry/android/replay/k;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;Ljava/util/List;)Lio/sentry/android/replay/capture/l;
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move/from16 v4, p6

    move-object/from16 v11, p10

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v11, :cond_2a

    .line 1
    iget-object v13, v11, Lio/sentry/android/replay/k;->a:Lio/sentry/m6;

    const-wide/32 v5, 0x493e0

    move-wide/from16 v7, p2

    .line 2
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    .line 3
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    move-wide v7, v5

    .line 4
    new-instance v6, Ljava/io/File;

    invoke-virtual {v11}, Lio/sentry/android/replay/k;->g()Ljava/io/File;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ".mp4"

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 5
    iget-object v5, v11, Lio/sentry/android/replay/k;->f:Lio/sentry/util/a;

    .line 6
    iget-object v9, v11, Lio/sentry/android/replay/k;->w:Ljava/util/ArrayList;

    iget-object v10, v11, Lio/sentry/android/replay/k;->d:Lio/sentry/util/a;

    .line 7
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    const-wide/16 v16, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v18

    cmp-long v0, v18, v16

    if-lez v0, :cond_0

    .line 8
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 9
    :cond_0
    invoke-virtual {v5}, Lio/sentry/util/a;->c()V

    :try_start_0
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_f

    if-eqz v0, :cond_1

    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    move-object/from16 p2, v0

    move-wide/from16 v18, v14

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object v11, v5

    goto/16 :goto_22

    :cond_1
    :try_start_2
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_f

    goto :goto_0

    :goto_1
    const/4 v14, 0x0

    invoke-static {v5, v14}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 10
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v15, 0x0

    const/4 v14, 0x1

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {v13}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v5, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    const-string v6, "No captured frames, skipping generating a video segment"

    new-array v7, v15, [Ljava/lang/Object;

    invoke-interface {v0, v5, v6, v7}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    move/from16 v9, p11

    :goto_2
    const/4 v5, 0x0

    const/4 v15, 0x0

    goto/16 :goto_17

    .line 12
    :cond_2
    invoke-virtual {v10}, Lio/sentry/util/a;->c()V

    .line 13
    :try_start_3
    new-instance v0, Lio/sentry/android/core/d;

    move-object/from16 v20, v5

    .line 14
    new-instance v5, Lio/sentry/android/replay/video/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_d

    move-wide/from16 v21, v7

    move-object/from16 v23, v9

    move-object/from16 v24, v10

    move/from16 v8, p7

    move/from16 v7, p8

    move/from16 v9, p11

    move/from16 v10, p12

    :try_start_4
    invoke-direct/range {v5 .. v10}, Lio/sentry/android/replay/video/a;-><init>(Ljava/io/File;IIII)V

    .line 15
    invoke-direct {v0, v13, v5}, Lio/sentry/android/core/d;-><init>(Lio/sentry/m6;Lio/sentry/android/replay/video/a;)V

    .line 16
    iget-object v5, v0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    check-cast v5, Landroid/media/MediaCodec;

    .line 17
    iget-object v10, v0, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    check-cast v10, Lp51;

    .line 18
    invoke-interface {v10}, Lp51;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/media/MediaFormat;

    const/4 v15, 0x0

    .line 19
    invoke-virtual {v5, v10, v15, v15, v14}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 20
    invoke-virtual {v5}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v10

    iput-object v10, v0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 21
    invoke-virtual {v5}, Landroid/media/MediaCodec;->start()V

    const/4 v5, 0x0

    .line 22
    invoke-virtual {v0, v5}, Lio/sentry/android/core/d;->c(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_c

    move-object/from16 v5, v24

    .line 23
    invoke-static {v5, v15}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 24
    iput-object v0, v11, Lio/sentry/android/replay/k;->i:Lio/sentry/android/core/d;

    int-to-long v14, v9

    const-wide/16 v25, 0x3e8

    .line 25
    div-long v14, v25, v14

    .line 26
    invoke-static/range {p2 .. p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v10, v21

    move-object/from16 v21, v13

    add-long v12, v10, v18

    const-wide/high16 v18, -0x8000000000000000L

    cmp-long v18, v12, v18

    if-gtz v18, :cond_3

    .line 27
    sget-object v10, Lra1;->e:Lqa1;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    sget-object v10, Lra1;->f:Lra1;

    move-object/from16 v18, v0

    goto :goto_3

    :cond_3
    move-object/from16 v18, v0

    .line 29
    new-instance v0, Lra1;

    const-wide/16 v27, 0x1

    sub-long v7, v12, v27

    invoke-direct {v0, v10, v11, v7, v8}, Lra1;-><init>(JJ)V

    move-object v10, v0

    .line 30
    :goto_3
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    cmp-long v0, v14, v16

    if-lez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    .line 31
    :goto_4
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v0, v7}, Lq02;->a(ZLjava/lang/Number;)V

    .line 32
    sget-object v0, Loa1;->d:Lna1;

    .line 33
    iget-wide v7, v10, Loa1;->a:J

    move-wide/from16 v28, v7

    .line 34
    iget-wide v7, v10, Loa1;->b:J

    .line 35
    iget-wide v10, v10, Loa1;->c:J

    cmp-long v10, v10, v16

    if-lez v10, :cond_5

    move-wide/from16 v32, v14

    goto :goto_5

    :cond_5
    neg-long v10, v14

    move-wide/from16 v32, v10

    .line 36
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    new-instance v27, Loa1;

    move-wide/from16 v30, v7

    invoke-direct/range {v27 .. v33}, Loa1;-><init>(JJJ)V

    move-object/from16 v0, v27

    cmp-long v7, v32, v16

    .line 38
    iget-wide v10, v0, Loa1;->b:J

    if-lez v7, :cond_6

    cmp-long v0, v28, v10

    if-lez v0, :cond_7

    :cond_6
    if-gez v7, :cond_11

    cmp-long v0, v10, v28

    if-gtz v0, :cond_11

    :cond_7
    move-object/from16 v0, v18

    move-wide/from16 v7, v28

    const/16 v18, 0x0

    .line 39
    :goto_6
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    .line 40
    :goto_7
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_a

    .line 41
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v24, v0

    move-object/from16 v0, v22

    check-cast v0, Lio/sentry/android/replay/l;

    add-long v27, v7, v14

    move-wide/from16 v29, v7

    .line 42
    iget-wide v7, v0, Lio/sentry/android/replay/l;->b:J

    cmp-long v22, v29, v7

    if-gtz v22, :cond_8

    cmp-long v22, v7, v27

    if-gtz v22, :cond_8

    move-object v7, v0

    goto :goto_9

    :cond_8
    cmp-long v0, v7, v27

    if-lez v0, :cond_9

    goto :goto_8

    :cond_9
    move-object/from16 v0, v24

    move-wide/from16 v7, v29

    goto :goto_7

    :cond_a
    move-object/from16 v24, v0

    move-wide/from16 v29, v7

    :goto_8
    move-object/from16 v7, v24

    .line 43
    :goto_9
    move-object v0, v7

    check-cast v0, Lio/sentry/android/replay/l;

    if-nez v0, :cond_b

    move-object/from16 v8, p10

    move-wide/from16 v27, v10

    move-wide/from16 v34, v14

    goto :goto_d

    .line 44
    :cond_b
    :try_start_5
    iget-object v0, v0, Lio/sentry/android/replay/l;->a:Ljava/io/File;

    .line 45
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 46
    invoke-virtual {v5}, Lio/sentry/util/a;->c()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    move-object/from16 v8, p10

    move-wide/from16 v27, v10

    :try_start_6
    iget-object v10, v8, Lio/sentry/android/replay/k;->i:Lio/sentry/android/core/d;

    if-eqz v10, :cond_c

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10, v0}, Lio/sentry/android/core/d;->d(Landroid/graphics/Bitmap;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_c
    const/4 v10, 0x0

    goto :goto_a

    :catchall_1
    move-exception v0

    move-object v10, v0

    goto :goto_b

    :goto_a
    :try_start_7
    invoke-static {v5, v10}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 47
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    add-int/lit8 v18, v18, 0x1

    move-object v0, v7

    move-wide/from16 v34, v14

    move-object/from16 v11, v20

    move-object/from16 v10, v23

    move-object/from16 v14, p2

    goto :goto_11

    :catchall_2
    move-exception v0

    goto :goto_c

    .line 48
    :goto_b
    :try_start_8
    throw v10
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_9
    invoke-static {v5, v10}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_4
    move-exception v0

    move-object/from16 v8, p10

    move-wide/from16 v27, v10

    .line 49
    :goto_c
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    move-result-object v10

    .line 50
    sget-object v11, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    move-wide/from16 v34, v14

    .line 51
    const-string v14, "Unable to decode bitmap and encode it into a video, skipping frame"

    .line 52
    invoke-interface {v10, v11, v14, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_d
    if-eqz v7, :cond_f

    .line 53
    move-object v0, v7

    check-cast v0, Lio/sentry/android/replay/l;

    .line 54
    iget-object v0, v0, Lio/sentry/android/replay/l;->a:Ljava/io/File;

    .line 55
    invoke-virtual {v8, v0}, Lio/sentry/android/replay/k;->f(Ljava/io/File;)V

    .line 56
    invoke-virtual/range {v20 .. v20}, Lio/sentry/util/a;->c()V

    move-object/from16 v10, v23

    .line 57
    :try_start_a
    instance-of v0, v10, Lr21;

    if-eqz v0, :cond_e

    instance-of v0, v10, Ls21;

    if-eqz v0, :cond_d

    goto :goto_e

    .line 58
    :cond_d
    const-string v0, "kotlin.collections.MutableCollection"

    invoke-static {v10, v0}, Lgs2;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v15, 0x0

    throw v15
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 59
    :cond_e
    :goto_e
    :try_start_b
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    move-object/from16 v11, v20

    const/4 v15, 0x0

    invoke-static {v11, v15}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    move-object/from16 v14, p2

    .line 60
    invoke-interface {v14, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    goto :goto_11

    :catchall_5
    move-exception v0

    :goto_f
    move-object/from16 v11, v20

    move-object v1, v0

    goto :goto_10

    :catchall_6
    move-exception v0

    goto :goto_f

    .line 61
    :goto_10
    :try_start_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    :catchall_7
    move-exception v0

    invoke-static {v11, v1}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :cond_f
    move-object/from16 v14, p2

    move-object/from16 v11, v20

    move-object/from16 v10, v23

    move-object v0, v7

    :goto_11
    cmp-long v7, v29, v27

    if-eqz v7, :cond_10

    add-long v19, v29, v32

    move-object/from16 v23, v10

    move-object/from16 p2, v14

    move-wide/from16 v7, v19

    move-wide/from16 v14, v34

    move-object/from16 v20, v11

    move-wide/from16 v10, v27

    goto/16 :goto_6

    :cond_10
    move/from16 v0, v18

    goto :goto_12

    :cond_11
    move-object/from16 v8, p10

    const/4 v0, 0x0

    :goto_12
    if-nez v0, :cond_13

    .line 62
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v7, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    const-string v10, "Generated a video with no frames, not capturing a replay segment"

    const/4 v11, 0x0

    new-array v12, v11, [Ljava/lang/Object;

    invoke-interface {v0, v7, v10, v12}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-virtual {v5}, Lio/sentry/util/a;->c()V

    .line 64
    :try_start_d
    iget-object v0, v8, Lio/sentry/android/replay/k;->i:Lio/sentry/android/core/d;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Lio/sentry/android/core/d;->f()V

    :cond_12
    const/4 v15, 0x0

    goto :goto_13

    :catchall_8
    move-exception v0

    move-object v1, v0

    goto :goto_14

    .line 65
    :goto_13
    iput-object v15, v8, Lio/sentry/android/replay/k;->i:Lio/sentry/android/core/d;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 66
    invoke-static {v5, v15}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 67
    invoke-virtual {v8, v6}, Lio/sentry/android/replay/k;->f(Ljava/io/File;)V

    goto/16 :goto_2

    .line 68
    :goto_14
    :try_start_e
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    :catchall_9
    move-exception v0

    invoke-static {v5, v1}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    .line 69
    :cond_13
    invoke-virtual {v5}, Lio/sentry/util/a;->c()V

    .line 70
    :try_start_f
    iget-object v7, v8, Lio/sentry/android/replay/k;->i:Lio/sentry/android/core/d;

    if-eqz v7, :cond_14

    invoke-virtual {v7}, Lio/sentry/android/core/d;->f()V

    goto :goto_15

    :catchall_a
    move-exception v0

    move-object v1, v0

    goto/16 :goto_1f

    .line 71
    :cond_14
    :goto_15
    iget-object v7, v8, Lio/sentry/android/replay/k;->i:Lio/sentry/android/core/d;

    if-eqz v7, :cond_16

    .line 72
    iget-object v7, v7, Lio/sentry/android/core/d;->f:Ljava/lang/Object;

    check-cast v7, Lio/sentry/android/replay/video/b;

    .line 73
    iget v10, v7, Lio/sentry/android/replay/video/b;->e:I

    if-nez v10, :cond_15

    goto :goto_16

    .line 74
    :cond_15
    iget-wide v10, v7, Lio/sentry/android/replay/video/b;->f:J

    iget-wide v14, v7, Lio/sentry/android/replay/video/b;->a:J

    add-long/2addr v10, v14

    div-long v16, v10, v25

    :cond_16
    :goto_16
    move-wide/from16 v10, v16

    const/4 v15, 0x0

    .line 75
    iput-object v15, v8, Lio/sentry/android/replay/k;->i:Lio/sentry/android/core/d;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    .line 76
    invoke-static {v5, v15}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 77
    invoke-virtual {v8, v12, v13}, Lio/sentry/android/replay/k;->i(J)Ljava/lang/String;

    .line 78
    new-instance v5, Lio/sentry/android/replay/d;

    invoke-direct {v5, v6, v0, v10, v11}, Lio/sentry/android/replay/d;-><init>(Ljava/io/File;IJ)V

    :goto_17
    if-nez v5, :cond_17

    goto/16 :goto_23

    .line 79
    :cond_17
    iget-object v0, v5, Lio/sentry/android/replay/d;->a:Ljava/io/File;

    .line 80
    iget v6, v5, Lio/sentry/android/replay/d;->b:I

    .line 81
    iget-wide v7, v5, Lio/sentry/android/replay/d;->c:J

    if-nez p14, :cond_19

    .line 82
    new-instance v5, Lh22;

    .line 83
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 84
    sget-object v10, Lnd0;->a:Lnd0;

    .line 85
    iput-object v10, v5, Lh22;->a:Ljava/lang/Object;

    if-eqz v1, :cond_18

    .line 86
    new-instance v11, Lio/sentry/android/replay/m;

    const/4 v10, 0x1

    invoke-direct {v11, v10, v5}, Lio/sentry/android/replay/m;-><init>(ILh22;)V

    .line 87
    invoke-interface {v1, v11}, Lio/sentry/c1;->r(Lio/sentry/d4;)V

    .line 88
    :cond_18
    iget-object v1, v5, Lh22;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    goto :goto_18

    :cond_19
    move-object/from16 v1, p14

    .line 89
    :goto_18
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    add-long/2addr v11, v7

    .line 90
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5, v11, v12}, Ljava/util/Date;-><init>(J)V

    .line 91
    new-instance v11, Lio/sentry/o6;

    invoke-direct {v11}, Lio/sentry/o6;-><init>()V

    .line 92
    iput-object v3, v11, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 93
    iput-object v3, v11, Lio/sentry/o6;->d0:Lio/sentry/protocol/w;

    .line 94
    iput v4, v11, Lio/sentry/o6;->e0:I

    .line 95
    iput-object v5, v11, Lio/sentry/o6;->f0:Ljava/util/Date;

    .line 96
    iput-object v2, v11, Lio/sentry/o6;->g0:Ljava/util/Date;

    move-object/from16 v3, p9

    .line 97
    iput-object v3, v11, Lio/sentry/o6;->c0:Lio/sentry/n6;

    .line 98
    iput-object v0, v11, Lio/sentry/o6;->a0:Ljava/io/File;

    move-object/from16 v3, p16

    .line 99
    iput-object v3, v11, Lio/sentry/o6;->j0:Ljava/util/List;

    .line 100
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 101
    new-instance v12, Lio/sentry/rrweb/j;

    invoke-direct {v12}, Lio/sentry/rrweb/j;-><init>()V

    .line 102
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v13

    .line 103
    iput-wide v13, v12, Lio/sentry/rrweb/b;->b:J

    move/from16 v13, p7

    .line 104
    iput v13, v12, Lio/sentry/rrweb/j;->d:I

    move/from16 v14, p8

    .line 105
    iput v14, v12, Lio/sentry/rrweb/j;->e:I

    .line 106
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    new-instance v12, Lio/sentry/rrweb/m;

    invoke-direct {v12}, Lio/sentry/rrweb/m;-><init>()V

    move-object/from16 p0, v11

    .line 108
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    .line 109
    iput-wide v10, v12, Lio/sentry/rrweb/b;->b:J

    .line 110
    iput v4, v12, Lio/sentry/rrweb/m;->d:I

    .line 111
    iput-wide v7, v12, Lio/sentry/rrweb/m;->f:J

    .line 112
    iput v6, v12, Lio/sentry/rrweb/m;->V:I

    .line 113
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v6

    .line 114
    iput-wide v6, v12, Lio/sentry/rrweb/m;->e:J

    .line 115
    iput v9, v12, Lio/sentry/rrweb/m;->X:I

    .line 116
    iput v13, v12, Lio/sentry/rrweb/m;->w:I

    .line 117
    iput v14, v12, Lio/sentry/rrweb/m;->U:I

    const/4 v11, 0x0

    .line 118
    iput v11, v12, Lio/sentry/rrweb/m;->Y:I

    .line 119
    iput v11, v12, Lio/sentry/rrweb/m;->Z:I

    .line 120
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 122
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v6, v15

    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_22

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/f;

    if-eqz v6, :cond_1b

    .line 123
    iget-object v8, v6, Lio/sentry/f;->i:Ljava/lang/String;

    .line 124
    const-string v9, "network.event"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1b

    .line 125
    invoke-virtual {v6}, Lio/sentry/f;->b()Ljava/util/Map;

    move-result-object v6

    .line 126
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "action"

    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_1a

    move-object v6, v15

    :cond_1a
    const-string v8, "NETWORK_AVAILABLE"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    .line 127
    iget-object v6, v7, Lio/sentry/f;->i:Ljava/lang/String;

    .line 128
    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    .line 129
    invoke-virtual {v7}, Lio/sentry/f;->b()Ljava/util/Map;

    move-result-object v6

    .line 130
    const-string v8, "network_type"

    invoke-interface {v6, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    .line 131
    invoke-virtual {v7}, Lio/sentry/f;->c()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    const-wide/16 v12, 0x1388

    add-long/2addr v8, v12

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    cmp-long v6, v8, v12

    if-ltz v6, :cond_1b

    const/4 v6, 0x1

    goto :goto_1a

    :cond_1b
    move v6, v11

    .line 132
    :goto_1a
    invoke-virtual {v7}, Lio/sentry/f;->c()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    cmp-long v8, v8, v12

    if-gez v8, :cond_1c

    if-eqz v6, :cond_21

    .line 133
    :cond_1c
    invoke-virtual {v7}, Lio/sentry/f;->c()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    cmp-long v6, v8, v12

    if-gez v6, :cond_21

    .line 134
    invoke-virtual/range {p1 .. p1}, Lio/sentry/m6;->getReplayController()Lio/sentry/v3;

    move-result-object v6

    invoke-interface {v6}, Lio/sentry/v3;->p()Lio/sentry/u3;

    move-result-object v6

    invoke-interface {v6, v7}, Lio/sentry/u3;->a(Lio/sentry/f;)Lio/sentry/rrweb/b;

    move-result-object v6

    if-eqz v6, :cond_21

    .line 135
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    instance-of v8, v6, Lio/sentry/rrweb/a;

    if-eqz v8, :cond_1d

    move-object v8, v6

    check-cast v8, Lio/sentry/rrweb/a;

    goto :goto_1b

    :cond_1d
    move-object v8, v15

    :goto_1b
    if-eqz v8, :cond_1e

    .line 137
    iget-object v8, v8, Lio/sentry/rrweb/a;->f:Ljava/lang/String;

    goto :goto_1c

    :cond_1e
    move-object v8, v15

    .line 138
    :goto_1c
    const-string v9, "navigation"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_21

    .line 139
    check-cast v6, Lio/sentry/rrweb/a;

    .line 140
    iget-object v8, v6, Lio/sentry/rrweb/a;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 141
    const-string v9, "to"

    if-eqz v8, :cond_1f

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_20

    :cond_1f
    move-object v8, v15

    :cond_20
    instance-of v8, v8, Ljava/lang/String;

    if-eqz v8, :cond_21

    .line 142
    iget-object v6, v6, Lio/sentry/rrweb/a;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 143
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_21
    move-object v6, v7

    goto/16 :goto_19

    :cond_22
    if-eqz p13, :cond_23

    .line 144
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v12, p13

    invoke-static {v1, v12}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    .line 145
    invoke-virtual {v0, v12}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 146
    :cond_23
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    new-instance v1, Loc;

    const/16 v7, 0x13

    invoke-direct {v1, v7, v2, v3}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 147
    invoke-interface/range {p15 .. p15}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    :cond_24
    :goto_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_25

    .line 149
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/rrweb/b;

    .line 150
    iget-wide v8, v7, Lio/sentry/rrweb/b;->b:J

    cmp-long v8, v8, v5

    if-gez v8, :cond_24

    .line 151
    invoke-virtual {v1, v7}, Loc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1d

    :cond_25
    if-nez v4, :cond_29

    .line 153
    new-instance v1, Lio/sentry/rrweb/k;

    .line 154
    sget-object v2, Lio/sentry/rrweb/c;->Custom:Lio/sentry/rrweb/c;

    invoke-direct {v1, v2}, Lio/sentry/rrweb/b;-><init>(Lio/sentry/rrweb/c;)V

    .line 155
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Lio/sentry/rrweb/k;->d:Ljava/util/HashMap;

    .line 156
    const-string v5, "options"

    iput-object v5, v1, Lio/sentry/rrweb/k;->c:Ljava/lang/String;

    .line 157
    invoke-virtual/range {p1 .. p1}, Lio/sentry/m6;->getSdkVersion()Lio/sentry/protocol/u;

    move-result-object v5

    if-eqz v5, :cond_26

    .line 158
    const-string v6, "nativeSdkName"

    .line 159
    iget-object v7, v5, Lio/sentry/protocol/u;->a:Ljava/lang/String;

    .line 160
    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    const-string v6, "nativeSdkVersion"

    .line 162
    iget-object v5, v5, Lio/sentry/protocol/u;->b:Ljava/lang/String;

    .line 163
    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    :cond_26
    invoke-virtual/range {p1 .. p1}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    move-result-object v5

    .line 165
    iget-object v6, v5, Lio/sentry/q6;->e:Ljava/lang/Double;

    iget-object v7, v5, Lta;->a:Ljava/lang/Object;

    check-cast v7, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 166
    const-string v8, "errorSampleRate"

    invoke-virtual {v2, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    const-string v6, "sessionSampleRate"

    .line 168
    iget-object v8, v5, Lio/sentry/q6;->d:Ljava/lang/Double;

    .line 169
    invoke-virtual {v2, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    const-string v6, "android.widget.ImageView"

    invoke-virtual {v7, v6}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 171
    const-string v8, "maskAllImages"

    invoke-virtual {v2, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    const-string v6, "android.widget.TextView"

    invoke-virtual {v7, v6}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 173
    const-string v8, "maskAllText"

    invoke-virtual {v2, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    iget-object v6, v5, Lio/sentry/q6;->f:Lio/sentry/p6;

    .line 175
    invoke-virtual {v6}, Lio/sentry/p6;->serializedName()Ljava/lang/String;

    move-result-object v6

    const-string v8, "quality"

    invoke-virtual {v2, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    const-string v6, "maskedViewClasses"

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    iget-object v6, v5, Lta;->b:Ljava/lang/Object;

    check-cast v6, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 178
    const-string v7, "unmaskedViewClasses"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    iget-object v6, v5, Lio/sentry/q6;->n:Lio/sentry/i4;

    .line 180
    sget-object v7, Lio/sentry/i4;->PIXEL_COPY:Lio/sentry/i4;

    if-ne v6, v7, :cond_27

    .line 181
    const-string v6, "pixelCopy"

    goto :goto_1e

    .line 182
    :cond_27
    const-string v6, "canvas"

    .line 183
    :goto_1e
    const-string v7, "screenshotStrategy"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    iget-object v6, v5, Lio/sentry/q6;->p:Ljava/util/List;

    .line 185
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    const/4 v10, 0x1

    xor-int/2addr v6, v10

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 186
    const-string v7, "networkDetailHasUrls"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    iget-object v6, v5, Lio/sentry/q6;->p:Ljava/util/List;

    .line 188
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_28

    .line 189
    const-string v6, "networkDetailAllowUrls"

    .line 190
    iget-object v7, v5, Lio/sentry/q6;->p:Ljava/util/List;

    .line 191
    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    const-string v6, "networkRequestHeaders"

    .line 193
    iget-object v7, v5, Lio/sentry/q6;->s:Ljava/util/List;

    .line 194
    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    const-string v6, "networkResponseHeaders"

    .line 196
    iget-object v7, v5, Lio/sentry/q6;->t:Ljava/util/List;

    .line 197
    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    iget-boolean v6, v5, Lio/sentry/q6;->r:Z

    .line 199
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const-string v7, "networkCaptureBodies"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    iget-object v6, v5, Lio/sentry/q6;->q:Ljava/util/List;

    .line 201
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_28

    .line 202
    const-string v6, "networkDetailDenyUrls"

    .line 203
    iget-object v5, v5, Lio/sentry/q6;->q:Ljava/util/List;

    .line 204
    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    :cond_28
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    :cond_29
    new-instance v1, Lio/sentry/x3;

    .line 207
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 208
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 209
    iput-object v2, v1, Lio/sentry/x3;->a:Ljava/lang/Integer;

    .line 210
    new-instance v2, Lio/sentry/android/replay/capture/h;

    .line 211
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 212
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->E(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    .line 213
    iput-object v2, v1, Lio/sentry/x3;->b:Ljava/util/List;

    move-object/from16 v2, p0

    .line 214
    iput-object v0, v2, Lio/sentry/o6;->h0:Ljava/util/List;

    .line 215
    new-instance v0, Lio/sentry/android/replay/capture/j;

    invoke-direct {v0, v2, v1}, Lio/sentry/android/replay/capture/j;-><init>(Lio/sentry/o6;Lio/sentry/x3;)V

    return-object v0

    .line 216
    :goto_1f
    :try_start_10
    throw v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    :catchall_b
    move-exception v0

    invoke-static {v5, v1}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :goto_20
    move-object v1, v0

    goto :goto_21

    :catchall_c
    move-exception v0

    move-object/from16 v5, v24

    goto :goto_20

    :catchall_d
    move-exception v0

    move-object v5, v10

    goto :goto_20

    .line 217
    :goto_21
    :try_start_11
    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_e

    :catchall_e
    move-exception v0

    invoke-static {v5, v1}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :catchall_f
    move-exception v0

    move-object v11, v5

    move-object v1, v0

    .line 218
    :goto_22
    :try_start_12
    throw v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_10

    :catchall_10
    move-exception v0

    invoke-static {v11, v1}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    .line 219
    :cond_2a
    :goto_23
    sget-object v0, Lio/sentry/android/replay/capture/k;->a:Lio/sentry/android/replay/capture/k;

    return-object v0
.end method
