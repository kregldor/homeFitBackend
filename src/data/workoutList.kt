package com.example.data

import com.example.data.Workout

// Quelle workout: https://www.nhs.uk/live-well/exercise/10-minute-home-cardio-workout/
// Quelle other pics: https://www.freepik.com/free-photo/young-healthy-man-athlete-doing-balance-exercises-squats-gym-single-model-practicing-hard-training-his-lower-body-concept-healthy-lifestyle-sport-fitness-bodybuilding-wellbeing_12836365.htm#query=fitness++gym++bodybuilding&position=39

val workoutList = listOf(
    Workout(
        "Cardio",
        30,
        Level.BEGINNER,
        Type.FULL_BODY,
        "...",
        image = "https://image.freepik.com/free-photo/girlfriends-doing-squatting-with-trx-system_7502-6996.jpg",
        steps = listOf(
            Step(
                "Knee lift",
                3,
                30,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_knee-lifts_1_3P2A1499.width-1534.jpg",
                "stand tall and bring up alternate knees to touch the opposite hand and keep your abs tight and back straight"
            ),
            Step(
                "Knee bends",
                1,
                10,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_knee-bends_2_3P2A1515.width-1534.jpg",
                "stand with your feet shoulder-width apart and your hands stretched out,  lower yourself no more than 10cm by bending your knees"
            ),
            Step(
                "Rocket jumps",
                2,
                15,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_rocket-jumps_2_3P2A1522.width-1534_8jVGJW5.jpg",
                "stand with your feet hip-width apart, legs bent and hands on your thighs\n" +
                        "\n" +
                        "jump up, driving your hands straight above your head and extending your entire body"
            ),
            Step(
                "Star jumps",
                2,
                15,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_star-jumps-2_3P2A1528.width-1534_OSChaB4.jpg",
                "stand tall with your arms by your side and knees slightly bent\n" +
                        "\n" +
                        "jump up, extending your arms and legs out into a star shape in the air"
            ),
            Step(
                "Squats",
                1,
                20,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0118_squats_2.width-1534_cg4JlbO.jpg"
            ),
            Step(
                "Tap backs",
                2,
                15,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_tap-backs_3P2A1533.width-1534_9MvMW3x.jpg",
                "step your right leg back and swing both arms forward, then repeat with the opposite leg in a continuous rhythmic movement"
            ),
            Step(
                "Burpees",
                4,
                4,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_burpess.width-1534_eTihGLH.jpg",
                "do a burpee from a standing position (1), drop into a squat with your hands on the ground (2) \n" +
                        "\n" +
                        "kick your feet back into a push-up position (3), jump your feet back into a squat (4) and jump up with your arms extending overhead (5)"
            )
        )
    ),
    Workout(
        "Body shaping",
        45,
        Level.BEGINNER,
        Type.FULL_BODY,
        "Stay fit with this short but hard workout",
        image = "https://image.freepik.com/free-photo/young-fitness-man-studio_7502-5008.jpg",
        steps = listOf(
            Step(
                "Squats",
                3,
                15,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0118_squats_2.width-1534_cg4JlbO.jpg"

            ),
            Step(
                "Lunges",
                2,
                15,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0118_lunge_2.width-1534.jpg",
                "stand in a split stance, with your right leg forward and left leg back \n" +
                        "\n" +
                        "Slowly bend the knees, lowering into a lunge until both legs are nearly at right angles"

            ),
            Step(
                "Calf raises",
                4,
                12,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_calf-raise-2_3P2A1576.width-1534.jpg"
            ),
            Step(
                "Bridges",
                2,
                20,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_bridges_3P2A1582_cBmnGbl.width-1534.jpg",
                "lie on your back with your knees bent and heels close to your bottom \n" +
                        "\n" +
                        "your feet should be shoulder-width apart and flat on the floor, raise your hips up to create a straight line from knees to shoulders"
            ),
            Step(
                "Obliques",
                3,
                10,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_obliques_3P2A1585.width-1534.jpg",
                "lie down on your back with your knees bent and together, and feet off the floor. Place your right hand behind your right ear and extend the left arm out \n " +
                        "\n" +
                        "lift your shoulder blades off the floor and curl your upper body diagonally across your chest towards your left knee and lower down"
            ),
            Step(
                "Back raises",
                2,
                20,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_back-raise_3P2A1570.width-1534.jpg"
            ),
        )
    ),
    Workout(
        "Push - pull",
        40,
        Level.BEGINNER,
        Type.UPPER_BODY,
        "Train your biggest muscle chains",
        image = "https://image.freepik.com/free-photo/bodybuilder-training-arm-with-resistance-band_7502-4758.jpg",
        steps = listOf(
            Step(
                "Press-up",
                3,
                12,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_three-quarter-press-ups_3P2A1547.width-1534.jpg"
            ),
            Step(
                "Triceps dip",
                2,
                15,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_tricep-dip_3P2A1556.width-1534.jpg"
            ),
            Step(
                "Shoulder press",
                3,
                20,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_shoulder-press_2_3P2A1684.width-1534.jpg"
            ),
            Step(
                "Shoulder press with lunge",
                2,
                12,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_shoulder-press-lunge_2_3P2A1698.width-1534.jpg"
            ),
            Step(
                "Bicep curl",
                4,
                10,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_bicep-curl_2_3P2A1686.width-1534.jpg"
            ),
            Step(
                "Lateral rise",
                2,
                22,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_lateral-raise_2_3P2A1691.width-1534.jpg"
            ),
            Step(
                "Stomach crunch",
                4,
                12,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_stomach-crunch_3P2A1590.width-1534.jpg"
            ),
            Step(
                "Back raises",
                2,
                20,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_back-raise_3P2A1570.width-1534.jpg"
            )
        )
    ),
    Workout(
        "Sixpack day",
        30,
        Level.BEGINNER,
        Type.FULL_BODY,
        "Building the beach body",
        image = "https://image.freepik.com/free-photo/brunette-woman-doing-battle-rope-training_7502-4793.jpg",
        steps = listOf(
            Step("Stomach crunch",
            5,
            10,
            "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_stomach-crunch_3P2A1590.width-1534.jpg",
            "Slowly curl up towards your knees until your shoulders are about 3 inches off the floor. Hold the position for a few seconds and lower down slowly."
            ),
            Step(
                "Oblique crunch",
                4,
                12,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_oblique-crunch_3P2A1593.width-1534.jpg",
                "Lie on your back, knees bent and feet flat on the floor, hip-width apart. Roll your knees to one side down to the floor. Place your hands across your chest or behind your ears.\n" +
                        "\n" +
                        "Slowly curl up towards your hips until your shoulders are about 3 inches off the floor."

            ),
            Step(
                "Plank",
                3,
                30,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_plank_3P2A1596.width-1534.jpg"
            ),
            Step(
                "Side plank",
                3,
                30,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_side-plank_3P2A1604.width-1534.jpg"
            ),
            Step(
                "Stomach crunch with legs raised",
                4,
                15,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_stomach-crunch-legs-raised_3P2A1607.width-1534.jpg",
                "Lie on your back with your knees bent and feet flat on the floor, hip-width apart. Place your hands across your chest.\n" +
                        "\n" +
                        "Slowly pull your knees into your chest, keeping them bent at 90 degrees, until your buttocks and tailbone come off the floor. Hold the position for a moment and lower down slowly."
            )
        )
    ),
    Workout(
        "Arms",
        60,
        Level.ADVANCED,
        Type.UPPER_BODY,
        "Arms exercies",
        image = "https://image.freepik.com/free-photo/young-healthy-man-athlete-doing-balance-exercises-squats-gym-single-model-practicing-hard-training-his-lower-body-concept-healthy-lifestyle-sport-fitness-bodybuilding-wellbeing_155003-27887.jpg",
        steps = listOf(
            Step(
                "Press-ups",
                5,
                12,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_full-press-up_3P2A1551.original.width-1534.jpg"
            ),
            Step(
                "Close-grip wall push-ups",
                5,
                12,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_wall-press_2_3P2A1678.width-1534.jpg",
                "Stand at arm's length (or further for more difficulty) from a wall. Place your hands on the wall at chest height and shoulder-width apart or closer. A closer grip will work your triceps harder. With elbows tucked in, bend your arms to lower your body towards the wall. "
            ),
            Step("Bench dips",
            3,
            20,
            "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_bench-dip_3P2A1618.width-1534.jpg",
            "Sit on a stable chair with your hands gripping the edges either side of you. Inch your feet forwards to lift your bottom off the chair. Keep your knees hip-width apart and bent at 90 degrees. Lower yourself by bending your arms to about 90 degrees, keeping your elbows tucked in."
            ),
            Step(
                "Tricep kickbacks",
                4,
                25,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_tricep-kickbacks_2_3P2A1621.width-1534.jpg",
                "Kneel down on your right knee and lean forwards. Raise your elbow behind you, keeping the arm bent at about 90 degrees. Straighten your left elbow to raise your arm behind you as far as feels comfortable."
            )
        )
    ),
    Workout(
        "Gluteus maximus & hamstrings training",
        45,
        Level.ADVANCED,
        Type.LOWER_BODY,
        "Best workout after an office day",
        image = "https://image.freepik.com/free-photo/muscular-man-doing-push-ups-one-hand_7502-4775.jpg",
        steps = listOf(
            Step(
                "Squats",
                3,
                15,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0118_squats_2.width-1534_cg4JlbO.jpg"

            ),
            Step(
                "Side-lying leg raise",
                4,
                20,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_side-lying-leg-raise_3P2A1629.width-1534.jpg",
                "Lie on your right-hand side with your right knee bent at 90 degrees, and your left leg straight and in line with your back.\n" +
                        "\n" +
                        "Press your left fingers into the top of your buttock to keep your left hip slightly tilting forward. Raise your left leg as far as you can without letting your hips tilt back. Slowly lower to the starting position."
            ),
            Step(
                "Bridges",
                6,
                10,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_bridges_3P2A1582_cBmnGbl.width-1534.jpg"
            ),
            Step(
                "One-leg kickbacks",
                4,
                14,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0318_one-leg-kickback_3P2A1634.width-1534.jpg"
            ),
            Step(
                "Lunges",
                2,
                15,
                "https://assets.nhs.uk/nhsuk-cms/images/NHSC_0118_lunge_2.width-1534.jpg",
                "stand in a split stance, with your right leg forward and left leg back \n" +
                        "\n" +
                        "Slowly bend the knees, lowering into a lunge until both legs are nearly at right angles"

            ),
        )
    )
)