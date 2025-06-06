        if (days > 0) {
            components.add(days + (days == 1 ? " day" : " days"));
        }
        if (hours > 0) {
            components.add(hours + (hours == 1 ? " hour" : " hours"));
        }
        if (minutes > 0) {
            components.add(minutes + (minutes == 1 ? " minute" : " minutes"));
        }
        if (seconds > 0) {
            components.add(seconds + (seconds == 1 ? " second" : " seconds"));
        }
​
        if (components.size() == 1) {
            return components.get(0);
        } else if (components.size() == 2) {
            return components.get(0) + " and " + components.get(1);
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < components.size() - 2; i++) {
                result.append(components.get(i)).append(", ");
            }
            result.append(components.get(components.size() - 2))
                    .append(" and ")
                    .append(components.get(components.size() - 1));
            return result.toString();
        }
    }
}